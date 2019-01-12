package com.bridgelabz.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddressBook {
	static List<Person> liOfPerson = new ArrayList<Person>();
	Person person = null;

	public void addPerson() {
		person = new Person();
		System.out.println("Enter first name");
		person.setfName(OopsUtility.userString());
		System.out.println("Enter last name");
		person.setlName(OopsUtility.userString());
		System.out.println("Enter phone number");
		person.setPhNumber(OopsUtility.userLong());
		Address address = new Address();
		System.out.println("Enter street");
		address.setStreet(OopsUtility.userString());
		System.out.println("Enter city");
		address.setCity(OopsUtility.userString());
		System.out.println("Enter state");
		address.setState(OopsUtility.userString());
		System.out.println("Enter Zip Code");
		address.setZipCode(OopsUtility.userLong());
		person.setAddress(address);
		liOfPerson.add(person);
	}

	public static List<Person> getLiOfPerson() {
		return liOfPerson;
	}

	public static void setLiOfPerson(List<Person> liOfPerson) {
		AddressBook.liOfPerson = liOfPerson;
	}

	public void editPerson() {
		System.out.println("Enter the first name of the person which has to be edited");
		String fName = OopsUtility.userString();
		System.out.println("Enter the last name of the person which has to be edited");
		String lName = OopsUtility.userString();
		int flag = 0;
		for (Person per : liOfPerson) {
			if (fName.equals(per.getfName()) && lName.equals(per.getlName())) {
				boolean run=true;
				while (run==true) {
					System.out.println("Whate do you want to edit");
					System.out.println("1.Phone Number 2.Address 3.Go Back");
					int choice1 = OopsUtility.userInteger();
					switch (choice1) {
					case 1:
						System.out.println("Enter the phone number which has to be edited");
						per.setPhNumber(OopsUtility.userLong());
						System.out.println("Phone number updated");
						run=true;
						break;
					case 2:
						System.out.println("Editing address now");
						Address add = per.getAddress();
						boolean run2=true;
						while (run2==true) {
							System.out.println("1.Street\n2.City\n3.State\n4.Zip Code\n5.To go back");
							int choice2 = OopsUtility.userInteger();
							switch (choice2) {
							case 1:
								System.out.println("Enter street which has to be edited");
								add.setStreet(OopsUtility.userString());
								run2=true;
								break;
							case 2:
								System.out.println("Enter city which has to be edited");
								add.setCity(OopsUtility.userString());
								run2=true;
								break;
							case 3:
								System.out.println("Enter state which has to be edited");
								add.setState(OopsUtility.userString());
								run2=true;
								break;
							case 4:
								System.out.println("Enter Zip code which has to be edited");
								add.setZipCode(OopsUtility.userLong());
								run2=true;
								break;
							case 5:run2=false;
							default:
								System.out.println("Please select correct choice");
								break;
							}
						}
						per.setAddress(add);
						run=true;
						break;
					case 3:run=false; 
						break;
					default:
						System.out.println("Please select correct choice");
						run=true;
						break;
					}
				}
			}
			flag = 1;
		}
		if (flag == 0) {
			System.out.println("Entered first name and last name does not exist in address book");
		}
	}

	public void displayAddress() {
		if (!liOfPerson.isEmpty()) {
			for (Person per2 : liOfPerson) {
				System.out.println("First name : " + per2.getfName());
				System.out.println("Last name : " + per2.getlName());
				System.out.println("Phone number : " + per2.getPhNumber());
				Address addr = per2.getAddress();
				System.out.println("Address :\n");
				System.out.println("Street : " + addr.getStreet());
				System.out.println("City : " + addr.getCity());
				System.out.println("State : " + addr.getState());
				System.out.println("Zip Code : " + addr.getZipCode());
				System.out.println("--------------------------------------");
			}
		} else {
			System.out.println("Address book is empty");
		}

	}

	public void deletePerson() {
		System.out.println("Enter the first name of the person which has to be deleted");
		String fName = OopsUtility.userString();
		System.out.println("Enter the last name of the person which has to be deleted");
		String lName = OopsUtility.userString();
		int flag = 0;
		if (!liOfPerson.isEmpty()) {
			for (Person per : liOfPerson) {
				if (fName.equals(per.getfName()) && lName.equals(per.getlName())) {
					liOfPerson.remove(per);
					System.out.println("Person removed from the address book ");
					break;
				}
				flag = 1;
			}
		} else {
			System.out.println("Address book is empty");
		}
		if (flag == 0) {
			System.out.println("Entered first name and last name does not exist in address book");
		}
	}

	public void sortByLastName() {
		Collections.sort(liOfPerson, (person1, person2) -> person1.getlName().compareTo(person2.getlName()));
		System.out.println("Sorted by last Name");
	}

	public void sortByZipCode() {
		Collections.sort(liOfPerson,
				(person1, person2) -> person1.getAddress().getZipCode() > person2.getAddress().getZipCode() ? 1
						: person1.getAddress().getZipCode() < person2.getAddress().getZipCode() ? -1
								: person1.getAddress().getZipCode() == person2.getAddress().getZipCode() ? 0 : -10);
		System.out.println("Sorted via Zip code");

	}
}
