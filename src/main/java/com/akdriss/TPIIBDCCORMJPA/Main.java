package com.akdriss.TPIIBDCCORMJPA;

import com.akdriss.TPIIBDCCORMJPA.entities.Patient;
import com.akdriss.TPIIBDCCORMJPA.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Main  implements CommandLineRunner {
	@Autowired
	PatientRepository patientRepository;

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	/**
	 * FIRST PART OF THE ASSIGNMENT
	 * @param args
	 * @throws Exception
	 */
	@Override
	public void run(String... args) throws Exception {

		Patient patient1 =new Patient();
		patient1.setNom("ahmed");
		patient1.setMalade(true);
		patient1.setScore(8);
		patient1.setDateNaissanec(new Date());


		Patient patient2 =new Patient();
		patient2.setNom("hassan");
		patient2.setMalade(true);
		patient2.setScore(10);
		patient2.setDateNaissanec(new Date());


		Patient patient3 =new Patient();
		patient3.setNom("adil");
		patient3.setMalade(false);
		patient3.setScore(22);
		patient3.setDateNaissanec(new Date());

		System.out.println("begin saving patients .....");
		patientRepository.save(patient1);
		patientRepository.save(patient2);
		patientRepository.save(patient3);

		System.out.println("done saving patients .....");
		System.out.println();

		System.out.println("fetching all patients .....");
		List<Patient> patientList=patientRepository.findAll();
		System.out.println(patientList);
		System.out.println();

		System.out.println("fetching 1st patient .....");
		Optional<Patient> firstPatient=patientRepository.findById(1L);
        firstPatient.ifPresent(System.out::println);
		System.out.println();

		System.out.println("updating 1st patient .....");
		firstPatient.get().setScore(99);
		patientRepository.save(firstPatient.get());
		System.out.println(firstPatient);
		System.out.println();

		System.out.println("deleting 3rd patient .....");
		patientRepository.deleteById(1l);
		System.out.println(patientList);






	}
}
