package codingbatpractice;

public class SleepInprogram {

	public static void main(String[] args) {
/*
 * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it 
 * is not a weekday or we're on vacation. Return true if we sleep in.*/
		
		System.out.println("sleepIn(false, false)->"+sleepIn(false, false));
		System.out.println("sleepIn(true, false)->"+sleepIn(true, false));
		System.out.println("sleepIn(false, true) → true->"+sleepIn(false, true));
		System.out.println("sleepIn(true, true)->"+sleepIn(true, true));
	}

	public static boolean sleepIn(boolean weekday, boolean vacation) {
		  
		  
		  if(weekday == false && vacation ==false){
		    
		    return true;
		  
		}else if(weekday ==true && vacation ==false){
		  
		      return false;
		}
		else{
		  
		  return true;
		}
		}
}
