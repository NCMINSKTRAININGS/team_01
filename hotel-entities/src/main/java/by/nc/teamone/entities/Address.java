package by.nc.teamone.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "address")
public class Address implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="street_en")
    private String streetEn;

    @Column(name="street_ru")
    private String streetRu;

    @Column(name="number_house")
    private Long number;

    @OneToMany(mappedBy = "address", fetch = FetchType.LAZY)
    private List<Room> rooms;

    public String getStreetEn() {
        return streetEn;
    }

    public void setStreetEn(String streetEn) {
        this.streetEn = streetEn;
    }

    public String getStreetRu() {
        return streetRu;
    }

    public void setStreetRu(String streetRu) {
        this.streetRu = streetRu;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (streetEn != null ? !streetEn.equals(address.streetEn) : address.streetEn != null) return false;
        if (streetRu != null ? !streetRu.equals(address.streetRu) : address.streetRu != null) return false;
        if (number != null ? !number.equals(address.number) : address.number != null) return false;
        return rooms != null ? rooms.equals(address.rooms) : address.rooms == null;

    }

    @Override
    public int hashCode() {
        int result = streetEn != null ? streetEn.hashCode() : 0;
        result = 31 * result + (streetRu != null ? streetRu.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (rooms != null ? rooms.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetEn='" + streetEn + '\'' +
                ", streetRu='" + streetRu + '\'' +
                ", number=" + number +
                ", rooms=" + rooms +
                '}';
    }

}
