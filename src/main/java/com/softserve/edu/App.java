package com.softserve.edu;


public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("surefire.application.password = "+System.getProperty("surefire.application.password"));
        System.out.println("System.getnv().MY_Password = "+System.getenv().get("MY_PASSWORD"));
      
    }
}
