package com.akdriss.TPIIBDCCORMJPA.services;


import com.akdriss.TPIIBDCCORMJPA.entities.Consultation;
import com.akdriss.TPIIBDCCORMJPA.entities.Patient;
import com.akdriss.TPIIBDCCORMJPA.entities.RendezVous;
import com.akdriss.TPIIBDCCORMJPA.repositories.ConsultationRepository;
import com.akdriss.TPIIBDCCORMJPA.repositories.RDVRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor@NoArgsConstructor
public class ConsultationService {
    @Autowired
    ConsultationRepository consultationRepository;
    public Consultation saveConsultation(Consultation c){
        return consultationRepository.save(c);

    }

    public Optional<Consultation> findById(Long id){
        return consultationRepository.findById(id);
    }
}
