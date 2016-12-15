package by.nc.teamone.entities.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Asus on 15.12.2016.
 */
public class ClaimModel {

    public String checkInDate;
    public String checkOutDate;


    @JsonCreator
    public ClaimModel(@JsonProperty("checkInDate")String checkInDate,
                       @JsonProperty("ckeckOutDate")String checkOutDate)
    {
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

}
