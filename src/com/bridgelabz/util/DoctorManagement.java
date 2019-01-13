package com.bridgelabz.util;

import java.util.ArrayList;
import java.util.List;

public class DoctorManagement {
	static List<Doctor> liOfDoctors = new ArrayList<Doctor>();
	Doctor doctor = null;

	public void addDoctor() {
		doctor = new Doctor();
		System.out.println("Setting id");
		doctor.setDocId(liOfDoctors.size() + 1);
		System.out.println("Id set to " + liOfDoctors.size() + 1);
		System.out.println("Enter the doctor's name");
		doctor.setDocName(OopsUtility.userString());
		System.out.println("Enter the specialization");
		doctor.setDocSpecialist(OopsUtility.userString());
		System.out.println("Enter the availability");
		doctor.setAvailability(OopsUtility.userString());
		liOfDoctors.add(doctor);
	}

	public void searchDooctor() {
		System.out.println("Enter the choice of property based on which you want to sort");
		System.out.println("1:Search by ID  2:Search By Name  3:Search By Specialization");
		int choice = OopsUtility.userInteger();
		switch (choice) {
		case 1:
			System.out.println("Searching by id");
			searchById();
			break;
		case 2:
			System.out.println("Searching by name");
			searchByName();
			break;
		case 3:
			System.out.println("Searching by specialization");
			searchBySpecialization();
			break;
		case 4:
			System.out.println("Searching by availability");
			searchByAvailability();
			break;
		default:
			System.out.println("Please select correct choice ");

		}
	}

	public void searchByName() {
		System.out.println("Enter the doctor's name to be searched");
		String userDoc = OopsUtility.userString();
		try {
			for (Doctor doctor : liOfDoctors) {
				if (userDoc.equals(doctor.getDocName())) {
					System.out.println(userDoc + " is present");
				}
			}
		} catch (Exception e) {
			System.out.println(userDoc + " not found");
		}
	}

	public void searchById() {
		System.out.println("Enter the doctor's id to be searched");
		int userDoc = OopsUtility.userInteger();
		try {
			for (Doctor doctor : liOfDoctors) {
				if (userDoc == doctor.getDocId()) {
					System.out.println("Doctor of id " + userDoc + " is present");
				}
			}
		} catch (Exception e) {
			System.out.println("Doctor of id " + userDoc + " is not present");
		}
	}

	public void searchBySpecialization() {
		System.out.println("Enter the doctor's specialization to be searched");
		String userDoc = OopsUtility.userString();
		try {
			for (Doctor doctor : liOfDoctors) {
				if (userDoc.equals(doctor.getDocSpecialist())) {
					System.out.println("Doctor of the " + userDoc + " specialization is present");
				}
			}
		} catch (Exception e) {
			System.out.println("Doctor of the " + userDoc + " specialization is not present");
		}
	}

	public void searchByAvailability() {
		System.out.println("Enter when you need the doctor (eg: am/pm)");
		String userDoc = OopsUtility.userString();
		try {
			for (Doctor doctor : liOfDoctors) {
				if (userDoc.equals(doctor.getAvailability())) {
					System.out.println(doctor.getDocName() + " of id " + doctor.getDocId() + " is available");
				}
			}
		} catch (Exception e) {
			System.out.println("No doctors are available at this hour");
		}
	}

	public void displayDoctor() {
		for (Doctor doctor : liOfDoctors) {
			System.out.println("Doctor ID: " + doctor.getDocId());
			System.out.println("Doctor Name: " + doctor.getDocName());
			System.out.println("Doctor Specialization: " + doctor.getDocSpecialist());
			System.out.println("Doctor Availability: " + doctor.getAvailability());
			System.out.println("----------------------------------------------------");
		}
	}
}
