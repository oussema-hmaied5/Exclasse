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
public class Stock implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idStock ;

    private Integer qteStock ;
    private Integer qteMin ;
    private String libelleStock ;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="stock")

    private Set<Produit> produit;
}
