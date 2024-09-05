package com.example.zuch.ebacSpring.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.zuch.ebacSpring.domain.model.Cliente;

@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Long>{
}
