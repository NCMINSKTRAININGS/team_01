package by.nc.teamone.entities.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ClaimModel {

    public String checkInDate;
    public String checkOutDate;
    public Long type;
    public Long id;


    @JsonCreator
    public ClaimModel(@JsonProperty("checkInDate")String checkInDate,
                      @JsonProperty("checkOutDate")String checkOutDate ,
                      @JsonProperty("type_room") Long type,
                      @JsonProperty("login") Long id)
    {
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.type = type;
        this.id = id;
    }

}
