package myprojgrp.allcode;

import java.util.function.Predicate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
      Predicate<Integer> testlessten= i->(i<10);
      
      System.out.println(testlessten.test(9));
      
      System.out.println(testlessten.test(11));
      
    }
}
