package by.nc.teamone.entities.models;

public class AddressModel {

    private Long id;
    private String streetEn;
    private String streetRu;
    private Long number;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AddressModel that = (AddressModel) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (streetEn != null ? !streetEn.equals(that.streetEn) : that.streetEn != null) return false;
        if (streetRu != null ? !streetRu.equals(that.streetRu) : that.streetRu != null) return false;
        return number != null ? number.equals(that.number) : that.number == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (streetEn != null ? streetEn.hashCode() : 0);
        result = 31 * result + (streetRu != null ? streetRu.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AddressModel{" +
                "id=" + id +
                ", streetEn='" + streetEn + '\'' +
                ", streetRu='" + streetRu + '\'' +
                ", number=" + number +
                '}';
    }
}
