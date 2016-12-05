package by.nc.teamone.entities;

import javax.persistence.*;

/**
 * Created by Valeria on 04.12.2016.
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
    private Status statusId;

    @OneToOne
    @JoinColumn(name = "type_id")
    private Type type;

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
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Room room = (Room) o;

        if (id != room.id) return false;
        if (seats != room.seats) return false;
        if (statusId != null ? !statusId.equals(room.statusId) : room.statusId != null) return false;
        return type != null ? type.equals(room.type) : room.type == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + seats;
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", seats=" + seats +
                ", statusId=" + statusId +
                ", typeId=" + type +
                '}';
    }
}
