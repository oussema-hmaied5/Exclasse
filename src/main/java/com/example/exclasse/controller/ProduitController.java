package com.example.exclasse.controller;


import com.example.exclasse.entity.Produit;
import com.example.exclasse.service.ServiceProduit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Produit")
public class ProduitController {

    @Autowired
    ServiceProduit sp ;

    @GetMapping("/retrieveallproduit")
    @ResponseBody
    public List<Produit> retrieveAllProduits()
    {
        return sp.retrieveAllProduits();
    }

    @PostMapping("/addProduit")
    @ResponseBody
    public Produit addProduit(@RequestBody Produit p,@RequestBody Long idRayon,@RequestBody Long idStock)
    {
        return sp.addProduit(p,idRayon,idStock);
    }

    @GetMapping("/retrieveProduit/{idProduit}")
    @ResponseBody
    public Produit retrieveProduit(@PathVariable Long idProduit)
    {
        return sp.retrieveProduit(idProduit);
    }

}
