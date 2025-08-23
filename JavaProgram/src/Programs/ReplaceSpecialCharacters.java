package Programs;



	public class ReplaceSpecialCharacters {
	    public static void main(String[] args) {
	        String str = "p2u3r# #v*4@i@";
	        String replacedStr = replaceSpecialCharacters(str);
	        System.out.println("Input string: " + str);
	        System.out.println("String with special characters replaced: " + replacedStr);
	    }

	    public static String replaceSpecialCharacters(String str) {
	        StringBuilder result = new StringBuilder();
	        // Iterate over each character in the input string
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            // Check if the character is a letter or a space
	            if (Character.isLetter(ch) || ch == ' ') {
	                // If yes, append it to the result string
	                result.append(ch);
	            } else {
	                // If no, replace it with an underscore
	                result.append('_');
	            }
	        }
	        return result.toString();
	    }
	}


