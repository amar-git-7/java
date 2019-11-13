package myprojgrp.allcode;

import java.util.HashMap;
import java.util.Map;

public class anagrams {

	// --- Examples
//  anagrams('rail safety', 'fairy tales') --> True
//  anagrams('RAIL! SAFETY!', 'fairy tales') --> True
//  anagrams('Hi there', 'Bye there') --> False
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="  rail Safety!!";
		String str2 ="fairy tales";
		
		Map <Character,Integer>str1map=charmap(str1);
		Map <Character,Integer>str2map=charmap(str2);
		boolean ang=true;
		if (str1map.size()==str2map.size()){
			for (Character key:str2map.keySet()){
				if (str1map.get(key)!=str2map.get(key)){
					ang=false;
				}
				
			}
			
			System.out.println(str1+": is anagram:"+ang+":"+str2);
			
/*			str1map.forEach( (key,val)->{
			
				if (str1map2.get(key)!=val){
					System.out.println(str1+":not anagrams:"+str2);
				}
			}
					
					
					);*/
			
			
		}else{
			System.out.println(str1+":not anagram size is not equal:"+str2);
		}
		
	}
	

 static Map<Character,Integer> charmap(String Str){
	
	//Str.replaceAll(regex, replacement)
	String ss=Str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	System.out.println(Str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase());
	Map <Character, Integer > maxcharMap= new HashMap<Character, Integer>();
	for (Character chars: ss.toCharArray()){
		if (maxcharMap.containsKey(chars)){
			maxcharMap.put(chars, maxcharMap.get(chars)+1);
		}else{
			maxcharMap.put(chars, 1);
		}
	}
	System.out.println(maxcharMap);
	
	return maxcharMap;
	
}
}
