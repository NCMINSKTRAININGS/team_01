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

    @OneToOne
    @JoinColumn(name="user_id")
    private User userId;

    @OneToOne
    @JoinColumn(name="room_id")
    private Room roomId;

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Room getRoomId() {
        return roomId;
    }

    public void setRoomId(Room roomId) {
        this.roomId = roomId;
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
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (roomId != null ? roomId.hashCode() : 0);
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
        if (userId != null ? !userId.equals(userRoom.userId) : userRoom.userId != null) return false;
        return roomId != null ? roomId.equals(userRoom.roomId) : userRoom.roomId == null;

    }

    @Override
    public String toString() {
        return "UserRoom{" +
                "checkInDate='" + checkInDate + '\'' +
                ", checkOutDate='" + checkOutDate + '\'' +
                ", userId='" + userId + '\'' +
                ", roomId='" + roomId + '\'' +
                '}';
    }


}
