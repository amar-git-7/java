package myprojgrp.allcode;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlistrevesed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	LinkedList<String> lnlst = new LinkedList<String>();
	
	lnlst.add("One");
	lnlst.add("three");
	lnlst.add(1, "two");
	
	Iterator<String> iter = lnlst.descendingIterator();
	
	while(iter.hasNext()){
		System.out.println(iter.next());
	}
		
		
	}

}
