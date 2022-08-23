package com.godoro.hw0105;

import java.util.Formatter;
import java.util.Scanner;

import com.godoro.hw0103.Account;

public class ScannerHw {
	public static void main(String[] args) {
	
		Account account=new Account();

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Account Id: ");
		account.setAccountId(scanner.nextLong());
		
		System.out.println("Account Name: ");
		account.setAccountName(scanner.next());
		
		System.out.println("Amount Local: ");
		account.setAmountLocal(scanner.nextDouble());
		
		scanner.close();
		
		Formatter formatter=new Formatter(System.out);
		formatter.format("Account Id: %d  Account Name: %s Amount Local: %.2f",account.getAccountId(),account.getAccountName(),account.getAmountLocal());
		formatter.close();
		
	}
}
