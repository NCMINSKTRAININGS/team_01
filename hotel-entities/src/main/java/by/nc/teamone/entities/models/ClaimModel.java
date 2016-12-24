package by.nc.teamone.entities.models;

import by.nc.teamone.entities.Type;

public class ClaimModel {

    public String checkInDate;
    public String checkOutDate;
    public Long type;
    public Long id;
    public String status;
    public Type typeObj; // возможно не понадобиться, потом полечу когда будем на вьюху отображать все claim

    public ClaimModel(){
    }

    public String getStatus() {
        return status;
    }


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

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Type getTypeObj() {
        return typeObj;
    }

    public void setTypeObj(Type typeObj) {
        this.typeObj = typeObj;
    }

    @Override
    public String toString() {
        return "ClaimModel{" +
                "checkInDate='" + checkInDate + '\'' +
                ", checkOutDate='" + checkOutDate + '\'' +
                ", type=" + type +
                ", id=" + id +
                ", typeObj=" + typeObj +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClaimModel that = (ClaimModel) o;

        if (checkInDate != null ? !checkInDate.equals(that.checkInDate) : that.checkInDate != null) return false;
        if (checkOutDate != null ? !checkOutDate.equals(that.checkOutDate) : that.checkOutDate != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        return typeObj != null ? typeObj.equals(that.typeObj) : that.typeObj == null;

    }

    @Override
    public int hashCode() {
        int result = checkInDate != null ? checkInDate.hashCode() : 0;
        result = 31 * result + (checkOutDate != null ? checkOutDate.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (typeObj != null ? typeObj.hashCode() : 0);
        return result;
    }


    public void setStatus(String status) {
        this.status = status;
    }
}
