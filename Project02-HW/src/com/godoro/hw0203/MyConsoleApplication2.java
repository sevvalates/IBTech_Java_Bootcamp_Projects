package com.godoro.hw0203;

//load&store thread kullanılarak yapıldı
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.godoro.hw0201.*;


public class MyConsoleApplication2 {
	
	private static Scanner scanner=new Scanner(System.in);
	private static  List<Supplier> supplierList=new ArrayList<>();
	
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

	private static void handleChoice(int choice) throws IOException {
		
		System.out.println("Kotariliyor : "+choice +"\n");
		long supplierId;

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
			System.out.println("Bulmak istediginiz satimcinin id'sini girin: ");
			supplierId=scanner.nextLong();
			doFind(supplierId);
			break;
		case 5: 
			doAdd();
			break;
		case 6: 
			doUpdate();
			break;
		case 7:
			System.out.println("Silmek istediginiz satimcinin id'sini girin: ");
			supplierId=scanner.nextLong();
			doDelete(supplierId);
			break;
		case 0: 
			doExit();
			break;
		default:
			System.out.println("Gecersiz secim: "+choice);
		}
	}
	
	private static void doLoad() throws IOException {
		System.out.println("Yukleniyor...\n");

		String filePath="C:\\Users\\sevva\\Desktop\\github_projeler\\projem\\IBTech_Java_Bootcamp_Projects\\Supplier.txt";
		SupplierFiler supplierFiler=new SupplierFiler(filePath);
		supplierList= supplierFiler.load();
	}
	
	private static void doStore() throws IOException {
		System.out.println("Saklaniyor...\n");

		String filePath="C:\\Users\\sevva\\Desktop\\github_projeler\\projem\\IBTech_Java_Bootcamp_Projects\\Supplier.txt";
		SupplierFiler supplierFiler=new SupplierFiler(filePath);
		supplierFiler.store(supplierList);
	}
	
	private static void doList() {
		System.out.println("Listeleniyor...\n");

		for(Supplier supplier : supplierList) {
			System.out.println(supplier.getSupplierId()+" "
				+ supplier.getSupplierName()+" "
				+ supplier.getTotalCredit());
		}
		System.out.println();
	}
	
	private static Supplier doFind(long supplierId) {
		System.out.println("Bulunuyor...\n");
		boolean found=false;
		for (Supplier supplier : supplierList) {
			if(supplier.getSupplierId()==supplierId) {
					System.out.println("Bulundu : "+supplier.getSupplierId()+" "
							+ supplier.getSupplierName()+" "
							+ supplier.getTotalCredit()+"\n");
					found=true;
					return supplier;
			}
		}
		if(!found) System.out.println("Bulunamadı : "+supplierId+"\n");
		return null;
	}
	private static void doAdd() {
		System.out.println("Ekleniyor...\n");
		
		System.out.println("SupplierId: ");
		long SupplierId=scanner.nextLong();
		
		System.out.println("SupplierName: ");
		String SupplierName= scanner.next();
		
		System.out.println("TotalCredit: ");
		double TotalCredit= scanner.nextDouble(); //virgullu gir noktali almiyo
		
		Supplier supplier=new Supplier(SupplierId,SupplierName,TotalCredit);
		
		supplierList.add(supplier);
		
		System.out.println("Eklendi : "+supplier.getSupplierId()+" "
				+ supplier.getSupplierName()+" "
				+ supplier.getTotalCredit()+"\n");
		
	}
	
	private static int findIndex(long supplierId) {
		
		int index=0;
		for (Supplier supplier : supplierList) {
			if(supplier.getSupplierId()==supplierId) {
					return index;
			}
			index++;
		}
		return 0;
	}

	private static void doUpdate() {
		
		System.out.println("Guncelleniyor...\n");
		System.out.println("Guncellemek istediginiz satimcinin id'sini girin: ");
		long supplierId=scanner.nextLong();
		
		if(doFind(supplierId)!=null ) {
			
			System.out.println("Guncellemek istediginiz satımcının yeni bilgilerini girin. ");

			System.out.println("SupplierId: ");
			long SupplierId=scanner.nextLong();
			
			System.out.println("SupplierName: ");
			String SupplierName= scanner.next();
			
			System.out.println("TotalCredit: ");
			double TotalCredit= scanner.nextDouble(); //virgullu gir noktali almiyo
			
			supplierList.get(findIndex(supplierId)).setSupplierId(SupplierId);
			supplierList.get(findIndex(supplierId)).setSupplierName(SupplierName);
			supplierList.get(findIndex(supplierId)).setTotalCredit(TotalCredit);

			System.out.printf("Güncellenen satımcının bilgileri:");
			System.out.printf("SupplierId: "+ SupplierId +" SupplierName: "+SupplierName + " TotalCredit: "+TotalCredit +"\n");
			
		}
		else {
			System.out.println("Satimci bulunamadi: "+supplierId);
		}
	}

	private static void doDelete(long supplierId) {
		System.out.println("Siliniyor...\n");
		
		if(doFind(supplierId)!=null ) {
			supplierList.remove(findIndex(supplierId));
			System.out.println("Satımcı silindi :  "+supplierId+"\n");
			
		}
		else {
			System.out.println("Satimci bulunamadi: "+supplierId+"\n");
		}
		
	}
	private static void doExit() {
		System.exit(0);
	}
	
	public static void main(String[] args) throws IOException {
		
		while(true) {
			printMenu();
			int choice=scanChoice();
			handleChoice(choice);
		}
	}
	
}
