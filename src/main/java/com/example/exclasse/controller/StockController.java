package com.example.exclasse.controller;


import com.example.exclasse.entity.Stock;
import com.example.exclasse.service.ServiceStockimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Stock")
public class StockController {

    @Autowired
    ServiceStockimp ss ;

    @GetMapping("/retrivebeallStocks")
    @ResponseBody
    public List<Stock> retrieveAllStocks()
    {
      return  ss.retrieveAllStocks();
    }
    @PostMapping("/addStock")
    @ResponseBody
    public Stock addStock(@RequestBody Stock s)
    {
        return  ss.addStock(s);
    }
    @PostMapping("/updateStock")
    @ResponseBody
    public  Stock updateStock(@RequestBody Stock u)
    {
        return ss.updateStock(u);
    }

    @GetMapping("/retrivebeStock/{idStock}")
    @ResponseBody
    public Stock retrieveStock(@PathVariable Long idStock)
    {
        return ss.retrieveStock(idStock);
    }
}
