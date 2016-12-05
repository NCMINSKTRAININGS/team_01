package by.nc.teamone.entities;

import javax.persistence.*;
import java.io.Serializable;

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

}
