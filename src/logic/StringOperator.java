package logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StringOperator {

	static Logger logger = Logger.getLogger(StringOperator.class.getName());
	public static void main(String[] args) {

		String str1 = "ciao   ";
		String str2 = "come va";
		
    	logger.log(Level.INFO, String.format("Insert String1"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";
		
		try {
			 str1 = br.readLine();
		} catch (IOException e) {
	    	logger.log(Level.SEVERE, String.format(" %s The error in str1 says:  %s", e.toString()));
	
		}
	
		logger.log(Level.INFO, String.format("Insert String2"));
		
		try {
			 str2 = br.readLine();
		} catch (IOException e) {
	   	logger.log(Level.SEVERE, String.format(" %s The error in str2 says:  %s", e.toString()));
	
		}
		
		String conc = concatString( str1, str2);

		String add = addString(str1, str2);

		String sub = subString(str2);
		

	}
	
	public static String addString(String str1, String str2) {
		String add = str1 + str2;
		return add;
		
	}
	
	public static String subString(String str2) {
		String sub = str2.substring(0, 2) + str2.substring(3, str2.length());
		return sub;
		
	}
	
	
	public static  String concatString(String str1, String str2) {
		String str3 = str1.concat(str2);
		return str3;
	}

}
