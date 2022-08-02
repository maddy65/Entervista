package Reltio;

public class countAbstract {

	public static void main(String[] args) {
		String st ="yo|uar|e**|b|e***au|tifu|l";
		System.out.println(countAsterisks(st));

	}
	
	 public static int countAsterisks(String s) {
		 int count = 0;
		 
		 int paiCount = 0;
		 boolean pairedflg = false;
		 
		 
		 for(int i=0; i<s.length(); i++) {
			 
			 char pai = '|';
			 char st = s.charAt(i);
			 char abs = '*';
			 if(st == pai && pairedflg == false) {
				 pairedflg = true;
			 }else if(st == pai && pairedflg == true) {
				 pairedflg = false;
			 }
			 
			 if(pairedflg == false && st == abs) {
				 count = count +1;
			 }
					 
		 }
		 return count;
	 }

}
