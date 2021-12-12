package com.example.empleados.interfaz;
import java.util.List;
import java.util.Optional;

import com.example.empleados.entity.Pelicula;

public interface IpeliculaService {
    public List<Pelicula>listar();
    public Optional<Pelicula>listarId(int id);
    public int save(Pelicula p);
    public void delete(int id);
    
}
