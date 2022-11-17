package com.example.exclasse.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient; // Clé primaire

    private String nom ;
    private String prenom ;
    private Date dateNaissance ;
    private String email ;
    private String password ;
    @Enumerated(EnumType.STRING)
     private CategoryClient categoryClient ;
    @Enumerated(EnumType.STRING)
    private Profession profession ;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="client")
    private Set<Facture> facture;









}
