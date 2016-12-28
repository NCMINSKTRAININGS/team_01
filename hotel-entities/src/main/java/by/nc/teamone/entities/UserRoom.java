package by.nc.teamone.entities;


import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="user_room")
public class UserRoom  implements Serializable{

	private static final long serialVersionUID = 1L;

	@Type(type = "date")
	@Column(name="check_in_date")
    private Date checkInDate;

	@Type(type = "date")
    @Column(name="check_out_date")
    private Date checkOutDate;

    @Id
    @ManyToOne()
    @JoinColumn(name="user_id")
    private User user;

    @Id
    @ManyToOne( )
    @JoinColumn(name="room_id")
    private Room room;
    
    @ManyToOne
	@JoinColumn(name = "claim_id")
    private ClaimStatus claimStatus;

	public Date getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}

	public Date getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public ClaimStatus getClaimStatus() {
		return claimStatus;
	}

	public void setClaimStatus(ClaimStatus claimStatus) {
		this.claimStatus = claimStatus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((checkInDate == null) ? 0 : checkInDate.hashCode());
		result = prime * result + ((checkOutDate == null) ? 0 : checkOutDate.hashCode());
		result = prime * result + ((claimStatus == null) ? 0 : claimStatus.hashCode());
		result = prime * result + ((room == null) ? 0 : room.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		UserRoom other = (UserRoom) obj;
		if (checkInDate == null) {
			if (other.checkInDate != null)
				return false;
		} else if (!checkInDate.equals(other.checkInDate))
			return false;
		if (checkOutDate == null) {
			if (other.checkOutDate != null)
				return false;
		} else if (!checkOutDate.equals(other.checkOutDate))
			return false;
		if (claimStatus == null) {
			if (other.claimStatus != null)
				return false;
		} else if (!claimStatus.equals(other.claimStatus))
			return false;
		if (room == null) {
			if (other.room != null)
				return false;
		} else if (!room.equals(other.room))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserRoom [checkInDate=" + checkInDate + ", checkOutDate=" + checkOutDate + ", user=" + user + ", room="
				+ room + ", claimStatus=" + claimStatus + "]";
	}
}
