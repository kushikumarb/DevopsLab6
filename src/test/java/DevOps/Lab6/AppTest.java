package DevOps.Lab6;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	
	private App app;
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
        this.app = new App();
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
    public void testFact0()
    {
       assertEquals("Factorial of 0 must be 1", 1, this.app.calculateFactorial(0));
    }
    
    public void testFact5()
    {
        assertEquals("Factorial of 5 must be 120", 12, this.app.calculateFactorial(5));
    }
}
