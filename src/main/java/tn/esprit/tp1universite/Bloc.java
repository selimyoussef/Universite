package tn.esprit.tp1universite;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;
@Entity
public class Bloc implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBloc;
    private String nomBloc;
    private long capaciteBloc;

    @ManyToOne
    private Foyer foyers;

    @OneToMany(mappedBy = "blocs")
    private Set<Chambre> chambres;
}
