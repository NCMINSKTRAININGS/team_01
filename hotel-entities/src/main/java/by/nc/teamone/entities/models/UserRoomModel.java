package by.nc.teamone.entities.models;


import by.nc.teamone.entities.Room;
import by.nc.teamone.entities.User;

import java.util.Date;

public class UserRoomModel {
        public Date checkInDate;
        public Date checkOutDate;
        public User user;
        public Room room;

    public Date getCheckInDate() {
        return checkInDate;
    }
    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }
    public Date getCheckOutDate() {
        return checkOutDate;
    }
    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    public Room getRoom() {
        return room;
    }
    public void setRoom(Room room) {
        this.room = room;
    }
}
