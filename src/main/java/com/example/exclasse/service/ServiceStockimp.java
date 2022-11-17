package com.example.exclasse.service;


import com.example.exclasse.entity.Produit;
import com.example.exclasse.entity.Stock;
import com.example.exclasse.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ServiceStockimp {

    @Autowired
    StockRepository sr ;

   public List<Stock> retrieveAllStocks()
   {
       return  (List<Stock>) sr.findAll();
   }

   public Stock addStock(Stock s)
   {
       return  sr.save(s) ;
   }

   public  Stock updateStock(Stock u)
   {
       return sr.save(u);
   }

   public Stock retrieveStock(Long idStock)
   {
    return sr.findById(idStock).get();
   }


}
