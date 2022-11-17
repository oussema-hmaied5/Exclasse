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
public class Produit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFacture ;
    private String codeProduit ;
    private String LibelleProduit ;
    private Float prixUnitaire ;

    @OneToOne
    private DetailProduit detailProduit;

   @ManyToOne
    Stock stock ;

   @ManyToOne
    Rayon rayon ;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="produit")
    private Set<DetailProduit> detailProduits;
}
