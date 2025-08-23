package Programs;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		
		if(num % 2==0) {
			
			System.out.print("its a even number");
			
		}else {
			
			System.out.print("its a odd number");

		}
	}

}
