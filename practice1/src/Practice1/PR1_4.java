

package practice1;

import java.util.*; 



public class PR1_4 {
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in) ; 
		int a = input.nextInt(); 
		int b = input.nextInt();
		int c = input.nextInt()	;
		int D = b*b - (4*a*c) ; 
		if(D > 0) {
			System.out.println("First x = " + ((-b + Math.sqrt(D))/(2*a)));
			System.out.println("Second x = " + ((-b - Math.sqrt(D))/(2*a)) );

		}
		else if(D == 0) {
			System.out.println("x = " + (-b)/2*a);

		}
		else {
			System.out.println("ERROR") ;
		}
		input.close();
	}
	

}
