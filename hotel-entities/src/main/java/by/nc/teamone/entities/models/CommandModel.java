package by.nc.teamone.entities.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CommandModel {
    public String command;
    @JsonCreator
    public CommandModel(@JsonProperty("command") String command)
    {
        this.command = command;
    }
}
