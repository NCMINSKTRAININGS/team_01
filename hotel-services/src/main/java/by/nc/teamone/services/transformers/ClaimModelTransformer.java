package by.nc.teamone.services.transformers;

import by.nc.teamone.dba.dao.ITypeDAO;
import by.nc.teamone.dba.dao.IUserDAO;
import by.nc.teamone.entities.Claim;
import by.nc.teamone.entities.User;
import by.nc.teamone.entities.models.ClaimModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class ClaimModelTransformer {

    @Autowired
    ITypeDAO typeDAO;

    @Autowired
    IUserDAO userDAO;

    public Claim buildEntity(ClaimModel claimModel){

        Claim claim = new Claim();
        claim.setCheckInDate(claimModel.checkInDate);
        claim.setCheckOutDate(claimModel.checkOutDate);
        claim.setType(typeDAO.get(claimModel.type));
        User user = userDAO.get(claimModel.id);
        claim.setUser(user);
        user.getClaims().add(claim);
        return claim;
    }
}
