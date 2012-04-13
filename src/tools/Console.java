package tools;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class Console {
	public static String readLine() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		String str = null; 
		str = br.readLine(); 
		return str;
	}
	
	public static int readChar() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		char  c; 
		return br.read();
	}
}
