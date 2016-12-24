package by.nc.teamone.entities.models;

/**
 * Created by Valeria on 13.12.2016.
 */
public class RoomModel{
    public int coast;
    public int seats;
    public long type;
    public String streetEn;
    public String streetRu;
    public int number;

    public RoomModel() {
	}

	public RoomModel(int coast, int seats, long type, String streetEn, String streetRu, int number) {
		this.coast = coast;
		this.seats = seats;
		this.type = type;
		this.streetEn = streetEn;
		this.streetRu = streetRu;
		this.number = number;
	}

	

	public int getCoast() {
		return coast;
	}

	public void setCoast(int coast) {
		this.coast = coast;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public long getType() {
		return type;
	}

	public void setType(long type) {
		this.type = type;
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

	@Override
	public String toString() {
		return "RoomModel [coast=" + coast + ", seats=" + seats + ", type=" + type + ", streetEn=" + streetEn
				+ ", streetRu=" + streetRu + ", number=" + number + "]";
	}
	
	
}