package by.nc.teamone.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Asus on 05.12.2016.
 */

@Entity
@Table(name="claim")
public class Claim  implements Serializable {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne(cascade = {CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User userId;

    @OneToOne
    @JoinColumn(name="type_id")
    private Type roomId;

    @Column(name="check-in_date")
    @Temporal(value=TemporalType.DATE)
    private Date checkInDate;

    @Column(name="check-out_date")
    @Temporal(value=TemporalType.DATE)
    private Date checkOutDate;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Type getRoomId() {
        return roomId;
    }

    public void setRoomId(Type roomId) {
        this.roomId = roomId;
    }

    public void setId(long id) {
        this.id = id;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Claim claim = (Claim) o;

        if (id != claim.id) return false;
        if (userId != null ? !userId.equals(claim.userId) : claim.userId != null) return false;
        if (roomId != null ? !roomId.equals(claim.roomId) : claim.roomId != null) return false;
        if (checkInDate != null ? !checkInDate.equals(claim.checkInDate) : claim.checkInDate != null) return false;
        return checkOutDate != null ? checkOutDate.equals(claim.checkOutDate) : claim.checkOutDate == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (roomId != null ? roomId.hashCode() : 0);
        result = 31 * result + (checkInDate != null ? checkInDate.hashCode() : 0);
        result = 31 * result + (checkOutDate != null ? checkOutDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Claim{" +
                "id=" + id +
                ", userId=" + userId +
                ", roomId=" + roomId +
                ", checkInDate=" + checkInDate +
                ", checkOutDate=" + checkOutDate +
                '}';
    }



}
