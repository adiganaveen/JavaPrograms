package com.bridgelabz.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

public class CliniqueManager {
	static List<Doctor> doctors = new ArrayList<Doctor>();
	static List<Patient> patients = new ArrayList<Patient>();
	static List<Appointment> appointments = new ArrayList<>();
	//private static Appointment appointment1 = new Appointment();
	static final String DOCTOR_FILE = "/home/admin1/Documents/adiga_docs/New_Programs/Files/doctor.json";
	static final String PATIENT_FILE = "/home/admin1/Documents/adiga_docs/New_Programs/Files/patient.json";
	static final String APPOINTMENT_FILE = "/home/admin1/Documents/adiga_docs/New_Programs/Files/appointment.json";

	public static void add() throws IOException {
		System.out.println("Select your choice-\n1:To Add Doctor\n2:To Add Patient");
		int choice = OopsUtility.userInteger();
		switch (choice) {
		case 1:
			addDoctor();
			break;
		case 2:
			addPatient();
			break;
		}
	}

	public static void addDoctor() throws IOException {
		String string = OopsUtility.readFile(DOCTOR_FILE);
		try {
			doctors = OopsUtility.userReadValue(string, Doctor.class);
			System.out.println("File is not empty!");
		} catch (Exception e) {
			System.out.println("File is empty!");
		}
		doctors.add(doctorData());
		System.out.println("Doctor added successfully!!!");
		String json = OopsUtility.userWriteValueAsString(doctors);
		OopsUtility.writeFile(json, DOCTOR_FILE);
	}

	public static Doctor doctorData() {
		Doctor doctor = new Doctor();
		System.out.println("Doctor Id Automatically setted");
		doctor.setDocId(doctors.size() + 1);
		System.out.println("Enter the doctor's name");
		doctor.setDocName(OopsUtility.userString());
		System.out.println("Enter the specialization");
		doctor.setDocSpecialist(OopsUtility.userString());
		System.out.println("Enter the availability (a.m/p.m)");
		doctor.setAvailability(OopsUtility.userString());
		return doctor;
	}

	public static void addPatient() throws IOException {
		String string = OopsUtility.readFile(PATIENT_FILE);
		try {
			patients = OopsUtility.userReadValue(string, Patient.class);
			System.out.println("File is not empty!");
		} catch (Exception e) {
			System.out.println("File is empty!");
		}
		patients.add(patientData());
		System.out.println("Patient added successfully!!!");
		String json = OopsUtility.userWriteValueAsString(patients);
		OopsUtility.writeFile(json, PATIENT_FILE);
	}

	public static Patient patientData() {
		Patient patient = new Patient();
		System.out.println("Patient Id Automatically setted");
		patient.setpId(patients.size() + 1);
		System.out.println("Enter the patient's name");
		patient.setpName(OopsUtility.userString());
		System.out.println("Enter the age");
		patient.setpAge(OopsUtility.userInteger());
		System.out.println("Enter the phone number");
		patient.setPhNumber(OopsUtility.userLong());
		return patient;
	}

	public static void searchDoctor() throws JsonParseException, JsonMappingException, IOException {
		System.out.println("Enter the choice of property based on which you want to search");
		System.out.println("\n1:Search by ID \n2:Search By Name\n3:Search By Specialization\n4:Search By Availability");
		int choice = OopsUtility.userInteger();
		switch (choice) {
		case 1:
			System.out.println("Searching by id");
			List<Doctor> doctor1 = Search.searchById();
			if (!doctor1.isEmpty())
				System.out.println("Doctor is present");
			else
				System.out.println("Doctor is not present");
			break;
		case 2:
			System.out.println("Searching by name");
			List<Doctor> doctor2 = Search.searchByName();
			if (!doctor2.isEmpty())
				System.out.println("Doctor is present");
			else
				System.out.println("Doctor is not present");
			break;
		case 3:
			List<Doctor> doctor3 = Search.searchBySpecialization();
			if (!doctor3.isEmpty())
				System.out.println("Doctor is present");
			else
				System.out.println("Doctor is not present");
			break;
		case 4:
			List<Doctor> doctor4 = Search.searchByAvailability();
			if (!doctor4.isEmpty())
				System.out.println("Doctor is present");
			else
				System.out.println("Doctor is not present");
			break;
		default:
			System.out.println("Please select correct choice");
			break;

		}
	}

	public static void searchPatient() throws IOException {
		System.out.println("Enter the choice of property based on which you want to search");
		System.out.println("1:Search by ID  2:Search By Phone Number");
		int choice = OopsUtility.userInteger();
		switch (choice) {
		case 1:
			System.out.println("Searching by id");
			Patient patient1 = Search.searchByPatientId();
			if (patient1 != null)
				System.out.println("Patient is present");
			else
				System.out.println("Patient is not present");
			break;
		case 2:
			System.out.println("Searching by Phone Number");
			Patient patient2 = Search.searchByPhoneNo();
			if (patient2 != null)
				System.out.println("Patient is present");
			else
				System.out.println("Patient is not present");
			break;
		}
	}

	public static void search() throws JsonParseException, JsonMappingException, IOException {
		System.out.println("Select choice:\n1:Search Doctor\n2:Search Patient");
		int choice = OopsUtility.userInteger();
		switch (choice) {
		case 1:
			searchDoctor();
			break;
		case 2:
			searchPatient();
			break;
		}
	}

