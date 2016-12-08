package by.nc.teamone.dba.dao.impl;

import by.nc.teamone.dba.dao.IClaimDAO;
import by.nc.teamone.entities.Claim;

/**
 * Created by Asus on 05.12.2016.
 */
public class ClaimDAOImpl extends BaseDAOImpl<Claim, Long> implements IClaimDAO {
    public ClaimDAOImpl() {
        super(Claim.class);
    }
}
