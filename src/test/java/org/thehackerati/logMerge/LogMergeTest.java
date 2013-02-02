package org.thehackerati.logMerge;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple LogMerge.
 */
public class LogMergeTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public LogMergeTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( LogMergeTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testLogMerge()
    {
        assertTrue( true );
    }
}
