package myprojgrp.allcode;

public class searchstring {

	public static void main(String[] args) {
		
		String input = "inAbafffaBfggga";
		
		String[] afterdd=input.toLowerCase().split("[^aba]");
StringBuilder onlyreq= new StringBuilder();
		
		for (String ddd: afterdd){
			
			System.out.println("==="+ddd);
			if (!ddd.isEmpty()){
				onlyreq.append(ddd);
			}
		}
		System.out.println(onlyreq);
		//input.toLowerCase().replaceAll("", replacement)
		String searchstr="aba";
		
		char[] arrychar = input.toLowerCase().toCharArray();
		
		System.out.println(arrychar);
		StringBuilder str2=new StringBuilder();
	/*	for (char charr:input.toLowerCase().toCharArray()){
			if (searchstr.contains(charr) ||charr.equals("b")){
				str2.append(charr);
				System.out.println(charr);
			}else{
				System.out.println("----"+charr);
			}
			
		}*/
		
		String input2 = "ababa";
		
		
	}

}
