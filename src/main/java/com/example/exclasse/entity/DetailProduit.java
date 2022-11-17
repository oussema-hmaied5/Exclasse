package com.example.exclasse.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetailProduit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailProduit; // Clé primaire
    private Date dateCreation ;
    private Date dateDernierreModification ;
    @Enumerated(EnumType.STRING)
    private CategoryProduit categoryProduit ;



    @ManyToOne
    Produit produit ;

    @ManyToOne
    Facture facture ;




}


