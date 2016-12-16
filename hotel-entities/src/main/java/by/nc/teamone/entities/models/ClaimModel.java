package by.nc.teamone.entities.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ClaimModel {

    public String checkInDate;
    public String checkOutDate;
    public Long type;
    public String login;


    @JsonCreator
    public ClaimModel(@JsonProperty("checkInDate")String checkInDate,
                      @JsonProperty("checkOutDate")String checkOutDate ,
                      @JsonProperty("type_room") Long type,
                      @JsonProperty("login") String login)
    {
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.type = type;
        this.login = login;
    }

}
