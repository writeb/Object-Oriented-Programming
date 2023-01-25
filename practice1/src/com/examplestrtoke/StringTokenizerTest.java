package com.examplestrtoke;

import java.util.StringTokenizer;
import java.io.*;


public class StringTokenizerTest {

	public static void main(String[] args) {
		
		File file = null ; 
		InputStreamReader isR = null ; 
		BufferedReader brR  = null ; 
		try {
			file = new File("/Users/assylvn/Desktop/textfor.rtf") ; 
			isR = new InputStreamReader( new FileInputStream(file)) ;
			brR = new BufferedReader(isR) ; 
			StringTokenizer str = new StringTokenizer(brR.readLine() ,"/") ; 
			
			while(str.hasMoreTokens())
			{
				System.out.println(str.nextToken()) ; 
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e){ 
			e.printStackTrace();
		}
		finally {
			try {
				isR.close() ;
				brR.close() ; 
			}
			catch (IOException e){ 
				e.printStackTrace();
			}
			
		}
		
		
	
		
	}

}
