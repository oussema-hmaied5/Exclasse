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
public class Facture implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long idFacture ;

    private String codeProduit ;
    private String LibelleProduit ;
    private Float prixUnitaire ;

    @ManyToOne
    Client client ;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="facture")
    private Set<DetailProduit> detailProduits;



}

