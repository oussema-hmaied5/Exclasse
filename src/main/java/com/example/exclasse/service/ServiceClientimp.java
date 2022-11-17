package com.example.exclasse.service;


import com.example.exclasse.entity.Client;
import com.example.exclasse.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceClientimp {

    @Autowired
    ClientRepository cr ;

   public List<Client> retrieveAllClients()
    {
        return (List< Client>) cr.findAll();
    }
   public Client addClient(Client c)
    {
        return cr.save(c);
    }

   public void deleteClient(Long idClient)
   {
       Client c= cr.findById(idClient).get();
       cr.delete(c);
   }

  public  Client updateClient(Client c)
    {
        return cr.save(c);
    }

   public Client retrieveClient(Long idClient)
    {
        return cr.findById(idClient).get();

    }
}
