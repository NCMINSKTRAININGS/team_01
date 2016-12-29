package by.nc.teamone.dba.dao.impl;

import by.nc.teamone.dba.dao.IStatusDAO;
import by.nc.teamone.dba.dao.ITestDAO;
import by.nc.teamone.entities.Status;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(transactionManager = "txManager")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/test-config.xml"})
public class TestStatus implements ITestDAO {

    @Autowired
    IStatusDAO statusDAO;

    private Status status1;
    private Status status2;

    @Override
    @Before
    public void setValues() {
        status1 = new Status();
        status1.setStatusEn("test");
        status1.setStatusRu("test");

        status2 = new Status();
        status2.setStatusEn("test_");
        status2.setStatusRu("test_");
    }

    @Override
    @After
    public void deleteValues() {
        status1 = null;

    }

    @Override
    @Test
    public void add() {
        statusDAO.add(status1);
        Assert.assertEquals(statusDAO.get(status1.getId()), status1);
    }

    @Override
    @Test
    public void delete() {
        statusDAO.add(status1);
        long id = status1.getId();
        statusDAO.delete(statusDAO.get(status1.getId()));
        Assert.assertEquals(statusDAO.get(id), null);
    }

    @Override
    @Test
    public void getAll() {
        statusDAO.add(status1);
        statusDAO.add(status2);
        long id1 = status1.getId();
        long id2 = status2.getId();
        List<Status> listType = statusDAO.getAll();
        for (Status iter : listType) {
            if (iter.getId() == id1)
                Assert.assertEquals(iter, status1);
            if (iter.getId() == id2)
                Assert.assertEquals(iter, status2);
        }
    }

    @Override
    @Test
    public void update() {
        statusDAO.add(status1);
        long id = status1.getId();
        Status result = statusDAO.get(id);
        status1.setStatusEn("test2");
        statusDAO.update(status1);
        Assert.assertEquals(result, statusDAO.get(id));
    }
}
