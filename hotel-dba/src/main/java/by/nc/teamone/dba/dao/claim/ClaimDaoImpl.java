package by.nc.teamone.dba.dao.claim;

import by.nc.teamone.dba.dao.BaseDAOImpl;
import by.nc.teamone.entities.Claim;

/**
 * Created by Asus on 05.12.2016.
 */
public class ClaimDaoImpl extends BaseDAOImpl<Claim, Long> implements IClaimDao{
    public ClaimDaoImpl() {
        super(Claim.class);
    }
}
