package by.nc.teamone.entities.models;

public class UserClaimModel {

    public String checkInDate;
    public String checkOutDate;
    public Long userId;
    public Long roomId;
    
	public String getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(String checkInDate) {
		this.checkInDate = checkInDate;
	}
	public String getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getRoomId() {
		return roomId;
	}
	public void setRoomId(Long roomId) {
		this.roomId = roomId;
	}
	@Override
	public String toString() {
		return "UserClaimModel [checkInDate=" + checkInDate + ", checkOutDate=" + checkOutDate + ", userId=" + userId
				+ ", roomId=" + roomId + "]";
	}
	
	
}
