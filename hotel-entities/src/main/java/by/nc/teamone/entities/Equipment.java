package by.nc.teamone.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="equipment")
public class Equipment implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;
	
	@Column(name="name_en")
	private String nameEn;
	
	@Column(name="name_ru")
	private String nameRu;
	
	@ManyToMany(mappedBy="equipmentList")
	private List<Room> roomList;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameEn() {
		return nameEn;
	}

	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}

	public String getNameRu() {
		return nameRu;
	}

	public void setNameRu(String nameRu) {
		this.nameRu = nameRu;
	}

	public List<Room> getRoomList() {
		return roomList;
	}

	public void setRoomList(List<Room> roomList) {
		this.roomList = roomList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((nameEn == null) ? 0 : nameEn.hashCode());
		result = prime * result + ((nameRu == null) ? 0 : nameRu.hashCode());
		result = prime * result + ((roomList == null) ? 0 : roomList.hashCode());
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
		Equipment other = (Equipment) obj;
		if (id != other.id)
			return false;
		if (nameEn == null) {
			if (other.nameEn != null)
				return false;
		} else if (!nameEn.equals(other.nameEn))
			return false;
		if (nameRu == null) {
			if (other.nameRu != null)
				return false;
		} else if (!nameRu.equals(other.nameRu))
			return false;
		if (roomList == null) {
			if (other.roomList != null)
				return false;
		} else if (!roomList.equals(other.roomList))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Equipment [id=" + id + ", nameEn=" + nameEn + ", nameRu=" + nameRu + ", roomList=" + roomList + "]";
	}
}
