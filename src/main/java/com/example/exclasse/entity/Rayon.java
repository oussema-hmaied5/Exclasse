package com.example.exclasse.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rayon implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idRayon ;

    private String CodeRayon ;
    private String libelleRayon ;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="rayon")

    private Set<Produit> produit;
}
