package by.nc.teamone.entities;

import javax.persistence.*;

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
    private Status statusId;

    @OneToOne
    @JoinColumn(name = "type_id")
    private Type typeId;

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
        return typeId;
    }

    public void setTypeId(Type typeId) {
        this.typeId = typeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Room room = (Room) o;

        if (id != room.id) return false;
        if (seats != room.seats) return false;
        if (statusId != null ? !statusId.equals(room.statusId) : room.statusId != null) return false;
        return typeId != null ? typeId.equals(room.typeId) : room.typeId == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + seats;
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (typeId != null ? typeId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", seats=" + seats +
                ", statusId=" + statusId +
                ", typeId=" + typeId +
                '}';
    }
}