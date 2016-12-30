package by.nc.teamone.dba.dao.impl;


import by.nc.teamone.dba.dao.ITestDAO;
import by.nc.teamone.dba.dao.ITypeDAO;
import by.nc.teamone.entities.Type;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(transactionManager = "txManager")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/test-config.xml"})
public class TestType implements ITestDAO{

    @Autowired
    ITypeDAO typeDAO;

    private Type type1;
    private Type type2;

    @Override
    @Before
    public void setValues() {
        type1 = new Type();
        type1.setTypeRu("test");
        type1.setTypeEn("test");

        type2 = new Type();
        type2.setTypeRu("test_");
        type2.setTypeEn("test_");
    }

    @Override
    @After
    public void deleteValues() {
        type1 = null;

    }

    @Override
    @Test
    public void add() {
        typeDAO.add(type1);
        Assert.assertEquals(typeDAO.get(type1.getId()), type1);
    }

    @Override
    @Test
    public void delete() {
        typeDAO.add(type1);
        long id = type1.getId();
        typeDAO.delete(typeDAO.get(type1.getId()));
        Assert.assertEquals(typeDAO.get(id), null);
    }

    @Override
    @Test
    public void getAll() {
        typeDAO.add(type1);
        typeDAO.add(type2);
        long id1 = type1.getId();
        long id2 = type2.getId();
        List<Type> listType = typeDAO.getAll();
        for(Type iter:listType){
            if (iter.getId() == id1)
                Assert.assertEquals(iter, type1);
            if (iter.getId() == id2)
                Assert.assertEquals(iter, type2);
        }
    }

    @Override
    @Test
    public void update() {
        typeDAO.add(type1);
        long id = type1.getId();
        Type result = typeDAO.get(id);
        type1.setTypeEn("test2");
        typeDAO.update(type1);
        Assert.assertEquals(result , typeDAO.get(id));
    }
}
