package by.nc.teamone.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="room")
public class Room implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="id")
	private long id;

	@Column(name="seats")
	private int seats;

	@OneToOne
	@JoinColumn(name = "status_id")
	private Status status;

	@OneToOne
	@JoinColumn(name = "type_id")
	private Type type;

	@Column(name = "coast")
	private int coast;

	@OneToOne
	@JoinColumn(name = "claim_id")
    private ClaimStatus claimStatus;

	@ManyToOne
	@JoinColumn(name="address_id")
	private Address address;

	@OneToMany(mappedBy = "room", fetch = FetchType.LAZY)
	private List<UserRoom> userRooms;

	@OneToMany(mappedBy="room")
	private List<Image> imageList;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name="room_equipment",
			joinColumns=@JoinColumn(name="room_id"),
			inverseJoinColumns=@JoinColumn(name="equipment_id"))
	private List<Equipment> equipmentList;

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public int getCoast() {
		return coast;
	}

	public void setCoast(int coast) {
		this.coast = coast;
	}

	public ClaimStatus getClaimStatus() {
		return claimStatus;
	}

	public void setClaimStatus(ClaimStatus claimStatus) {
		this.claimStatus = claimStatus;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<UserRoom> getUserRooms() {
		return userRooms;
	}

	public void setUserRooms(List<UserRoom> userRooms) {
		this.userRooms = userRooms;
	}

	public List<Image> getImageList() {
		return imageList;
	}

	public void setImageList(List<Image> imageList) {
		this.imageList = imageList;
	}

	public List<Equipment> getEquipmentList() {
		return equipmentList;
	}

	public void setEquipmentList(List<Equipment> equipmentList) {
		this.equipmentList = equipmentList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((claimStatus == null) ? 0 : claimStatus.hashCode());
		result = prime * result + coast;
		result = prime * result + ((equipmentList == null) ? 0 : equipmentList.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((imageList == null) ? 0 : imageList.hashCode());
		result = prime * result + seats;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((userRooms == null) ? 0 : userRooms.hashCode());
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
		Room other = (Room) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (claimStatus == null) {
			if (other.claimStatus != null)
				return false;
		} else if (!claimStatus.equals(other.claimStatus))
			return false;
		if (coast != other.coast)
			return false;
		if (equipmentList == null) {
			if (other.equipmentList != null)
				return false;
		} else if (!equipmentList.equals(other.equipmentList))
			return false;
		if (id != other.id)
			return false;
		if (imageList == null) {
			if (other.imageList != null)
				return false;
		} else if (!imageList.equals(other.imageList))
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
	public String toString() {
		return "Room [id=" + id + ", seats=" + seats + ", status=" + status + ", type=" + type + ", coast=" + coast
				+ ", claimStatus=" + claimStatus + ", address=" + address + ", userRooms=" + userRooms + ", imageList="
				+ imageList + ", equipmentList=" + equipmentList + "]";
	}
}