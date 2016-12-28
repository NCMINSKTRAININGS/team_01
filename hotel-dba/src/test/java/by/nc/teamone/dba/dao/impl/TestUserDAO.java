package by.nc.teamone.dba.dao.impl;

import by.nc.teamone.dba.dao.ITestDAO;
import by.nc.teamone.dba.dao.IUserDAO;
import by.nc.teamone.entities.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@Transactional(transactionManager = "txManager")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/test-config.xml"})
public class TestUserDAO implements ITestDAO {

    @Autowired
    private IUserDAO userDAO;

    private User newUser1;
    private User newUser2;


    @Before
    public void setValues() {
        newUser1 = new User();
        newUser1.setEmail("test_data1");
        newUser1.setMoney(123);
    }

    @Override
    @After
    public void deleteValues() {
        newUser1 = null;
    }

    @Override
    @Test
    public void add() {

    }

    @Override
    @Test
    public void delete() {

    }

    @Override
    @Test
    public void getAll() {

    }

    @Override
    @Test
    public void update() {

    }

}
//
//    @After
//    public void deleteValues(){
//        newClaim1 = null;
//        newClaim2 = null;
//    }
//
//    @Test
//    public void add(){
//        claimDAO.add(newClaim1);
//        ClaimStatus result = claimDAO.get(newClaim1.getId());
//        Assert.assertEquals(Thread.currentThread().getStackTrace()[1].toString(), result , newClaim1);
//    }
//
//    @Test
//    public void delete(){
//        claimDAO.add(newClaim1);
//        long id = newClaim1.getId();
//        claimDAO.delete(newClaim1);
//        ClaimStatus result = claimDAO.get(id);
//        Assert.assertEquals(result, null);
//    }
//
//    @Test
//    public void getAll(){
//        claimDAO.add(newClaim1);
//        claimDAO.add(newClaim2);
//        List<ClaimStatus> listClaim = claimDAO.getAll();
//        Assert.assertEquals(2,listClaim.size());
//        Assert.assertEquals(newClaim1, listClaim.get(0));
//        Assert.assertEquals(newClaim2, listClaim.get(1));
//    }
//
//    @Test
//    public void update(){
//
//       claimDAO.add(newClaim1);
//        long id = newClaim1.getId();
//        ClaimStatus newClaim = claimDAO.get(id);
//        newClaim.setCheckInDate("test2");
//        claimDAO.update(newClaim);
//        Assert.assertEquals(newClaim , claimDAO.get(id));
//    }
//
//}
