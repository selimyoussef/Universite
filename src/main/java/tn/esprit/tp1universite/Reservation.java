package tn.esprit.tp1universite;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
@Entity

public class Reservation  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idReservation;
    private Date anneUniversitaire;
    private Boolean estValide;

    @ManyToMany
    private Set<Etudiant>etudiants;
}
