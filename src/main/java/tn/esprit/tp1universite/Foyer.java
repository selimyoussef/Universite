package tn.esprit.tp1universite;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity

public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFoyer;
    private String nomFoyer;
    private long capaciteFoyer;

    @OneToMany(mappedBy = "foyers")
    private Set<Bloc> blocs;

    @OneToOne(mappedBy = "foyers")
    Universite universites;

}
