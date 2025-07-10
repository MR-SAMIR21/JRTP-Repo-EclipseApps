package com.smr.service;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
/**
 * Unit test for simple App.
 */
public class AppTest 
  
{
   
  

    /**
     * Rigourous Test :-)
     */
	@Test
    public void testWithPositive()
    {
		int a = 10;
		int b = 20;
		int expected = 30;
		App app1 = new App();
		int actual = app1.sum(a,b);
		
        assertEquals( expected, actual );
    }

	@Test
    public void testWithNegative()
    {
		int a = -10;
		int b = -20;
		int expected = -30;
		App app1 = new App();
		int actual = app1.sum(a,b);
		
        assertEquals( expected, actual );
    }
	
	@Test
    public void testWithMixedValue()
    {
		int a = 10;
		int b = -20;
		int expected = -10;
		App app1 = new App();
		int actual = app1.sum(a,b);
		
        assertEquals( expected, actual );
    }
	
}
