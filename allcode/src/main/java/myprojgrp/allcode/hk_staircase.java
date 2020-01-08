package myprojgrp.allcode;

import java.util.Scanner;

public class hk_staircase {

    // Complete the staircase function below.
    static void staircase(int n) {
    	if (n<1) System.exit(0);
    	
    	int totalstair=n;
    	int ii=1;
    	
    	while (n>0){
    		
    		StringBuilder str = new StringBuilder();
    		int spacecount =totalstair-ii; 
        	while(spacecount>0){
    			str.append(" ");
    			spacecount--;
    		}
        	int i=ii;
        	while(i>0){
        		str.append("#");
        		i--;
        	}
    		
        	System.out.println(str);
    		n--;
    		ii++;
    	}
    	

      /*  
       * simplified solution
        int spaceCnt = 0;
    	   for (int i = 0; i < n; i++) {
               spaceCnt = n - (i + 1);
               System.out.print(new String(new char[spaceCnt]).replace("\0", " ") + new String(new char[n - spaceCnt]).replace("\0", "#") + "\n");
           }*/
    	   
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}