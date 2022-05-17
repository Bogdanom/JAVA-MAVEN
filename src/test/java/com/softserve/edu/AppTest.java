package com.softserve.edu;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest 
    
{
	@Test
    public void testApp()
    {
      Assert.assertTrue(true);
    }
	
	@Test
    public void checkApp()
    {
      System.out.println("System.getnv().MY_Password = "+System.getenv().get("MY_PASSWORD"));
    }
}
