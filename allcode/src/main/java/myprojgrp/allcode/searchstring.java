package myprojgrp.allcode;

public class searchstring {

	public static void main(String[] args) {
		
		String input = "inAbafffaBfggga";
		
		//split using regex
		String[] afterdd=input.toLowerCase().split("[^aba]");
		System.out.println(afterdd.toString());
		StringBuilder onlyreq= new StringBuilder();
		
		for (String ddd: afterdd){
			if (!ddd.isEmpty()){
				onlyreq.append(ddd);
			}
		}
		System.out.println("after cleanup"+onlyreq.length()/3);
	
		
		//without using regex
		StringBuilder reqstr= new StringBuilder();
		for (char ia :input.toLowerCase().toCharArray()){
			if(ia=='a'||ia=='b'||ia=='a'){
				reqstr.append(ia);
			}
		}
		System.out.println("req str"+reqstr);
		System.out.println("How many time search string 'aba' is repeated:"+reqstr.length()/3);
		
	}

}
