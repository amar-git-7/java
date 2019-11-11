package myprojgrp.allcode;

import java.util.HashMap;
import java.util.Map;

public class maxchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chars="this is very interesting article 34545 in the book code 12323443434.";

		Map <Character, Integer > maxcharMap= new HashMap<Character, Integer>();
		Integer maxval=0;
		Character maxcharr=' '; 


		for (char s : chars.toCharArray()){

			if (maxcharMap.containsKey(s)){

				maxcharMap.put(s, maxcharMap.get(s)+1);
			}else{
				maxcharMap.put(s, 1);
			}
		}

		maxcharMap.forEach( (Character k, Integer v) -> {
			Integer maxval1=0;
			Character maxcharr1=' '; 
			if ( v>maxval1){
				maxval1=v;
				maxcharr1=k;
			}
			
			System.out.println(maxval1 +":"+maxcharr1);
		}


				);
		//System.out.println((orgint>0)? intstr.reverse().toString(): Integer.parseInt(intstr.reverse().toString())*-1);
		//System.out.println("Is the String:"+plaindr+":Plaindrome:"+plaindr.equals(plaindrbuld.reverse().toString()));


	}

}
