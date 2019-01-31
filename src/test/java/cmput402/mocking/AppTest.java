package cmput402.mocking;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import service.Salary;
import sub.CityStub;

import java.util.ArrayList;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testCapitalizeName() {
        assert("Abram Hindle".equals(Main.capitalizeName("abram hindle")));
    }

    public void testFilterEdmonton() {
        CityStub stub = new CityStub();
        Util util = new Util();
        assert(util.filterEdmonton(stub) == 3);
    }

    public void testFilterSalary() {
        Salary salaryStub = new Salary() {
            @Override
            public ArrayList<Integer> returnSalaries() {
                return new ArrayList<Integer>(){{add(51000); add(50000); add(20000); }};
            }
        };

        Util util = new Util();

        assert (util.filterSalaries(salaryStub) == 1);
    }
}
