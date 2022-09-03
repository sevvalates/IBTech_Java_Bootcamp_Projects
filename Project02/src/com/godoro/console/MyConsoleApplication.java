package com.godoro.console;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.godoro.filer.Supplier;

public class MyConsoleApplication {
	
	private static Scanner scanner=new Scanner(System.in);
	private List<Supplier> supplierList=new ArrayList<>();
	
	private static void printMenu() {
		System.out.println("1. Yukle");
		System.out.println("2. Sakla");
		System.out.println("3. Dizelgele");
		System.out.println("4. Bul");
		System.out.println("5. Ekle");
		System.out.println("6. Guncelle");
		System.out.println("7. Sil");
		System.out.println("0. Cik");
	}
	private static int scanChoice() {
		System.out.println("Seciniz:");
		int choice=scanner.nextInt();
		System.out.println("Secilen: "+choice);
		return choice;
	}

	private static void handleChoice(int choice) {
		switch (choice) {
		case 1: 
			doLoad();
			break;		
		case 2: 
			doStore();
			break;
		case 3: 
			doList();
			break;
		case 4: 
			doFind();
			break;
		case 5: 
			doAdd();
			break;
		case 6: 
			doUpdate();
			break;
		case 7: 
			doDelete();
			break;
		case 0: 
			doExit();
			break;
		default:
			System.out.println("Gecersiz secim: "+choice);
		}
	}
	private static void doLoad() {
		System.out.println("Yukleniyor...");
	}
	private static void doStore() {
		System.out.println("Saklaniyor...");
	}
	private static void doList() {
		System.out.println("Listeleniyor...");
	}
	private static void doFind() {
		System.out.println("Bulunuyor...");
	}
	private static void doAdd() {
		System.out.println("Ekleniyor...");
	}
	private static void doUpdate() {
		System.out.println("Guncelleniyor...");
	}
	private static void doDelete() {
		System.out.println("Siliniyor...");
	}
	private static void doExit() {
		System.exit(0);
	}
	
	public static void main(String[] args) {
		while(true) {
			printMenu();
			int choice=scanChoice();
			handleChoice(choice);
		}
	}
	
}
