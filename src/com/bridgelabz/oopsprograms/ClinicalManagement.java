package com.bridgelabz.oopsprograms;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.util.CliniqueManager;
import com.bridgelabz.util.OopsUtility;

public class ClinicalManagement {
	public static void main(String[] args) throws IOException, JsonMappingException, JsonParseException {
		boolean run = true;
		while (run) {
			System.out.println("Enter the choice");
			System.out.println("1:Add\n2:Search\n3:Take Appointment\n4:Famous Doctor\n5.Famous Specialist\n6:Exit");
			int choice = OopsUtility.userInteger();
			switch (choice) {
			case 1:
				CliniqueManager.add();
				run = true;
				break;
			case 2:
				CliniqueManager.search();
				run = true;
				break;
			case 3:
				CliniqueManager.takeAppointment();
				run = true;
				break;
			case 4:
				CliniqueManager.famousDoctor();
				run = true;
				break;
			case 5:
				CliniqueManager.famousSpecialist();
				run = true;
				break;
			case 6:System.out.println("Thank you");
				System.exit(0);
				run = true;
				break;
			default:
				System.out.println("Please select correct choice");
				run = true;
				break;
			}
		}
	}
}
