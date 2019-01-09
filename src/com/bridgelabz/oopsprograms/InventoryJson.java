package com.bridgelabz.oopsprograms;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.util.Inventory;
import com.bridgelabz.util.InventoryList;
import com.bridgelabz.util.OopsUtility;



public class InventoryJson {
	public static void main(String[] args) throws IOException {

		String str="/home/admin1/Documents/adiga_docs/Programs/Files/json1.json";
		ObjectMapper objectMapper = new ObjectMapper();
		List<InventoryList> list2=new ArrayList<InventoryList>();
		List<InventoryList> list1 = new ArrayList<InventoryList>();
		InventoryList inventoryList = new InventoryList();
		inventoryList.setInventoryName("rice");
		Inventory inventory = new Inventory();
		inventory.setName("basmati");
		inventory.setWeight(40);
		inventory.setPrice(12);
		List<Inventory> liInventories = new ArrayList<Inventory>();
		liInventories.add(inventory);
		inventoryList.setListOfInventories(liInventories);
		list1.add(inventoryList);

//		String json = objectMapper.writeValueAsString(list1);	

//		int z=0;
//		do
//		{
//		System.out.println("1.read from file\n2.add to file\n3.write to file\n4.check for price\n5.exit");
//		int choice=OopsUtility.userInteger();
//		switch(choice)
//		{
//		case 1:String file=OopsUtility.readFile(str);
//				try
//				{
//				list2 = objectMapper.readValue(file, new TypeReference<List<InventoryList>>() {});
//				for(int i=0;i<list2.size();i++)
//					{
//						InventoryList it = list2.get(i);
//						System.out.println("Inventory name :"+it.getInventoryName());
//						for(int j=0;j<it.getListOfInventories().size();j++)
//						{
//						System.out.println("name :"+it.getListOfInventories().get(j).getName());
//						System.out.println("price :"+it.getListOfInventories().get(j).getPrice());
//						System.out.println("weight :"+it.getListOfInventories().get(j).getWeight());
//						System.out.println();
//						}
//						System.out.println("---------------------------------------------");
//					}
//				}
//				catch(Exception e)
//				{
//					System.out.println("file is empty!! first add inputs on to file or select second choice");
//				}
//				break;
//		case 2:for(int i=0;i<list2.size();i++)
//				{
//				InventoryList it = list2.get(i);
//				if(it.getInventoryName
//				for(int j=0;j<it.getListOfInventories().size();j++)
//				{
//				}
//				}
//				break;
//		case 3:
//				break;
//		case 4:
//				break;
//		case 5:System.exit(0);break;
//		default: System.out.println("please select correct choice");
//				break;
//		
//		}
//		z++;
//		}while(z<30);
	}
}
		


