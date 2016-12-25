package by.nc.teamone.services.managers.impl;

import by.nc.teamone.dba.dao.IBaseDAO;
import by.nc.teamone.entities.Type;
import by.nc.teamone.services.managers.ITypeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
@Scope("singleton")
public class TypeManagerImpl implements ITypeManager{

    @Autowired
    private IBaseDAO<Type, Long> baseDAO;

    @Override
    public List<Type> getAllType(){
        return baseDAO.getAll();
    }


}
