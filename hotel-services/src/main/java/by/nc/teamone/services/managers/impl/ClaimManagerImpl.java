package by.nc.teamone.services.managers.impl;

import by.nc.teamone.dba.dao.IClaimDAO;
import by.nc.teamone.entities.Claim;
import by.nc.teamone.services.managers.IClaimManager;
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

    @Override
    public void addClaim(Claim claim) {
        claimDAO.add(claim);
    }
}
