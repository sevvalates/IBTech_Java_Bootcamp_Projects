package com.godoro.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List<String> provinceList=new ArrayList<String>();
		provinceList.add("Istanbul");
		provinceList.add("Ankara");
		provinceList.add("Izmir");
		provinceList.add(1,"Bursa");
		provinceList.add("Adana");
		
		String found=provinceList.get(3);
		System.out.println("4. il :"+found);
		provinceList.remove("Izmir");
		//provinceList.remove(2);
		
		Collections.sort(provinceList,Comparator.reverseOrder());

		for (String province : provinceList) {
			System.out.println("* "+province);
		}

	}
}
