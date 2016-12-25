package by.nc.teamone.dba.dao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.stereotype.Repository;

@Repository
public interface ITestDAO {

    @Before
    void setValues();

    @After
    void deleteValues();

    @Test
    void add();

    @Test
    void delete();

    @Test
    void getAll();

    @Test
    void update();

}
