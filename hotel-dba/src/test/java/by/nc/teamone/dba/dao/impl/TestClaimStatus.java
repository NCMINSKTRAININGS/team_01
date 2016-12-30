package by.nc.teamone.dba.dao.impl;

import by.nc.teamone.dba.dao.IClaimStatusDAO;
import by.nc.teamone.dba.dao.ITestDAO;
import by.nc.teamone.entities.ClaimStatus;
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
public class TestClaimStatus implements ITestDAO{
    @Autowired
    IClaimStatusDAO claimStatusDAO;

    private ClaimStatus claimStatus1;
    private ClaimStatus claimStatus2;

    @Override
    @Before
    public void setValues() {
        claimStatus1 = new ClaimStatus();
        claimStatus1.setClaimStatusEn("test");
        claimStatus1.setClaimStatusRu("test");

        claimStatus2 = new ClaimStatus();
        claimStatus2.setClaimStatusEn("test_");
        claimStatus2.setClaimStatusRu("test_");
    }

    @Override
    @After
    public void deleteValues() {
        claimStatus1 = null;

    }

    @Override
    @Test
    public void add() {
        claimStatusDAO.add(claimStatus1);
        Assert.assertEquals(claimStatusDAO.get(claimStatus1.getId()), claimStatus1);
    }

    @Override
    @Test
    public void delete() {
        claimStatusDAO.add(claimStatus1);
        long id = claimStatus1.getId();
        claimStatusDAO.delete(claimStatusDAO.get(claimStatus1.getId()));
        Assert.assertEquals(claimStatusDAO.get(id), null);
    }

    @Override
    @Test
    public void getAll() {
        claimStatusDAO.add(claimStatus1);
        claimStatusDAO.add(claimStatus2);
        long id1 = claimStatus1.getId();
        long id2 = claimStatus2.getId();
        List<ClaimStatus> listType = claimStatusDAO.getAll();
        for(ClaimStatus iter:listType){
            if (iter.getId() == id1)
                Assert.assertEquals(iter, claimStatus1);
            if (iter.getId() == id2)
                Assert.assertEquals(iter, claimStatus2);
        }
    }

    @Override
    @Test
    public void update() {
        claimStatusDAO.add(claimStatus1);
        long id = claimStatus1.getId();
        ClaimStatus result = claimStatusDAO.get(id);
        claimStatus1.setClaimStatusEn("test2");
        claimStatusDAO.update(claimStatus1);
        Assert.assertEquals(result , claimStatusDAO.get(id));
    }
}
