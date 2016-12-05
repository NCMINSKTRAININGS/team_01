package by.nc.teamone.entities;

import javax.persistence.*;
<<<<<<< HEAD

/**
 * Created by Valeria on 04.12.2016.
 */

@Entity
@Table(name="room")
public class Room {

    public Room() {
    }

=======
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
>>>>>>> a6d92c00b7f9acf34601d275609a2bfcfb66eb23
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;

    @Column(name="seats")
    private int seats;

    @OneToOne
    @JoinColumn(name = "status_id")
<<<<<<< HEAD
    private Status statusId;
=======
    private Status status;
>>>>>>> a6d92c00b7f9acf34601d275609a2bfcfb66eb23

    @OneToOne
    @JoinColumn(name = "type_id")
    private Type type;

<<<<<<< HEAD
=======
    @OneToMany(mappedBy = "room", fetch = FetchType.LAZY)
    private List<UserRoom> userRooms = new ArrayList<UserRoom>();

    public  List<UserRoom> getUserRooms() {
        return userRooms;
    }

    public void setUserRooms(List<UserRoom> userRooms) {
        this.userRooms = userRooms;
    }

>>>>>>> a6d92c00b7f9acf34601d275609a2bfcfb66eb23
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

<<<<<<< HEAD
    public Status getStatusId() {
        return statusId;
    }

    public void setStatusId(Status statusId) {
        this.statusId = statusId;
    }

    public Type getTypeId() {
        return type;
    }

    public void setTypeId(Type typeId) {
        this.type = typeId;
=======
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
>>>>>>> a6d92c00b7f9acf34601d275609a2bfcfb66eb23
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Room room = (Room) o;

        if (id != room.id) return false;
        if (seats != room.seats) return false;
<<<<<<< HEAD
        if (statusId != null ? !statusId.equals(room.statusId) : room.statusId != null) return false;
=======
        if (status != null ? !status.equals(room.status) : room.status != null) return false;
>>>>>>> a6d92c00b7f9acf34601d275609a2bfcfb66eb23
        return type != null ? type.equals(room.type) : room.type == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + seats;
<<<<<<< HEAD
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
=======
        result = 31 * result + (status != null ? status.hashCode() : 0);
>>>>>>> a6d92c00b7f9acf34601d275609a2bfcfb66eb23
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", seats=" + seats +
<<<<<<< HEAD
                ", statusId=" + statusId +
                ", typeId=" + type +
                '}';
    }
}
=======
                ", status=" + status +
                ", type=" + type +
                '}';
    }
}
>>>>>>> a6d92c00b7f9acf34601d275609a2bfcfb66eb23
