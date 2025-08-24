package codingbatpractice;

public class MonkeysSmileProgram {

	public static void main(String[] args) {

/*
 * Questions :We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. 
 * We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble. 
 */
		
		System.out.println("monkeyTrouble(true, true)->"+monkeyTrouble(true, true));
		System.out.println("monkeyTrouble(false, false)->"+monkeyTrouble(false, false) );
		System.out.println("monkeyTrouble(false, true)->"+monkeyTrouble(false, true));
		System.out.println("monkeyTrouble(true, false)->"+monkeyTrouble(true, false));
		
		
	
		
	}

	

public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
	  
	  if(aSmile == true && bSmile==true){
	    
	    return true;
	  }else if(aSmile == false && bSmile==false){
	    
	        return true;

	    
	  }else{
	    
	    return false;
	  }
	}
}