	public static void takeAppointment() throws IOException {
		String string = OopsUtility.readFile(APPOINTMENT_FILE);
		try {
			appointments = OopsUtility.userReadValue(string, Appointment.class);
			System.out.println("File is not empty");

		} catch (Exception e) {
			System.out.println("File is empty");
		}
		Patient patient = Search.searchByPhoneNo();
		if (patient != null) {
			System.out.println("Patient data already exist!!\nTaking appointment now....");
			appoint(patient);
			String json = OopsUtility.userWriteValueAsString(appointments);
			OopsUtility.writeFile(json, APPOINTMENT_FILE);
		} else {
			System.out.println("Patient data doesnot exist\nPlease first add patient detials on to database");
		}
	}

	public static void displayList(List<Doctor> docList) {
		for (Doctor doctor : docList) {
			System.out.println("Doctor's ID: " + doctor.getDocId());
			System.out.println("Doctor's name: " + doctor.getDocName());
			System.out.println("Doctor's specialization: " + doctor.getDocSpecialist());
			System.out.println("Doctor's availability: " + doctor.getAvailability());
		}
	}

	public static void searchDoc(List<Doctor> doctorList, Patient patient) {
		System.out.println("Enter id");
		int id = OopsUtility.userInteger();
		int flag = 1;
		try {
			for (Doctor doctor : doctorList) {
				if (id == doctor.getDocId()) {
					for (Appointment appointment : appointments) {
						if (doctor.getDocName().equals(appointment.getDocName())) {
							List<Patient> patientAppointmentList = appointment.getListOfPatients();
							if (patientAppointmentList.size() < 5) {
								for (Patient patient2 : patientAppointmentList) {
									if (patient2.getpId() == patient.getpId()) {
										System.out.println(
												"Appointment already set for today for this doctor cannot set again");
										flag = 0;
										break;
									} else {
										patientAppointmentList.add(patient);
										appointment.setListOfPatients(patientAppointmentList);
										System.out.println("Appointment is set");
										flag = 0;
										break;
									}
								}
							} else {
								System.out.println(
										"Appointment is full !!! Please wait for the next schedule or Select different doctor");
								flag = 0;
							}
							break;
						}
					}
					if (flag == 1) {
						setNewAppointment(patient,doctor);
					}
				}
			}

		} catch (Exception e) {
			System.out.println("Enter the correct id");
		}
	}
	public static void setNewAppointment(Patient patient,Doctor doctor)
	{
		Appointment appointment2 = new Appointment();
		List<Patient> patientList1 = new ArrayList<Patient>();
		patientList1.add(patient);
		appointment2.setDocName(doctor.getDocName());
		appointment2.setListOfPatients(patientList1);
		appointments.add(appointment2);
		System.out.println("Appointment is set");
	}
	public static void appoint(Patient patient) throws IOException {
		System.out.println("Search doctor by- 1:Name 2:Speciality 3:Availability");
		int choice = OopsUtility.userInteger();
		switch (choice) {
		case 1:
			List<Doctor> doctorList = Search.searchByName();
			displayList(doctorList);
			searchDoc(doctorList, patient);
			break;
		case 2:
			List<Doctor> doctorList1 = Search.searchBySpecialization();
			displayList(doctorList1);
			searchDoc(doctorList1, patient);
			break;
		case 3:
			List<Doctor> doctorList2 = Search.searchByAvailability();
			displayList(doctorList2);
			searchDoc(doctorList2, patient);
			break;
		}
	}

	public static void famousDoctor() throws IOException {
		String string = OopsUtility.readFile(APPOINTMENT_FILE);
		Map<String, Integer> map = new HashMap<>();
		try {
			appointments = OopsUtility.userReadValue(string, Appointment.class);
			for (int i = 0; i < appointments.size(); i++) {
				Appointment appointment = appointments.get(i);
				String doctorName = appointment.getDocName();
				Integer numberOfAppointments = appointment.getListOfPatients().size();
				map.put(doctorName, numberOfAppointments);
			}
			int maxValue = Collections.max(map.values());
			for (Entry<String, Integer> entry : map.entrySet()) {
				if (entry.getValue() == maxValue) {
					System.out.println(
							"Famous Doctor Name: " + entry.getKey() + "\nNo of appointments: " + entry.getValue());
				}
			}
		} catch (Exception e) {
			System.out.println("There are no doctors in the Hospital system.");
		}
	}

	public static void famousSpecialist() throws IOException {
		String string = OopsUtility.readFile(DOCTOR_FILE);
		List<String> list = new ArrayList<>();
		try {
			doctors = OopsUtility.userReadValue(string, Doctor.class);
			for (Doctor doctor : doctors) {
				for (Doctor doctor1 : doctors) {
					if (doctor.getDocSpecialist().equals(doctor1.getDocSpecialist())) {
						list.add(doctor.getDocSpecialist());
					}
				}
			}
			int max = 0;
			int curr = 0;
			String currKey = null;
			Set<String> unique = new HashSet<String>(list);
			for (String key : unique) {
				curr = Collections.frequency(list, key);
				if (max < curr) {
					max = curr;
					currKey = key;
				}
			}
			System.out.println(currKey + " is the famous specialization.");
		} catch (Exception e) {
			System.out.println("There are no doctors in the Hospital system.");
		}
	}
}
