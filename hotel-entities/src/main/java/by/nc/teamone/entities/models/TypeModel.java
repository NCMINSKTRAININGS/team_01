package by.nc.teamone.entities.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TypeModel {

    public Long id;
    public String typeEn;

    @JsonCreator
    public TypeModel(@JsonProperty("id") Long id,
                     @JsonProperty("typeEn") String typeEn

    ){
        this.id = id;
        this.typeEn = typeEn;

    }

}
