package codingbatpractice;

public class FirstHalf {
/*Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".


firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"*/
	
	public static void main(String[] args) {
		System.out.println(firstHalf("WooHoo"));
		System.out.println(firstHalf("HelloThere"));
		System.out.println(firstHalf("abcdef") );
		System.out.println(firstHalf("") );

	}

	public static String firstHalf(String word) {
     int n=word.length();
		if(n % 2 ==0) {
			return word.substring(0,n/2);
			
		}
		else {
			
			return "its not even String!!";
		}
		
}}
