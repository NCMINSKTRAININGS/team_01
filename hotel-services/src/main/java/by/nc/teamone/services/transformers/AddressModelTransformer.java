package by.nc.teamone.services.transformers;


import by.nc.teamone.entities.Address;
import by.nc.teamone.entities.models.AddressModel;
import org.springframework.stereotype.Repository;

@Repository
public class AddressModelTransformer {
    public AddressModel buildEntity (Address address){
        AddressModel addressModel = new AddressModel();
        addressModel.setId(address.getId());
        addressModel.setStreetEn(address.getStreetEn());
        addressModel.setStreetRu(address.getStreetRu());
        addressModel.setNumber(address.getNumber());
        return addressModel;
    }

}
