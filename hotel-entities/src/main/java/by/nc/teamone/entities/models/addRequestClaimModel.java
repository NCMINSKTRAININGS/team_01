package by.nc.teamone.entities.models;

import by.nc.teamone.entities.Type;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;


public class addRequestClaimModel {

    public List<Type> listTypes = new ArrayList<Type>();
    public String name;
    public String command;

    @JsonCreator
    public addRequestClaimModel(@JsonProperty("types") List<Type> types,
                                @JsonProperty("userCommand") String userCommand,
                                @JsonProperty("name") String userName
    ){
        this.listTypes = types;
        this.name = userName;
        this.command = userCommand;
    }

}
