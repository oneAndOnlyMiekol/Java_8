package app;

import data.Doctor;
import data.Nurse;
import logic.Hospital;

public class HospitalApp {
	
	public static void main(String[] args) {
		
		Hospital hospital = new Hospital();
		
		hospital.add(new Nurse("Anna", "Block", 1300, 50.5));
		hospital.add(new Doctor("Adam", "Jansen", 5600, 3000));
		hospital.add(new Nurse("Janet", "Shellstrop", 1600, 70.2));
		
		System.out.println(hospital);
	
	}
	
	
	
	

}
