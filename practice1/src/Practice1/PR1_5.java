
package practice1;

import java.util.* ; 


public class PR1_5 {
	public static void main(String [] args) {
	Scanner input = new Scanner(System.in) ; 
	int invest = input.nextInt() ;
	double per = input.nextInt();	
	double x = (per + 100)/ 100 ; 
	
	System.out.println(invest * x);
	
	input.close();
	}
}
