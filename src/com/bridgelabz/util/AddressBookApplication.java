package com.bridgelabz.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class AddressBookApplication {
	AddressBook addressBook = null;
	static List<AddressBook> liOfAddressBook = new ArrayList<AddressBook>();
	ObjectMapper objectMapper=new ObjectMapper();

	public void createBook() throws IOException {
		System.out.println("Enter name of address book");
		String book = OopsUtility.userString();
		File file = new File("/home/admin1/Documents/adiga_docs/Programs/JavaPrograms/" + book + ".json");
		boolean rs = file.createNewFile();
		if (rs) {
			System.out.println("File is created");
		} else {
			System.out.println("File of that name already exists");
		}
	}
	public void openBook() throws IOException{
		System.out.println("Files available");
		File[] arrayOfFiles = new File(System.getProperty(System.getProperty("user.dir"))).listFiles();
		System.out.println("List of files are :");
		for(File file:arrayOfFiles)
		{
			System.out.print(file+" ");
		}
		//String str=OopsUtility.readFile("/home/admin1/Documents/adiga_docs/Programs/Files/Address/address.json");
		//try{
		//	liOfAddressBook=objectMapper.readValue(str, new TypeReference<List<AddressBook>>() {});
		//	
		//}catch(Exception e){
		//	System.out.println("File is empty!");
		//}
	}

}
