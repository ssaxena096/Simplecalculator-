package calculator.com.com.calculator;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

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
    	App app = new App();
        assertEquals(20, app.sum(10,10));
        assertEquals(0, app.sub(10, 10));
        assertEquals(100, app.multiply(10, 10));
        assertEquals(1,app.divide(10, 10));
    }
}
