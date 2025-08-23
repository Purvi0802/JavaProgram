package Programs;

public class StringInputOutput {
	public static void main(String[] args) {
		{
			
		//input -abc ed output- edc ba
			
			String input="abc ed";
			String output=convertString(input);
		
			System.out.print("input string : "+input);
			System.out.print("output string : "+output);

		}
	}
		
		public static String convertString(String input) {
	        StringBuilder result = new StringBuilder();
	        String[] words = input.split(" ");
	        for (String word : words) {
	            StringBuilder reversedWord = new StringBuilder();
	            for (int i = word.length() - 1; i >= 0; i--) {
	                reversedWord.append(word.charAt(i));
	            }
	            result.append(reversedWord).append(" ");
	        }
	        return result.toString().trim();
	    }
}
