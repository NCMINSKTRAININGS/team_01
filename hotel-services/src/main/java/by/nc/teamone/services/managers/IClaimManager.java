package by.nc.teamone.services.managers;

import by.nc.teamone.entities.models.ClaimModel;

import java.util.List;


public interface IClaimManager {
    void addClaim(ClaimModel claimModel);
    List<ClaimModel> getAllClaim();
}
