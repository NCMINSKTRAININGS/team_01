package by.nc.teamone.dba.dao.impl;

import by.nc.teamone.dba.dao.ITypeDAO;
import by.nc.teamone.entities.Type;
import org.springframework.stereotype.Repository;

/**
 * Created by Valeria on 05.12.2016.
 */
@Repository
public class TypeDAOImpl  extends BaseDAOImpl<Type, Long> implements ITypeDAO {

    public TypeDAOImpl() {
        super(Type.class);
    }

}