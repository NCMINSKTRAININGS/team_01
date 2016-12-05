package by.nc.teamone.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Asus on 04.12.2016.
 */
@Entity
@Table(name="user_room")
public class UserRoom  implements Serializable{
    @Column(name="check-in_date")
    @Temporal(value=TemporalType.DATE)
    private Date checkInDate;

    @Column(name="check-out_date")
    @Temporal(value=TemporalType.DATE)
    private Date checkOutDate;

    @Id
    @ManyToOne( fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;

    @Id
    @ManyToOne( fetch = FetchType.LAZY)
    @JoinColumn(name="room_id")
    private Room room;

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

    @Override
    public int hashCode() {
        int result = checkInDate != null ? checkInDate.hashCode() : 0;
        result = 31 * result + (checkOutDate != null ? checkOutDate.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        result = 31 * result + (room != null ? room.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserRoom userRoom = (UserRoom) o;

        if (checkInDate != null ? !checkInDate.equals(userRoom.checkInDate) : userRoom.checkInDate != null)
            return false;
        if (checkOutDate != null ? !checkOutDate.equals(userRoom.checkOutDate) : userRoom.checkOutDate != null)
            return false;
        if (user != null ? !user.equals(userRoom.user) : userRoom.user != null) return false;
        return room != null ? room.equals(userRoom.room) : userRoom.room == null;

    }

    @Override
    public String toString() {
        return "UserRoom{" +
                "checkInDate='" + checkInDate + '\'' +
                ", checkOutDate='" + checkOutDate + '\'' +
                ", user='" + user + '\'' +
                ", room='" + room + '\'' +
                '}';
    }


}
