package myprojgrp.allcode;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.function.Predicate;

/**
 * Hello world!
 *
 */
public class predicateexample 
{
	
	static boolean pred( int n, Predicate<Integer>predi){
		System.out.println(n);
		return predi.test(n);
	}
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
    	System.out.println(pred (11,i->i>10));

    	StringJoiner strjoiner= new StringJoiner(";");
    	strjoiner.add("ddd").add("rr");
    	System.out.println(strjoiner);
    	
    	
    	//Streams
    	
    	List <Integer> listint= new ArrayList<>();
    	
    	listint.add(1);
    	listint.add(2);
    	listint.add(11);
    	listint.add(19);
    	
    	
    	System.out.println(listint.stream().filter(i->i>10).mapToInt(i->i).sum());
    	
    }
}
