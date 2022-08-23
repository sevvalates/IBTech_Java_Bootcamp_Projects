package com.godoro.inheritance;

public class Test {
	
	public static void main(String[] args) {
		Customer customer = new Customer(481,"Neset","Ertas",3450);
		customer.setEmailAddress("neset@godoro.com");

		Person person=new Customer(402,"Mahsuni","Serif",6540);
		person.setEmailAddress("mahsuni@godoro.com");

		Supplier supplier = new Supplier(701,"Orhan","Gencebay",8125);
		supplier.setEmailAddress("orhan@godoro.com");

		System.out.println(customer.getGreetings()+" "+customer.getFullName());
		System.out.println(person.getGreetings()+" "+person.getFullName());
		System.out.println(supplier.getGreetings()+" "+supplier.getFullName());
		
		sendMail(customer);
		sendMail(person);
		sendMail(supplier);

	}
	
	private static void sendMail(Person person) {
		System.out.println();
		System.out.println("Kime: "+person.getEmailAddress());
		System.out.println("Konu: "+person.getGreetings());
		System.out.println("Gövde: "+person.getFullName());
	}

}
