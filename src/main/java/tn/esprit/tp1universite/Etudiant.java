package tn.esprit.tp1universite;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
@Entity

public class Etudiant  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEtudiant;
    private String nomEtudiant;
    private String prenomEtudiant;
    private long cin;
    private String ecole;
    private Date dateNaissance;

    @ManyToMany(mappedBy = "etudiants")
    private Set<Reservation>reservations;

}
