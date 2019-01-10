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

		String str = "/home/admin1/Documents/adiga_docs/Programs/Files/json1.json";
		ObjectMapper objectMapper = new ObjectMapper();
		List<InventoryList> list2 = new ArrayList<InventoryList>();
		List<Inventory> liInventories=null;
//		List<InventoryList> list1 = new ArrayList<InventoryList>();
//		list1.add(inventoryList);

		int z = 0;
		do {
			System.out.println("1.read from file\n2.add to file\n3.write to file\n4.check for price\n5.exit");
			int choice = OopsUtility.userInteger();
			switch (choice) {
			case 1:
				String file = OopsUtility.readFile(str);
				try {
					list2 = objectMapper.readValue(file, new TypeReference<List<InventoryList>>() {
					});
					for (int i = 0; i < list2.size(); i++) {
						InventoryList it = list2.get(i);
						System.out.println("Inventory name :" + it.getInventoryName());
						for (int j = 0; j < it.getListOfInventories().size(); j++) {
							System.out.println("name :" + it.getListOfInventories().get(j).getName());
							System.out.println("price :" + it.getListOfInventories().get(j).getPrice());
							System.out.println("weight :" + it.getListOfInventories().get(j).getWeight());
							System.out.println();
						}
						System.out.println("---------------------------------------------");
					}
				} catch (Exception e) {
					System.out.println("file is empty!! first add inputs on to file or select second choice");
				}
				break;
			case 2:
				System.out.println("Enter the inventory name i.e rice, wheat,pulses(int small letters)");
				String inventoryName = OopsUtility.userString();
				int op=1;
				while(op==1)
				{
				System.out.println("Enter name of inventory");
				String name = OopsUtility.userString();
				System.out.println("Enter weight of inventory");
				float weight = OopsUtility.userFloat();
				System.out.println("Enter price of inventory");
				double price = OopsUtility.userDouble();
				liInventories = OopsUtility.insertInventory(name, weight, price);
				System.out.println("wish to add some more inventorry(1 or 0)");
				op=OopsUtility.userInteger();
				}
				InventoryList inventoryList=OopsUtility.insertInventoryList(inventoryName, liInventories);
				list2.add(inventoryList);
				System.out.println("Entered elements has been added to list");
				break;
			case 3:
				String json = objectMapper.writeValueAsString(list2);
				OopsUtility.write(json);
				System.out.println("Inventory list has been written on to file");
				break;
			case 4:
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("please select correct choice");
				break;

			}
			z++;
		} while (z < 30);
	}
}
