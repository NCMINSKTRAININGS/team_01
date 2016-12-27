package by.nc.teamone.dba.dao.impl;

import by.nc.teamone.dba.dao.IClaimStatusDAO;
import by.nc.teamone.entities.ClaimStatus;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
@Scope("singleton")
public class ClaimStatusDAOImpl extends BaseDAOImpl<ClaimStatus, Long> implements IClaimStatusDAO {
	
    public ClaimStatusDAOImpl() {
        super(ClaimStatus.class);
    }

}
