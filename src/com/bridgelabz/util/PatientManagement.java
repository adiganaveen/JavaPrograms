package com.bridgelabz.util;

import java.util.ArrayList;
import java.util.List;

public class PatientManagement {
	static List<Patient> liOfPatients = new ArrayList<Patient>();
	Patient patient=null;

	public void addPatient() {
		patient = new Patient();
		System.out.println("Setting id");
		patient.setpId(liOfPatients.size() + 1);
		System.out.println("Id set to " + liOfPatients.size() + 1);
		System.out.println("Enter the patient's name");
		patient.setpName(OopsUtility.userString());
		System.out.println("Enter the age");
		patient.setpAge(OopsUtility.userInteger());
		System.out.println("Enter the phone number");
		patient.setPhNumber(OopsUtility.userLong());
		liOfPatients.add(patient);
		System.out.println("Patient added successfully");
	}

	public void searchPatient() {
		System.out.println("Enter the choice of property based on which you want to search");
		System.out.println("1:Search by ID  2:Search By Phone Number");
		int choice = OopsUtility.userInteger();
		switch (choice) {
		case 1:
			System.out.println("Searching by id");
			searchById();
			break;
		case 2:
			System.out.println("Searching by Phone Number");
			searchByPhoneNo();
			break;
		}
	}

	public void searchById() {
		System.out.println("Enter the patient's name to be searched");
		int userPatient = OopsUtility.userInteger();
		try {
			for (Patient patient : liOfPatients) {
				if (userPatient == patient.getpId()) {
					System.out.println("Patient of id " + userPatient + " is present");
				}
			}
		} catch (Exception e) {
			System.out.println("Patient of id " + userPatient + " is not present");
		}
	}

	public void searchByPhoneNo() {
		System.out.println("Enter the patient's phone number to search");
		long userPatient = OopsUtility.userLong();
		try {
			for (Patient patient : liOfPatients) {
				if (userPatient == patient.getPhNumber()) {
					System.out.println("Patient of phone number " + userPatient + " is present");
				}
			}
		} catch (Exception e) {
			System.out.println("Patient of phone number " + userPatient + " is not present");
		}
	}

	public void displayPatient() {
		for (Patient patient : liOfPatients) {
			System.out.println("Patient ID : " + patient.getpId());
			System.out.println("Patient Name : " + patient.getpName());
			System.out.println("Patient Age : " + patient.getpAge());
			System.out.println("Patient Phone Number : " + patient.getPhNumber());
			System.out.println("----------------------------------------------------");
		}
	}
}
