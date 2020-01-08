package myprojgrp.allcode;

import java.util.Scanner;


public class hk_minmaxsum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
    	long minval=arr[0],maxval=arr[0];
    	
    	for (int i=0;i<arr.length;i++){
    		long sum=0;
    				int ii=0;
    		while(ii<arr.length){
    			if(ii!=i)
    				sum+=arr[ii];
    			ii++;
    		}
    		if (i==0){
    			minval=sum;
    		}
    		if (sum >maxval){
    			maxval=sum;
    		}
    		if(sum<minval){
    			minval=sum;
    		}
    	}
    	 System.out.println(minval +" "+maxval);
    	//another approach
    	int ii=0,sum=0;
    	
    	while(ii<arr.length){
			sum+=arr[ii];
			ii++;
		}
    	long minvall=sum,maxvall=sum;
    	for (int i=0;i<arr.length;i++){
    		
    		if (maxvall>(sum-arr[i])){
    			minvall=sum-arr[i];
    		}
    		if (maxvall>(sum-arr[i])){
    			maxvall=sum-arr[i];
    		}
    	}
    System.out.println(minvall +" "+maxvall);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}