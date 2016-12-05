package by.nc.teamone.dba.dao.status;

import by.nc.teamone.dba.dao.BaseDAOImpl;
import by.nc.teamone.entities.Status;
import org.springframework.stereotype.Repository;

/**
 * Created by Valeria on 05.12.2016.
 */
@Repository
public class StatusDAOImpl extends BaseDAOImpl<Status, Long> implements IStatusDAO {

    public StatusDAOImpl() {
        super(Status.class);
    }

}
