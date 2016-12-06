package by.nc.teamone.dba.dao.impl;

import by.nc.teamone.dba.dao.IStatusDAO;
import by.nc.teamone.entities.Status;
import org.springframework.stereotype.Repository;

@Repository
public class StatusDAOImpl extends BaseDAOImpl<Status, Long> implements IStatusDAO {

    public StatusDAOImpl() {
        super(Status.class);
    }

}
