package com.bridgelabz.oopsprograms;

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

		final String str = "/home/admin1/Documents/adiga_docs/Programs/Files/json1.json";
		ObjectMapper objectMapper = new ObjectMapper();
		List<InventoryList> list2 = new ArrayList<InventoryList>();
		InventoryList inventoryList = new InventoryList();
		List<Inventory> liInventories = new ArrayList<Inventory>();
		String file = "";
		int z = 0;
		do {
			System.out.println("1.Display file\n2.Add to file\n3.Check for price\n4.exit");
			int choice = OopsUtility.userInteger();
			switch (choice) {
			case 1:
				file = OopsUtility.readFile(str);
				try {
					list2 = objectMapper.readValue(file, new TypeReference<List<InventoryList>>() {
					});
					OopsUtility.display(list2);
				} catch (Exception e) {
					System.out.println("file is empty!! first add inputs on to file or select second choice");
				}
				break;
			case 2:
				file = OopsUtility.readFile(str);
				list2 = objectMapper.readValue(file, new TypeReference<List<InventoryList>>() {});
				String [] arr= {"","rice","wheat","pulses"};
				System.out.println("Select the inventory name \n 1.rice 2.wheat 3.pulses");
				int option=OopsUtility.userInteger();
				int op = 1, flag = 0;
				while (op == 1) {
					for (InventoryList invenList : list2) {
						if (arr[option].equals(invenList.getInventoryName())) {
							liInventories = invenList.getListOfInventories();
							Inventory inventory = OopsUtility.insertInventoryDetail();
							liInventories.add(inventory);
							flag = 1;
						}
					}
					if (flag == 0) {
						Inventory inventory = OopsUtility.insertInventoryDetail();
						liInventories.add(inventory);
						inventoryList = OopsUtility.insertInventoryList(arr[option], liInventories);
						list2.add(inventoryList);
					}
					System.out.println("wish to add some more inventorry(1 or 0)");
					op = OopsUtility.userInteger();
				}
				
				System.out.println("Entered elements has been added to list");
				String json = objectMapper.writeValueAsString(list2);
				OopsUtility.writeFile(json,str);
				System.out.println("Inventory list has been written on to file");
				break;
			case 3:
				file = OopsUtility.readFile(str);
				list2 = objectMapper.readValue
						(file, new TypeReference<List<InventoryList>>() {
				});
				OopsUtility.price(list2);
				break;
			case 4:
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
