package codingbatpractice;

public class WithoutEnds {
/*Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.


withoutEnd("Hello") → "ell"
withoutEnd("java") → "av"
withoutEnd("coding") → "odin"*/
	
	public static void main(String[] args) {
System.out.println(withoutEnds("Hello"));
System.out.println(withoutEnds("java"));
System.out.println(withoutEnds("coding"));
System.out.println(withoutEnds("er"));
	}
	public static String withoutEnds(String word) {
		
		int n=word.length();
		if(n >2) {
			return word.substring(1,n-1);
		}else {
			
			return "length is shorter than 2 ";
		}
		}
		
	}

