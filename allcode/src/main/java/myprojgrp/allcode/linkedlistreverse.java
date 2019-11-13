package myprojgrp.allcode;

public class linkedlistreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int orgint=51;
	
		StringBuilder intstr= new StringBuilder();
		intstr.append(String.valueOf((orgint<0)? orgint*-1: orgint));
	
		
		System.out.println((orgint>0)? intstr.reverse().toString(): Integer.parseInt(intstr.reverse().toString())*-1);
		//System.out.println("Is the String:"+plaindr+":Plaindrome:"+plaindr.equals(plaindrbuld.reverse().toString()));
		
		
	}

}
