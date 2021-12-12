package com.example.empleados.repository;

import com.example.empleados.entity.Pelicula;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Ipelicula extends CrudRepository <Pelicula,Integer> {
    
}