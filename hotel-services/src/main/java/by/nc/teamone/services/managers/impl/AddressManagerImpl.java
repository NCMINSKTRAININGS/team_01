package by.nc.teamone.services.managers.impl;

import by.nc.teamone.dba.dao.IAddressDAO;
import by.nc.teamone.entities.Address;
import by.nc.teamone.entities.models.AddressModel;
import by.nc.teamone.services.managers.IAddressManager;
import by.nc.teamone.services.transformers.impl.AddressModelTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@Scope("singleton")
public class AddressManagerImpl implements IAddressManager {
    @Autowired
    IAddressDAO addressDao;

    @Autowired
    AddressModelTransformer addressModelTransformer;

    @Override
    public List<AddressModel> getAllAddress() {
        List<Address> listAddress = addressDao.getAll();
        List<AddressModel> addressModelList = new ArrayList<AddressModel>();
        for (Address iter:listAddress) {
            addressModelList.add(addressModelTransformer.buildEntity(iter));
        }
        return addressModelList;
    }
}
