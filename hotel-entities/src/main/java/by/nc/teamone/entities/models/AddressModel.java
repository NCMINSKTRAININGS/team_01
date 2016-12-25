package by.nc.teamone.entities.models;

public class AddressModel {

    public long id;
    public String streetEn;
    public String streetRu;
    public int number;
    
    public AddressModel(){
    	
    }
    
	public AddressModel(long id, String streetEn, String streetRu, int number) {
		this.id = id;
		this.streetEn = streetEn;
		this.streetRu = streetRu;
		this.number = number;
	}

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
}
