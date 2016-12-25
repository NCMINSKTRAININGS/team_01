import org.junit.After;
import org.junit.Before;

public interface ITestCascade {

    @Before
    void setValues();

    @After
    void deleteValues();

}
