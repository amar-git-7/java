package myprojgrp.allcode;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String plaindr="ada ada";
		String revplain="";
		System.out.println(plaindr.toCharArray());
		for (char ch:plaindr.toCharArray()){
			revplain=ch+revplain;
		}
		System.out.println("Is the String:"+plaindr+":Plaindrome:"+plaindr.equals(revplain));
		
		StringBuilder plaindrbuld= new StringBuilder();
		
		for (String string : plaindr.split("")) {
			plaindrbuld.append(string);
		}
		
		System.out.println(plaindrbuld.reverse());
		System.out.println("Is the String:"+plaindr+":Plaindrome:"+plaindr.equals(plaindrbuld.reverse().toString()));
		
		
	}

}
