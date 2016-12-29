package by.nc.teamone.dba.dao.impl;

import by.nc.teamone.dba.dao.ITestDAO;
import by.nc.teamone.dba.dao.IUserDAO;
import by.nc.teamone.entities.User;
import by.nc.teamone.entities.enums.UserRole;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(transactionManager = "txManager")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/test-config.xml"})
public class TestUser implements ITestDAO {

    @Autowired
    private IUserDAO userDAO;

    private User user1;
    private User user2;


    @Before
    public void setValues() {
        user1 = new User();
        user1.setEmail("test_data1");
        user1.setMoney(123);
        user1.setLogin("test_data11");
        user1.setName("test_data1");
        user1.setPhone("test_data1");
        user1.setPassword("test_data1");
        user1.setSurname("test_data1");
        user1.setEnabled(false);
        user2 = new User();
        user1.setRole(UserRole.USER.getRole());
        user2.setEmail("test_data2");
        user2.setMoney(1234);
        user2.setLogin("test_data2");
        user2.setName("test_data2");
        user2.setPhone("test_data2");
        user2.setPassword("test_data2");
        user2.setSurname("test_data2");
        user2.setEnabled(false);
        user2.setRole(UserRole.ADMIN.getRole());

    }

    @Override
    @After
    public void deleteValues() {
        user1 = null;
        user2 = null;
    }

    @Override
    @Test
    public void add() {
        userDAO.add(user1);
        User result = userDAO.get(user1.getId());
        Assert.assertEquals(result , user1);
    }

    @Override
    @Rollback(true)
    @Test
    public void delete() {
        userDAO.add(user1);
        long id = user1.getId();
        userDAO.delete(user1);
        User result = userDAO.get(id);
        Assert.assertEquals(result, null);
    }

    @Override
    @Test
    public void getAll() {
        userDAO.add(user1);
        userDAO.add(user2);
        long id1 = user1.getId();
        long id2 = user2.getId();
        List<User> listUser = userDAO.getAll();
        for(User iter:listUser){
            if (iter.getId() == id1)
                Assert.assertEquals(iter, user1);
            if (iter.getId() == id2)
                Assert.assertEquals(iter, user2);
        }
    }

    @Override
    @Test
    public void update() {
        userDAO.add(user1);
        long id = user1.getId();
        User result = userDAO.get(id);
        user1.setLogin("test2");
        userDAO.update(user1);
        Assert.assertEquals(result , userDAO.get(id));
    }

    @Test
    public void getUserByName(){
        userDAO.add(user1);
        Assert.assertEquals(userDAO.getByLogin(user1.getLogin()),user1);
    }

}
