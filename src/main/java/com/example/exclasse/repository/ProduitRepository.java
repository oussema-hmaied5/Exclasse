package com.example.exclasse.repository;

import com.example.exclasse.entity.Produit;
import org.springframework.data.repository.CrudRepository;

public interface ProduitRepository extends CrudRepository<Produit,Long> {
}
