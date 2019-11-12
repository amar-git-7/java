package myprojgrp.allcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class arraychunk {


	// Given an array and chunk size, divide the array into many subarrays
	// where each subarray is of length size
	// --- Examples
	// chunk([1, 2, 3, 4], 2) --> [[ 1, 2], [3, 4]]
	// chunk([1, 2, 3, 4, 5], 2) --> [[ 1, 2], [3, 4], [5]]
	// chunk([1, 2, 3, 4, 5, 6, 7, 8], 3) --> [[ 1, 2, 3], [4, 5, 6], [7, 8]]
	// chunk([1, 2, 3, 4, 5], 4) --> [[ 1, 2, 3, 4], [5]]
	// chunk([1, 2, 3, 4, 5], 10) --> [[ 1, 2, 3, 4, 5]]

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arrychuck [][]= {{1,2,2,3,5,5,6,6,7,9,0},{4}};

		ArrayList<ArrayList<Integer>> lit  = new ArrayList<ArrayList<Integer>>();

		System.out.println(arrychuck.length);

		System.out.println("ddd"+arrychuck[arrychuck.length-1][0]);
		System.out.println("first array"+arrychuck[0].length);

		int sz=arrychuck[arrychuck.length-1][0];

		ArrayList<Integer> lit1  = new ArrayList<Integer>();
		for(Integer it=1; it<=arrychuck[0].length;it++){
			System.out.println("it"+it);
			lit1.add(arrychuck[0][it-1]);
			if (it%sz==0 || it==arrychuck[0].length){
				lit.add(lit1);
				lit1  = new ArrayList<Integer>();
			}

		}

		System.out.println(lit);

	}

}
