package by.nc.teamone.dba.dao.impl;

import by.nc.teamone.dba.dao.ITypeDAO;
import by.nc.teamone.entities.Type;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Scope("singleton")
@Repository
public class TypeDAOImpl  extends BaseDAOImpl<Type, Long> implements ITypeDAO {

    public TypeDAOImpl() {
        super(Type.class);
    }

}
