package by.nc.teamone.dba.dao.impl;

import by.nc.teamone.dba.dao.IStatusDAO;
import by.nc.teamone.entities.Status;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Scope("singleton")
@Repository
public class StatusDAOImpl extends BaseDAOImpl<Status, Long> implements IStatusDAO {

    public StatusDAOImpl() {
        super(Status.class);
    }

}
