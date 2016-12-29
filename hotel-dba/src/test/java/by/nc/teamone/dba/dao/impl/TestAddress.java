package by.nc.teamone.dba.dao.impl;

import by.nc.teamone.dba.dao.IAddressDAO;
import by.nc.teamone.dba.dao.ITestDAO;
import by.nc.teamone.entities.Address;
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

public class TestAddress implements ITestDAO {


    @Autowired
    IAddressDAO addressDAO;

    private Address address1;
    private Address address2;

    @Override
    @Before
    public void setValues() {
        address1 = new Address();
        address1.setNumber(1234);
        address1.setStreetEn("test1");
        address1.setStreetRu("test1");
        address2 = new Address();
        address2.setStreetRu("test2");
        address2.setStreetEn("test2");
        address2.setNumber(123);
    }

    @Override
    @After
    public void deleteValues() {
        address1 = null;
        address2 = null;
    }

    @Override
    @Test
    public void add() {
        addressDAO.add(address1);
        Assert.assertEquals(addressDAO.get(address1.getId()), address1);
    }

    @Override
    @Test
    public void delete() {
        addressDAO.add(address1);
        long id = address1.getId();
        addressDAO.delete(address1);
        Address result = addressDAO.get(id);
        Assert.assertEquals(result, null);
    }

    @Override
    @Rollback(true)
    @Test
    public void getAll() {
        addressDAO.add(address1);
        addressDAO.add(address2);
        long id1 = address1.getId();
        long id2 = address2.getId();
        List<Address> listRoom = addressDAO.getAll();
        for(Address iter:listRoom){
            if (iter.getId() == id1)
                Assert.assertEquals(iter, address1);
            if (iter.getId() == id2)
                Assert.assertEquals(iter, address2);
        }
    }

    @Override
    @Test
    public void update() {
        addressDAO.add(address1);
        long id = address1.getId();
        Address result = addressDAO.get(id);
        address1.setNumber(5);
        addressDAO.update(address1);
        Assert.assertEquals(result , addressDAO.get(id));
    }
}
