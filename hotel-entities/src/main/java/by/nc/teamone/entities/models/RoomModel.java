package by.nc.teamone.entities.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Valeria on 13.12.2016.
 */
public class RoomModel{
    public int coast;
    public int seats;
    public long type_id;

    @JsonCreator
    public RoomModel(@JsonProperty("coast")int coast,
                     @JsonProperty("seats")int seats,
                     @JsonProperty("type_id")long type_id) {

        this.coast = coast;
        this.seats = seats;
        this.type_id = type_id;

    }

}