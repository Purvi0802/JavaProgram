package codingbatpractice;

/*
 * Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".


helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!"
 
 * 
 * */

public class HelloName {

	public static void main(String[] args) {
System.out.println(helloNameMethod("Bob"));
System.out.println(helloNameMethod("Alice"));
System.out.println(helloNameMethod("X"));
		
		//helloNameMethod("Bob");
	}
 

public static String helloNameMethod(String name) {
	 
	 return "Hello" +name+"!";
}

}