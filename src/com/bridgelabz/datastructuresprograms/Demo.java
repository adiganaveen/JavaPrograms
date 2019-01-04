package com.bridgelabz.datastructuresprograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.LinkedList;

public class Hashing {
	public static void main(String[] args){
		LinkedList<Integer> linkedList1=new LinkedList<>();
		LinkedList<Integer> linkedList2 = null;
		Map<Integer, LinkedList<Integer>> map=new HashMap<Integer, LinkedList<Integer>>();
		for(int i=0;i<10;i++){
			linkedList2 = new LinkedList<>();
			map.put(i, linkedList2);
		}
		
		FileReader fr=new FileReader("C:\\Users\\Nikita\\Desktop\\HashNumb.csv");
		BufferedReader br=new BufferedReader(fr);
		int rem;
		String num;
		String delimitor=",";
		while((num=br.readLine())!=null){
			String number[]=num.split(delimitor);
			for(String numb:number){
				linkedList1.add(Integer.parseInt(numb));
			}
		}
		System.out.println("The numbers in the file are:");
		linkedList1.printList();
		System.out.println();
		int len=linkedList1.size();
		String[] array=new String[len];
		String [] array2=linkedList1.convInteger(array);
		int[] res=linkedList1.convertIntArray(array2);
		int[] sorted=linkedList1.sort(res);
		System.out.println("The sorted array are:");
		for(int s:sorted)
			System.out.print(s+" ");
		System.out.println();
		System.out.println("Diving each number by 11");
		for(int i=0;i<sorted.length;i++){
			rem=sorted[i]%11;
			if(map.isEmpty()){
				linkedList2.add(sorted[i]);
				map.put(rem, linkedList2);
			}
			else{
				map.put(rem, linkedList2);
				linkedList2=map.get(rem);
				if(linkedList2.size()==0){
					linkedList2.add(sorted[i]);
				}
				else{
					if(!linkedList2.search(sorted[i])){
						linkedList2.add(sorted[i]);
					}
				}
				
			}
		}
		int n=0;
		do{
			System.out.println("Enter choice");
			System.out.println("1:Search for the number  2:Write  3:Exit");
			int choice=DataStructureUtility.userInteger();
			switch(choice){
			case 1: System.out.println("Enter the number to search");
					int user_num=DataStructureUtility.userInteger();
					boolean rs=linkedList2.search(user_num);
					if(rs){
						System.out.println("The number is found");
						System.out.println("Fetching the index of the number");
						int index=linkedList2.index(user_num);
						System.out.println(index);
						linkedList2.remove(index);
						System.out.println("The list after removing the number");
						linkedList2.printList();
					}
					else{
						System.out.println("Number not found");
						linkedList2.add(user_num);
						System.out.println("The list after adding the not found element");
						linkedList2.printList();
					}
					break;
			case 2: System.out.println("Writing the modifications into the file..");
					FileWriter fw=new FileWriter("C:\\Users\\Nikita\\Desktop\\HashNumb.csv");
					BufferedWriter bw=new BufferedWriter(fw);
					int leng=linkedList2.size();
					String[] res_array=new String[leng];
					String[] result=linkedList2.convArray(res_array);
					for(int i=0;i<result.length;i++){
						bw.write(result[i]+", ");
					}
					br.close();
					bw.close();
					break;
			case 3: System.out.println("Invalid choice");
					System.exit(0);
			}
			n++;
		}while(n<5);
		
		br.close();
	}

}
