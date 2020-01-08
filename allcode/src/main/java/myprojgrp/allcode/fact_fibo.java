package myprojgrp.allcode;

/**
 * Hello world!
 *
 */
public class fact_fibo 
{
    public static void main( String[] args )
    {
    	
   int result =fact(9);
      System.out.println(result);
      
      int fiboresult = fibno(6);
      
      System.out.println(fiboresult);
    }
    
    static int fact(int n){
    	if (n==0){
    	return 1;
    	}
    		return (n*fact(n-1));
    }
    
    static int fibno(int n){
    	if (n<1){
    	return 0;
    	}else if (n==1|| n==2){
    		return n-1;
    	}
    		return (fibno(n-1)+fibno(n-2));
    }
}
