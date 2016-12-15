package by.nc.teamone.dba.dao.impl;

import by.nc.teamone.dba.dao.IClaimDAO;
import by.nc.teamone.entities.Claim;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope("singleton")
public class ClaimDAOImpl extends BaseDAOImpl<Claim, Long> implements IClaimDAO {
    public ClaimDAOImpl() {
        super(Claim.class);
    }

}
