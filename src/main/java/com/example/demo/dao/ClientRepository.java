package com.example.demo.dao;

import com.example.demo.model.Client;
import org.springframework.data.repository.CrudRepository;
 
public interface ClientRepository extends CrudRepository<Client, Long> {
}