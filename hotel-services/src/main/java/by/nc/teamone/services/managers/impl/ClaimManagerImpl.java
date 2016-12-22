package by.nc.teamone.services.managers.impl;

import by.nc.teamone.dba.dao.IClaimDAO;
import by.nc.teamone.entities.Claim;
import by.nc.teamone.entities.models.ClaimModel;
import by.nc.teamone.services.managers.IClaimManager;
import by.nc.teamone.services.transformers.ClaimModelTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@Scope("singleton")
public class ClaimManagerImpl implements IClaimManager {

    @Autowired
    private IClaimDAO claimDAO;

    @Autowired
    private ClaimModelTransformer claimModelTransformer;

    @Override
    public void addClaim(ClaimModel claimModel) {
        Claim claim = claimModelTransformer.buildEntity(claimModel);
        claim.setStatus("In processing");

        claimDAO.add(claim);
    }
    
}
