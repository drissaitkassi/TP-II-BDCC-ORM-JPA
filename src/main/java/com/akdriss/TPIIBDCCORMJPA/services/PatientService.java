package com.akdriss.TPIIBDCCORMJPA.services;

import com.akdriss.TPIIBDCCORMJPA.entities.Patient;
import com.akdriss.TPIIBDCCORMJPA.repositories.PatientRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;


@Service
@AllArgsConstructor
@NoArgsConstructor
public class PatientService {

    @Autowired
    PatientRepository patientRepository;
    public Patient savePatient(Patient p){
        return patientRepository.save(p);

    }

    public Optional<Patient> findById(Long id){
        return patientRepository.findById(id);
    }
}
