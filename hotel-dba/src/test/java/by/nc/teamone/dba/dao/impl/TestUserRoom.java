package by.nc.teamone.dba.dao.impl;

import by.nc.teamone.dba.dao.*;
import by.nc.teamone.entities.Room;
import by.nc.teamone.entities.User;
import by.nc.teamone.entities.UserRoom;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Transactional(transactionManager = "txManager")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/test-config.xml"})
public class TestUserRoom implements ITestDAO{

    @Autowired
    IUserRoomDAO userRoomDAO;

    @Autowired
    IUserDAO userDAO;

    @Autowired
    IRoomDAO roomDAO;

    @Autowired
    IClaimStatusDAO claimStatusDAO;

    private UserRoom userRoom1;
    private UserRoom userRoom2;
    private User user;
    private Room room1;
    private Room room2;

    @Override
    @Before
    public void setValues() {
        userRoom1 = new UserRoom();

        userRoom1.setClaimStatus(claimStatusDAO.get(1L));
        userRoom1.setCheckInDate(new Date());
        userRoom1.setCheckOutDate(new Date());
        room1 = new Room();
        roomDAO.add(room1);
        user = new User();
        userRoom1.setRoom(room1);
        userDAO.add(user);
        userRoom1.setUser(user);

        userRoom2 = new UserRoom();
        userRoom2.setClaimStatus(claimStatusDAO.get(2L));
        userRoom2.setCheckInDate(new Date());
        userRoom2.setCheckOutDate(new Date());
        room2 = new Room();
        userRoom2.setRoom(room2);
        userDAO.add(user);
        userRoom2.setUser(user);
        roomDAO.add(room2);
    }

    @Override
    @After
    public void deleteValues() {
        user = null;
        room1 = null;
        userRoom2 = null;
        userRoom1 = null;
    }

    @Override
    @Test
    public void add() {
        userRoomDAO.add(userRoom1);
        List<UserRoom> listUserRoom = userRoomDAO.getAll();
        Assert.assertEquals(listUserRoom.get(listUserRoom.size()-1), userRoom1);
    }

    @Override
    @Test
    public void delete() {
        userRoomDAO.add(userRoom1);
        userRoomDAO.delete(userRoom1);
        List<UserRoom> listUserRoom = userRoomDAO.getAll();
        for(UserRoom iter:listUserRoom){
            Assert.assertNotEquals(iter, userRoom1);
        }
    }

    @Override
    @Test
    public void getAll() {
        userRoomDAO.add(userRoom1);
        userRoomDAO.add(userRoom2);
        List<UserRoom> listUserRoom = userRoomDAO.getAll();
        Assert.assertEquals(listUserRoom.get(listUserRoom.size()-1), userRoom2);
        Assert.assertEquals(listUserRoom.get(listUserRoom.size()-2), userRoom1);
    }

    @Override
    @Test
    public void update() {
        userRoomDAO.add(userRoom1);
        List<UserRoom> listUserRoom = userRoomDAO.getAll();
        userRoom2 = listUserRoom.get(listUserRoom.size()-1);
        userRoom1.setRoom(room2);
        userRoomDAO.update(userRoom1);
        listUserRoom = userRoomDAO.getAll();
        Assert.assertEquals(listUserRoom.get(listUserRoom.size()-1), userRoom2);
    }
}
