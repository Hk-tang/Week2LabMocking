package cmput402.mocking;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import sub.CityStub;

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
}
