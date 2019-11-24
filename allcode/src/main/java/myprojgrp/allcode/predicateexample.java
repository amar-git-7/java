package myprojgrp.allcode;

import java.util.function.Predicate;

/**
 * Hello world!
 *
 */
public class predicateexample 
{
    public static void main( String[] args )
    {
    	
    	
      //simple predicate
      Predicate<Integer> testlessten= i->(i<10);
      System.out.println(testlessten.test(9));
      System.out.println(testlessten.test(11));
      
      //predicate chain
      Predicate<Integer> testgrtten= i->(i>10);
      
      Predicate<Integer> testlesshundred= i->(i<100);
      
      System.out.println(testgrtten.and(testlesshundred).test(99));
      System.out.println(testgrtten.and(testlesshundred).test(9));
      
      //negate
      System.out.println(testgrtten.and(testlesshundred).negate().test(99));
      
      
      
    }
}
