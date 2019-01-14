package com.bridgelabz.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Search {
	public static List<Doctor> searchByName() throws IOException {
		String string = OopsUtility.readFile(CliniqueManager.doctorFile);
		try {
			CliniqueManager.listOfDoctor = OopsUtility.userReadValue(string, Doctor.class);
			List<Doctor> list = new ArrayList<>();
			System.out.println("Enter the doctor's name to be searched");
			String name = OopsUtility.userString();
			System.out.println(name);
			for (Doctor doctor : CliniqueManager.listOfDoctor) {
				if (name.equals(doctor.getDocName())) {
					list.add(doctor);
				}
			}
			return list;
		} catch (Exception e) {
			System.out.println("File is empty!");
			return null;
		}

	}

	public static List<Doctor> searchById() throws IOException {
		String string = OopsUtility.readFile(CliniqueManager.doctorFile);
		try {
			CliniqueManager.listOfDoctor = OopsUtility.userReadValue(string, Doctor.class);
			List<Doctor> list = new ArrayList<>();
			System.out.println("Enter the doctor's id to be searched");
			int id = OopsUtility.userInteger();
			for (Doctor doctor : CliniqueManager.listOfDoctor) {
				if (id == doctor.getDocId()) {
					list.add(doctor);

				}
			}
			return list;
		} catch (Exception e) {
			System.out.println("File is empty! Doctor cannot be searched");
			return null;
		}

	}

	public static List<Doctor> searchBySpecialization() throws IOException {
		String string = OopsUtility.readFile(CliniqueManager.doctorFile);
		try {
			CliniqueManager.listOfDoctor = OopsUtility.userReadValue(string, Doctor.class);
			List<Doctor> list = new ArrayList<>();
			System.out.println("Enter the doctor's name to be searched");
			String specialization = OopsUtility.userString();
			for (Doctor doctor : CliniqueManager.listOfDoctor) {
				if (specialization.equals(doctor.getDocSpecialist())) {
					list.add(doctor);
				}
			}

			return list;
		} catch (Exception e) {
			System.out.println("File is empty! Doctor cannot be searched");
			return null;
		}

	}

	public static List<Doctor> searchByAvailability() throws IOException {
		String string = OopsUtility.readFile(CliniqueManager.doctorFile);
		try {
			CliniqueManager.listOfDoctor = OopsUtility.userReadValue(string, Doctor.class);
			List<Doctor> list = new ArrayList<>();
			System.out.println("Enter when you need the doctor (eg: am/pm)");
			String availability = OopsUtility.userString();
			for (Doctor doctor : CliniqueManager.listOfDoctor) {
				if (availability.equals(doctor.getAvailability())) {
					list.add(doctor);
				}
			}
			return list;
		} catch (Exception e) {
			System.out.println("File is empty! Doctor cannot be searched");
			return null;
		}

	}

	public static Patient searchByPatientId() throws IOException {
		String string = OopsUtility.readFile(CliniqueManager.patientFile);
		CliniqueManager.listOfPatients = OopsUtility.userReadValue(string, Patient.class);
		System.out.println("Enter the patient's id to be searched");
		int id = OopsUtility.userInteger();
		for (Patient patient : CliniqueManager.listOfPatients) {
			if (id == patient.getpId()) {
				return patient;
			}
		}
		return null;
	}

	public static Patient searchByPhoneNo() throws IOException {
		String string = OopsUtility.readFile(CliniqueManager.patientFile);
		CliniqueManager.listOfPatients = OopsUtility.userReadValue(string, Patient.class);
		System.out.println("Enter the patient's phone number to search");
		long phoneNo = OopsUtility.userLong();

		for (Patient patient : CliniqueManager.listOfPatients) {
			if (phoneNo == patient.getPhNumber()) {
				return patient;
			}
		}
		return null;
	}
}
