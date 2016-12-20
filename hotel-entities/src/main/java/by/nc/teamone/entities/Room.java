package by.nc.teamone.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

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

	@OneToOne(targetEntity = Status.class)
	@JoinColumn(name = "status_id")
	private Status status;

	@OneToOne(targetEntity = Type.class)
	@JoinColumn(name = "type_id")
	private Type type;

	@Column(name = "coast")
	private int coast;

	@OneToMany(mappedBy = "room", fetch = FetchType.LAZY)
	private List<UserRoom> userRooms;

	@OneToMany(mappedBy="room")
	private List<Image> imageList;

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

	public List<Image> getImageList() {
		return imageList;
	}

	public void setImageList(List<Image> imageList) {
		this.imageList = imageList;
	}

	public int getCoast() {
		return coast;
	}

	public void setCoast(int coast) {
		this.coast = coast;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Room room = (Room) o;

		if (id != room.id) return false;
		if (seats != room.seats) return false;
		if (coast != room.coast) return false;
		if (status != null ? !status.equals(room.status) : room.status != null) return false;
		if (type != null ? !type.equals(room.type) : room.type != null) return false;
		if (userRooms != null ? !userRooms.equals(room.userRooms) : room.userRooms != null) return false;
		if (imageList != null ? !imageList.equals(room.imageList) : room.imageList != null) return false;
		return equipmentList != null ? equipmentList.equals(room.equipmentList) : room.equipmentList == null;

	}

	@Override
	public int hashCode() {
		int result = id;
		result = 31 * result + seats;
		result = 31 * result + (status != null ? status.hashCode() : 0);
		result = 31 * result + (type != null ? type.hashCode() : 0);
		result = 31 * result + coast;
		result = 31 * result + (userRooms != null ? userRooms.hashCode() : 0);
		result = 31 * result + (imageList != null ? imageList.hashCode() : 0);
		result = 31 * result + (equipmentList != null ? equipmentList.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "Room [id=" + id + ", seats=" + seats + ", status=" + status + ", type=" + type + ", userRooms="
				+ userRooms + ", imageList=" + imageList + ", equipmentList=" + equipmentList + "]";
	}

}