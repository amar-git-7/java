package codesamples;


interface reverse{
	void doreverse(String reversestring);
}

public class stringreverse {

	public static void main(String[] args) {
		
		
		String orgstring ="hello how ";
		String[] stringarray = orgstring.split("");	
		
		StringBuilder reversestr = new StringBuilder();
		System.out.println();
		for (int j=orgstring.length()-1; j>=0; j--){
			reversestr.append(stringarray[j]);
		}
		System.out.println("Traditional way:"+reversestr);
	
		
		reverse rv;
		
		rv = (mystring)->{
			String[] arystr=mystring.split("");
			
			StringBuilder rvstr= new StringBuilder();
			rvstr.append(mystring);
			/*for (String string : arystr) {
				rvstr.append(string) ;
				//rvstr.append(rvstr);
			}*/
			System.out.println("lamdba expression:"+rvstr.reverse());
		};
		
		rv.doreverse(orgstring);
	}

}
