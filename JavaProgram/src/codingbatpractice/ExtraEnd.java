package codingbatpractice;

public class ExtraEnd {
/*Given a string, return a new string made of 3 copies of the last 2 chars of the 
 * original string. The string length will be at least 2.


extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"*/
	public static void main(String[] args) {
System.out.println(ends("Hello"));
System.out.println(ends("ab"));
System.out.println(ends("Hi"));


	}
    public static String ends(String str ) {
    	int n=str.length();
    	String a=str.substring(n-2);
    	
    	return a+a+a;
    }
}
