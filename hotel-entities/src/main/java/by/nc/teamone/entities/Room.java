package by.nc.teamone.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="room")
public class Room implements Serializable{

	private static final long serialVersionUID = 1L;

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

    @OneToMany(mappedBy = "room", fetch = FetchType.LAZY)
    private List<UserRoom> userRooms;
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name="room_equipment",
    	joinColumns=@JoinColumn(name="room_id"),
    	inverseJoinColumns=@JoinColumn(name="equipment_id"))
    private List<Equipment> equipmentList;

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
    
    public List<Equipment> getEquipmentList() {
		return equipmentList;
	}

	public void setEquipmentList(List<Equipment> equipmentList) {
		this.equipmentList = equipmentList;
	}


    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Room other = (Room) obj;
		if (equipmentList == null) {
			if (other.equipmentList != null)
				return false;
		} else if (!equipmentList.equals(other.equipmentList))
			return false;
		if (id != other.id)
			return false;
		if (seats != other.seats)
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (userRooms == null) {
			if (other.userRooms != null)
				return false;
		} else if (!userRooms.equals(other.userRooms))
			return false;
		return true;
	}

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((equipmentList == null) ? 0 : equipmentList.hashCode());
		result = prime * result + id;
		result = prime * result + seats;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((userRooms == null) ? 0 : userRooms.hashCode());
		return result;
	}

    @Override
	public String toString() {
		return "Room [id=" + id + ", seats=" + seats + ", status=" + status + ", type=" + type + ", userRooms="
				+ userRooms + ", equipmentList=" + equipmentList + "]";
	}
}