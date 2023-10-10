package tn.esprit.tp1universite;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

@Entity

public class Chambre implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChambre;
    private String numeroChambre;

    private TypeChambre TypeChambre;

    @ManyToOne
    private Bloc blocs;

    @OneToMany
    private Set<Reservation> reservations;
}
