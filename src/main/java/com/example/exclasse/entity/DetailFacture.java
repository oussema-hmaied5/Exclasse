package com.example.exclasse.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetailFacture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailFacture ;

    private Integer qte ;

    private  Float prixTotal ;

    private  Integer PourcentageRemise;

    private Integer montantRemise ;

    @ManyToOne
    Produit produit;

    @ManyToOne
    Facture facture ;

}
