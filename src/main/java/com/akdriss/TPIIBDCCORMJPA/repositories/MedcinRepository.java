package com.akdriss.TPIIBDCCORMJPA.repositories;

import com.akdriss.TPIIBDCCORMJPA.entities.Medcin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedcinRepository extends JpaRepository<Medcin,Long> {
}
