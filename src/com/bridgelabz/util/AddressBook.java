package com.bridgelabz.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class AddressBook {

	private static List<Person> persons = new ArrayList<Person>();

	public AddressBook() {}
	
	public AddressBook(List<Person> persons2) {
		persons = persons2;
	}

	public void addPerson() {
		Person person = new Person();
		System.out.println("Enter first name");
		person.setFirstName(OopsUtility.userString());
		System.out.println("Enter last name");
		person.setLastName(OopsUtility.userString());
		System.out.println("Enter phone number");
		person.setPhoneNumber(OopsUtility.userLong());
		person.setAddress(getAddress());
		persons.add(person);
	}

	public Address getAddress() {
		Address address = new Address();
		System.out.println("Enter street");
		address.setStreet(OopsUtility.userString());
		System.out.println("Enter city");
		address.setCity(OopsUtility.userString());
		System.out.println("Enter state");
		address.setState(OopsUtility.userString());
		System.out.println("Enter Zip Code");
		address.setZipCode(OopsUtility.userLong());
		return address;
	}

	public void editPerson() {
		System.out.println("Enter the first name of the person which has to be edited");
		String fName = OopsUtility.userString();
		System.out.println("Enter the last name of the person which has to be edited");
		String lName = OopsUtility.userString();
		Optional<Person> optional = persons.parallelStream()
				.filter(person -> fName.equals(person.getFirstName()) && lName.equals(person.getLastName())).findAny();
		if (optional.isPresent()) {
		    editPerson(optional.get());
		} else {
			System.out.println("Entered first name and last name does not exist in address book");
		}
	}
	
	public void editPerson(Person existingPerson)
	{
		String reply= null;
		do {
			System.out.println("Whate do you want to edit");
			System.out.println("1.Phone Number 2.Address 3.Go Back");
			int choice1 = OopsUtility.userInteger();
			switch (choice1) {
			case 1:
				System.out.println("Enter the phone number which has to be edited");
				existingPerson.setPhoneNumber(OopsUtility.userLong());
				System.out.println("Phone number updated");
				break;
			case 2:
				existingPerson.setAddress(editAddress(existingPerson));
				break;
			case 3:
				break;
			default:
				System.out.println("Please select correct choice");
				break;
			}
			System.out.println("Would you like to edit more details for the person? Yes/No");
			reply = OopsUtility.userString();
		} while (reply.equalsIgnoreCase("Yes"));		
	}

	public Address editAddress(Person existingPerson) {
		System.out.println("Editing address now");
		Address address = existingPerson.getAddress();
		String reply = null;
		do {
			System.out.println("1.Street\n2.City\n3.State\n4.Zip Code\n5.To go back");
			int choice2 = OopsUtility.userInteger();
			switch (choice2) {
			case 1:
				System.out.println("Enter street which has to be edited");
				address.setStreet(OopsUtility.userString());
				break;
			case 2:
				System.out.println("Enter city which has to be edited");
				address.setCity(OopsUtility.userString());
				break;
			case 3:
				System.out.println("Enter state which has to be edited");
				address.setState(OopsUtility.userString());
				break;
			case 4:
				System.out.println("Enter Zip code which has to be edited");
				address.setZipCode(OopsUtility.userLong());
				break;
			case 5:
			default:
				System.out.println("Please select correct choice");
				break;
			}
			System.out.println("Would you like to edit more details for the person? Yes/No");
			reply = OopsUtility.userString();
		} while (reply.equalsIgnoreCase("Yes"));
		return address;
	}

	public void displayAddress() {
		if (!persons.isEmpty()) {
			persons.forEach(person -> {
				System.out.println("First name : " + person.getFirstName());
				System.out.println("Last name : " + person.getLastName());
				System.out.println("Phone number : " + person.getPhoneNumber());
				System.out.println("Address :\n");
				System.out.println("Street : " + person.getAddress().getStreet());
				System.out.println("City : " + person.getAddress().getCity());
				System.out.println("State : " + person.getAddress().getState());
				System.out.println("Zip Code : " + person.getAddress().getZipCode());
				System.out.println("--------------------------------------");
			});
		} else {
			System.out.println("Address book is empty");
		}
	}

	/**
	 * To delete a person
	 */
	public void deletePerson() {
		System.out.println("Enter the first name of the person which has to be deleted");
		String fName = OopsUtility.userString();
		System.out.println("Enter the last name of the person which has to be deleted");
		String lName = OopsUtility.userString();
		if (!persons.isEmpty()) {
			boolean isDeleted = persons.removeIf(person -> fName.equals(person.getFirstName()) && lName.equals(person.getLastName()));
			if (!isDeleted) {
				System.out.println("Entered first name and last name does not exist in address book");
			}
		} else {
			System.out.println("Address book is empty");
		}
		
	}

	public void sortByLastName() {
		Collections.sort(persons, (person1, person2) -> person1.getLastName().compareTo(person2.getLastName()));
		System.out.println("Sorted by last Name");
	}

	public void sortByZipCode() {
		Collections.sort(persons,
				(person1, person2) -> person1.getAddress().getZipCode() > person2.getAddress().getZipCode() ? 1
						: person1.getAddress().getZipCode() < person2.getAddress().getZipCode() ? -1
								: 0);
		System.out.println("Sorted via Zip code");

	}
}
