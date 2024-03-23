package com.akdriss.TPIIBDCCORMJPA.services;


import com.akdriss.TPIIBDCCORMJPA.entities.Medcin;
import com.akdriss.TPIIBDCCORMJPA.entities.Patient;
import com.akdriss.TPIIBDCCORMJPA.repositories.MedcinRepository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class MedcinService {

    @Autowired
    MedcinRepository medcinRepository;

    public Medcin saveMedcin(Medcin medcin){

        return medcinRepository.save(medcin);
    }

    public Optional<Medcin> findById(Long id){
        return medcinRepository.findById(id);
    }
}
