package com.example.exclasse.service;


import com.example.exclasse.entity.Produit;
import com.example.exclasse.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceProduit {

    @Autowired
    ProduitRepository pr ;

   public List<Produit> retrieveAllProduits()
   {
       return (List<Produit>) pr.findAll();
   }

   public Produit addProduit(Produit p, Long idRayon, Long idStock)
   {
       return pr.save(p);
   }

   public Produit retrieveProduit(Long idProduit)
   {
       return pr.findById(idProduit).get();
   }

}
