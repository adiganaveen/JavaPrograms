package com.bridgelabz.datastructuresprograms;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.DataStructureUtility;

public class RangeOfPrimeNumbers {
	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> list1 = new ArrayList<Integer>();
		int low = 0;
		int high = 100;

		for (int i = 0; i < 10; i++) {
			list1 = DataStructureUtility.findPrime(low, high);
			list.add(list1);
			low += 100;
			high += 100;
		}
//        System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			List<Integer> onlyPrime = list.get(i);
			for (int j = 0; j < onlyPrime.size(); j++) {
				System.out.print(onlyPrime.get(j) + " ");
			}
			System.out.println();
		}
	}

}
