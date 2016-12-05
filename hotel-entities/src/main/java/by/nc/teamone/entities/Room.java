package by.nc.teamone.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus on 05.12.2016.
 */
@Entity
@Table(name="room")
public class Room {
    public Room() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;

    @Column(name="seats")
    private int seats;

    @OneToOne
    @JoinColumn(name = "status_id")
    private Status status;

    @OneToOne
    @JoinColumn(name = "type_id")
    private Type type;


    private List<UserRoom> userRooms = new ArrayList<UserRoom>();

    @OneToMany(mappedBy = "room", fetch = FetchType.LAZY)
    public  List<UserRoom> getUserRooms() {
        return userRooms;
    }

    public void setUserRooms(List<UserRoom> userRooms) {
        this.userRooms = userRooms;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Room room = (Room) o;

        if (id != room.id) return false;
        if (seats != room.seats) return false;
        if (status != null ? !status.equals(room.status) : room.status != null) return false;
        return type != null ? type.equals(room.type) : room.type == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + seats;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", seats=" + seats +
                ", status=" + status +
                ", type=" + type +
                '}';
    }
}