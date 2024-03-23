package com.akdriss.TPIIBDCCORMJPA.services;

import com.akdriss.TPIIBDCCORMJPA.entities.Patient;
import com.akdriss.TPIIBDCCORMJPA.entities.RendezVous;
import com.akdriss.TPIIBDCCORMJPA.repositories.PatientRepository;
import com.akdriss.TPIIBDCCORMJPA.repositories.RDVRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor @NoArgsConstructor
public class RendezVousService {

    @Autowired
    RDVRepository rdvRepository;
    public RendezVous saveRendezVous(RendezVous r){
        return rdvRepository.save(r);

    }

    public  RendezVous findFirsts(){
        return rdvRepository.findAll().get(0);
    }
}
