package by.nc.teamone.serveces;

import org.junit.After;
import org.junit.Before;
import org.springframework.stereotype.Repository;

@Repository
public interface ITestServices {

    @Before
    void setValues();

    @After
    void deleteValues();


}
