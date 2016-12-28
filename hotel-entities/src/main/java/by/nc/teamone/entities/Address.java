package by.nc.teamone.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "address")
public class Address implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @Column(name="street_en")
    private String streetEn;

    @Column(name="street_ru")
    private String streetRu;

    @Column(name="number_house")
    private int number;

    @OneToMany(mappedBy = "address")
    private List<Room> rooms;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + number;
		result = prime * result + ((rooms == null) ? 0 : rooms.hashCode());
		result = prime * result + ((streetEn == null) ? 0 : streetEn.hashCode());
		result = prime * result + ((streetRu == null) ? 0 : streetRu.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (id != other.id)
			return false;
		if (number != other.number)
			return false;
		if (rooms == null) {
			if (other.rooms != null)
				return false;
		} else if (!rooms.equals(other.rooms))
			return false;
		if (streetEn == null) {
			if (other.streetEn != null)
				return false;
		} else if (!streetEn.equals(other.streetEn))
			return false;
		if (streetRu == null) {
			if (other.streetRu != null)
				return false;
		} else if (!streetRu.equals(other.streetRu))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", streetEn=" + streetEn + ", streetRu=" + streetRu + ", number=" + number
				+ ", rooms=" + rooms + "]";
	}

}
