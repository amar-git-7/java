package myprojgrp.allcode;

import java.util.Scanner;

public class hk_plusminus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
    	if (arr.length==0) System.exit(0);
    	int arrlen=arr.length;
    	
    	int p=0,n=0,z=0;
    
    	for (int arval : arr){
    		if(arval>0)
    			p++;
    		if(arval<0)
    			n++;
    		if(arval==0)
    			z++;
    	}
    	
    	
    	System.out.println((double)p/arrlen);
    	System.out.println((double)n/arrlen);
    	System.out.println((double)z/arrlen);
    }

  
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
