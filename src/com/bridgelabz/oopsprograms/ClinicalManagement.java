package com.bridgelabz.oopsprograms;

import com.bridgelabz.util.DoctorManagement;
import com.bridgelabz.util.OopsUtility;
import com.bridgelabz.util.PatientManagement;

public class ClinicalManagement {
	public static void main(String[] args) {
		
		DoctorManagement doctorManagement=new DoctorManagement();
		PatientManagement patientManagement=new PatientManagement();
		
		boolean isRunning = true;
		while (isRunning) {
			System.out.println("Enter the choice");
			System.out.println("1:Add  2:Search  3:Display");
			int choice=OopsUtility.userInteger();
			switch(choice){
			case 1:
				System.out.println("Enter: 1:To Add Doctor  2:To Add Patient");
				int ch=OopsUtility.userInteger();
				switch(ch){
				case 1:
					doctorManagement.addDoctor();
					break;
				case 2:
					patientManagement.addPatient();
					break;
				}
				isRunning=true;
				break;
			case 2:
				System.out.println("Enter: 1:To Search Doctor  2:To Search Patient");
				int choose=OopsUtility.userInteger();
				switch(choose){
				case 1:
					doctorManagement.searchDooctor();
					break;
				case 2:
					patientManagement.searchPatient();
					break;
				}
				isRunning=true;
				break;
			case 3:
				System.out.println("Enter: 1:To Display Doctor  2:To Display Patient");
				int chose=OopsUtility.userInteger();
				switch(chose){
				case 1:
					doctorManagement.displayDoctor();;
					break;
				case 2:
					patientManagement.displayPatient();;
					break;
				}
				break;
			default:
				System.out.println("Invalid choice");
				isRunning=false;
				break;
			}
		}
	}
}
