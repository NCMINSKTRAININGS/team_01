package by.nc.teamone.dba.dao.impl;


import by.nc.teamone.dba.dao.*;
import by.nc.teamone.entities.Room;
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
public class TestRoom implements ITestDAO{

    @Autowired
    IRoomDAO roomDAO;

    @Autowired
    IStatusDAO statusDAO;

    @Autowired
    IClaimStatusDAO claimStatusDAO;

    @Autowired
    ITypeDAO typeDAO;

    private Room room1;
    private Room room2;

    @Override
    @Before
    public void setValues() {
        room1 = new Room();
        room1.setCoast(1234);
        room1.setStatus(statusDAO.get(1L));
        room1.setClaimStatus(claimStatusDAO.get(1L));
        room1.setSeats(1234);
        room1.setType(typeDAO.get(1L));
        room2 = new Room();
        room2.setCoast(4321);
        room2.setStatus(statusDAO.get(2L));
        room2.setClaimStatus(claimStatusDAO.get(2L));
        room2.setSeats(4321);
        room2.setType(typeDAO.get(2L));
    }

    @Override
    @After
    public void deleteValues() {
        room1 = null;
        room2 = null;
    }

    @Override
    @Test
    public void add() {
        roomDAO.add(room1);
        Assert.assertEquals(roomDAO.get(room1.getId()), room1);
        Assert.assertNotNull(room1.getType());
        Assert.assertNotNull(room1.getStatus());
        Assert.assertNotNull(room1.getClaimStatus());
    }

    @Override
    @Test
    public void delete() {
        roomDAO.add(room1);
        long id = room1.getId();
        roomDAO.delete(room1);
        Room result = roomDAO.get(id);
        Assert.assertEquals(result, null);
    }

    @Override
    @Test
    public void getAll() {
        roomDAO.add(room1);
        roomDAO.add(room2);
        long id1 = room1.getId();
        long id2 = room2.getId();
        List<Room> listRoom = roomDAO.getAll();
        for(Room iter:listRoom){
            if (iter.getId() == id1)
                Assert.assertEquals(iter, room1);
            if (iter.getId() == id2)
                Assert.assertEquals(iter, room2);
        }
    }

    @Override
    @Test
    public void update() {
        roomDAO.add(room1);
        long id = room1.getId();
        Room result = roomDAO.get(id);
        room1.setCoast(5412);
        room1.setType(typeDAO.get(3L));
        roomDAO.update(room1);
        Assert.assertEquals(result , roomDAO.get(id));
    }
}
