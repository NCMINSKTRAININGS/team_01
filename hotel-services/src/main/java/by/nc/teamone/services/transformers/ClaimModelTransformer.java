package by.nc.teamone.services.transformers;

import by.nc.teamone.dba.dao.ITypeDAO;
import by.nc.teamone.dba.dao.IUserDAO;
import by.nc.teamone.entities.ClaimStatus;
import by.nc.teamone.entities.User;
import by.nc.teamone.entities.models.UserClaimModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class ClaimModelTransformer {

    @Autowired
    ITypeDAO typeDAO;

    @Autowired
    IUserDAO userDAO;

//    public ClaimStatus buildEntity(ClaimModel claimModel){
//        ClaimStatus claim = new ClaimStatus();
//        claim.setCheckInDate(claimModel.checkInDate);
//        claim.setCheckOutDate(claimModel.checkOutDate);
//        claim.setType(typeDAO.get(claimModel.type));
//        User user = userDAO.get(claimModel.id);
//        claim.setUser(user);
//        user.getClaims().add(claim);
//        return claim;
//    }
//
//    public ClaimModel buildModel(ClaimStatus claim){
//        ClaimModel claimModel = new ClaimModel();
//        claimModel.setCheckInDate(claim.getCheckInDate());
//        claimModel.setCheckOutDate(claim.getCheckOutDate());
//        claimModel.setTypeObj( claim.getType());
//        claimModel.setId( claim.getId());
//        claimModel.setStatus(claim.getStatus());
//        return claimModel;
//    }
}
