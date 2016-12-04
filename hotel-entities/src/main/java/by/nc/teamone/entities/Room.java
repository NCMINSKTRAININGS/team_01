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
    private int status_id;

    @OneToOne
    @JoinColumn(name = "type_id")
    private int type_id;

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

    public int getStatus_id() {
        return status_id;
    }

    public void setStatus_id(int status_id) {
        this.status_id = status_id;
    }

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Room room = (Room) o;

        if (id != room.id) return false;
        if (seats != room.seats) return false;
        if (status_id != room.status_id) return false;
        return type_id == room.type_id;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + seats;
        result = 31 * result + status_id;
        result = 31 * result + type_id;
        return result;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", seats=" + seats +
                ", status_id=" + status_id +
                ", type_id=" + type_id +
                '}';
    }
}
