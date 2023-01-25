package practice1;

import java.util.Scanner ;
import java.io.*;

public class PR1_6 {
	public static void main(String [] args) {
		System.out.println("Enter a word:") ; 
		Scanner input = new Scanner(System.in) ; 
		String str  = input.next() ;
		String s = "" ;
		
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i) ;
			s = ch + s ;
			
		}
		
		if(s.equals(str)) {
			System.out.println("It's palindrome!") ; 
			
		}
		else {System.out.println( "It's not palindrome!") ;}  

		
		input.close();
	}
}
