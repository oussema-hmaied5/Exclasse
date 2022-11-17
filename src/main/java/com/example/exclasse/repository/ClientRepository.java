package com.example.exclasse.repository;

import com.example.exclasse.entity.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client , Long> {
}
