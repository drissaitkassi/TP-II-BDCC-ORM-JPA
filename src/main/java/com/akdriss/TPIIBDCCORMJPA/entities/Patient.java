package com.akdriss.TPIIBDCCORMJPA.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Patient {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    @Temporal(TemporalType.DATE)
    private Date dateNaissanec;
    private boolean malade;
    private int score;
    @OneToMany(mappedBy = "patient")
    private Collection<RendezVous> rendezVous;

}
