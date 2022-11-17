package com.example.exclasse.controller;


import com.example.exclasse.entity.Client;
import com.example.exclasse.service.ServiceClientimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    ServiceClientimp sc ;

    @GetMapping("/retrivebeallclient")
    @ResponseBody
    public List<Client> retrieveAllClients()
    {
       return sc.retrieveAllClients();
    }

    @PostMapping("/addClient")
    @ResponseBody
    public Client addClient(@RequestBody Client c)
    {
       return sc.addClient(c);
    }
   @DeleteMapping("/Deleteclient/{idClient}")
   @ResponseBody
    public void deleteClient(@PathVariable Long idClient)
    {
        sc.deleteClient(idClient);
    }

    @PostMapping("/updateClient")
    @ResponseBody
    public  Client updateClient(@RequestBody Client c)
    {
        return sc.updateClient(c);
    }

    @GetMapping("/retrieveClient/{idClient}")
    @ResponseBody
    public Client retrieveClient(@PathVariable Long idClient)
    {
        return sc.retrieveClient(idClient);

    }
}
