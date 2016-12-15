package by.nc.teamone.services.transformers;

import by.nc.teamone.entities.Claim;
import by.nc.teamone.entities.models.ClaimModel;
import org.springframework.stereotype.Repository;


@Repository
public class ClaimModelTransformer {

    public Claim buildEntity(ClaimModel claimModel){

        Claim claim = new Claim();
        claim.setCheckInDate(claimModel.checkInDate);
        claim.setCheckOutDate(claimModel.checkOutDate);
        return claim;
    }
}
