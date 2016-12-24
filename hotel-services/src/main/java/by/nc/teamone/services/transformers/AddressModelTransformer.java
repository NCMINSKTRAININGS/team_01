package by.nc.teamone.services.transformers;


import by.nc.teamone.entities.Address;
import by.nc.teamone.entities.models.AddressModel;
import org.springframework.stereotype.Repository;

@Repository
public class AddressModelTransformer {
    public AddressModel buildEntity (Address address){
        AddressModel addressModel = new AddressModel();
        addressModel.id = address.getId();
        addressModel.streetEn = address.getStreetEn();
        addressModel.streetRu = address.getStreetRu();
        addressModel.number = address.getNumber();
        return addressModel;
    }

}
