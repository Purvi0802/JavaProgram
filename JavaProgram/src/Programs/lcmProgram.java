package Programs;

public class lcmProgram {

	public static void main(String[] args) {
		
		
		int a=15;
		int b=25;
		
		int ans=(a>b)?a:b;
		
		while(true) {
			
			if(ans % 2 == 0 && ans % b == 0) 
				break;
			ans++;
		
			
			
			
			
		}
	
		System.out.println("LCM of " + a + " and " + b
                + " : " + ans);
	}
}