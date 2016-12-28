package by.nc.teamone.dba.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface ITestDAO {

    void setValues();

    void deleteValues();

    void add();

    void delete();

    void getAll();

    void update();

}
