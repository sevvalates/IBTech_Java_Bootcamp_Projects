package com.godoro.thread;

public class MyInnerTest {
	public static void main(String[] args) {
		
		//tek metod icin ayri bi class olusturmamak icin inner class yazıyoruz
		Runnable runnable=new Runnable(){
			@Override
			public void run() {
				walk();
			}
		};
		
		Thread thread=new Thread(runnable);
		thread.start();
		process();
	}

	private static void process() {
		while(true) {
			try {
				System.out.println("Suruyor...");
				Thread.sleep(750);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	private static void walk() {
		while(true) {
			try {
				System.out.println("Kosuyor...");
				Thread.sleep(500);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
