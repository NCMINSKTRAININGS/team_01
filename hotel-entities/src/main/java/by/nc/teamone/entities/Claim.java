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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;

    @OneToOne
    @JoinColumn(name="type_id")
    private Type type;

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
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
        if (user != null ? !user.equals(claim.user) : claim.user != null) return false;
        if (type != null ? !type.equals(claim.type) : claim.type != null) return false;
        if (checkInDate != null ? !checkInDate.equals(claim.checkInDate) : claim.checkInDate != null) return false;
        return checkOutDate != null ? checkOutDate.equals(claim.checkOutDate) : claim.checkOutDate == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (user != null ? user.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (checkInDate != null ? checkInDate.hashCode() : 0);
        result = 31 * result + (checkOutDate != null ? checkOutDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Claim{" +
                "id=" + id +
                ", user=" + user +
                ", type=" + type +
                ", checkInDate=" + checkInDate +
                ", checkOutDate=" + checkOutDate +
                '}';
    }



}
