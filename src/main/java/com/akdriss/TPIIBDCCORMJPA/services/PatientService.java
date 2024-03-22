package com.akdriss.TPIIBDCCORMJPA.services;

import com.akdriss.TPIIBDCCORMJPA.entities.Patient;
import com.akdriss.TPIIBDCCORMJPA.repositories.PatientRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
@NoArgsConstructor

public class PatientService {

    PatientRepository patientRepository;
    public Patient savePatient(Patient p){
        return patientRepository.save(p);

    }
}
