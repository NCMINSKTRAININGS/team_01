package by.nc.teamone.dba.dao;

import org.springframework.stereotype.Repository;
import org.springframework.test.annotation.Rollback;

@Repository
public interface ITestDAO {

    @Rollback(true)
    void setValues();

    @Rollback(true)
    void deleteValues();

    @Rollback(true)
    void add();

    @Rollback(true)
    void delete();

    @Rollback(true)
    void getAll();

    @Rollback(true)
    void update();

}
