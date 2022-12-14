package com.godoro.hw0104;

import com.godoro.hw0103.Account;

public class AccountConverterTest {

	public static void main(String[] args) {
		
		String line="601;Kasa Hesabı;23560";
		Account account= new Account();
		AccountConverter converter= new AccountConverter();

		account=converter.parse(line);
		System.out.println("Account Id: "+account.getAccountId()
		  +" Account Name: "+account.getAccountName()
		  +" Amount Local: "+account.getAmountLocal());
		
		String string=converter.format(account);
		System.out.println(string);
		
	}
}
