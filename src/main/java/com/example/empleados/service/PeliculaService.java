package com.example.empleados.service;

import java.util.List;
import java.util.Optional;

import com.example.empleados.entity.Pelicula;
import com.example.empleados.interfaz.IpeliculaService;
import com.example.empleados.repository.Ipelicula;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PeliculaService implements IpeliculaService  {
    @Autowired
    private Ipelicula data;
    @Override
    public List<Pelicula> listar() {
        // TODO Auto-generated method stub
        return (List<Pelicula>)data.findAll();
    }

    @Override
    public Optional<Pelicula> listarId(int id) {
        // TODO Auto-generated method stub
        return data.findById(id);
    }

    @Override
    public int save(Pelicula p) {
        int res=0;
        Pelicula anime=data.save(p);
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
}
