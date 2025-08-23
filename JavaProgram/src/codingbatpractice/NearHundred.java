package codingbatpractice;

public class NearHundred {

	public static void main(String[] args) {
/*
 * Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.


nearHundred(93) → true
nearHundred(90) → true
nearHundred(89) → false
 * */
		
		System.out.println("nearHundred(93->"+nearHundred(93));
		System.out.println("nearHundred(90)->"+nearHundred(90));
		System.out.println("nearHundred(89)->"+nearHundred(89));

		
	}
	public static boolean nearHundred(int n) {
		   int c=Math.abs(100-n);
		   int d=Math.abs(200-n);
		   
		   if(c >=0 && c <=10){
		     
		     return true;
		     
		   }else if(d >=0 && d <=10){
		     return true;
		     
		     
		   }else{
		     
		     return false;
		   }
		}
	public boolean posNeg(int a, int b, boolean negative) {
		  
		  if(negative ==false && (a < 0  && b >0 )){
		    
		    return true;
		  }else if(negative ==false && ( a>0  && b >0 )){
		    
		        return true;

		  }else{
		    
		        return false;

		  
		  
		  
		}
		}
}
