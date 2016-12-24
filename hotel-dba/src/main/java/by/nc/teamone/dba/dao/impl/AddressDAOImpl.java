package by.nc.teamone.dba.dao.impl;


import by.nc.teamone.dba.dao.IAddressDAO;
import by.nc.teamone.entities.Address;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;


@Scope("singleton")
@Repository
public class AddressDAOImpl extends BaseDAOImpl<Address, Long> implements IAddressDAO {
    public AddressDAOImpl() {
        super(Address.class);
    }

}
