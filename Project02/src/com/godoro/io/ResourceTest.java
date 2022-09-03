package com.godoro.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ResourceTest {
	public static void main(String[] args) throws IOException {
		String path="C:\\Users\\sevva\\Desktop\\github_projeler\\projem\\IBTech_Java_Bootcamp_Projects\\out.txt";
		
		//try() icinde tanımlanıyosak isimiz bittiginde kendiliginden kapanır ,bw.close() a gerek kalmaz
		try (BufferedWriter bw=new BufferedWriter(new FileWriter(path))){
			bw.write("Java\r\n");
			bw.write("JDBC\r\n");
			bw.write("JAXP\r\n");
			bw.write("JSON-P\r\n");
			bw.write("JSON\r\n");
		}catch(Exception e){
			e.printStackTrace();
		}
	
	
	}
}
