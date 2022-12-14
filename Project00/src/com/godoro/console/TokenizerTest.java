package com.godoro.console;

import java.util.StringTokenizer;

public class TokenizerTest {
	public static void main(String[] args) {
		
		String string="Java, JDBC, JSP, JAXB, JSON-P, JAX-WS, JAX-RS";
	 
		for(String token : string.split(", ")) { //sonradan gelen versiyon
			System.out.println("* "+token);
		}
		
		//iterator pattern ornegi
		StringTokenizer tokenizer =new StringTokenizer(string," ,-; ",true);
		while(tokenizer.hasMoreTokens()) {
			String token=tokenizer.nextToken();
			System.out.println("# "+token);	
		}
				
	}
}
