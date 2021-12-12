package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.modelo.Persona;
import com.example.demo.repositorio.Ipersona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Personaservice implements Ipersona {
    @Autowired
    private Ipersona data;
    @Override
    public List<Persona> listar() {
        // TODO Auto-generated method stub
        return (List<Persona>)data.findAll();
    }

    @Override
    public Optional<Persona> listarId(int id) {
        // TODO Auto-generated method stub
        return data.findById(id);
    }

    @Override
    public int save(Persona p) {
        int res=0;
        Persona anime=data.save(p);
        if(!anime.equals(null)){
            res=1;
        }
        // TODO Auto-generated method stub
        return res;
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        data.deleteById(id);
        
    }