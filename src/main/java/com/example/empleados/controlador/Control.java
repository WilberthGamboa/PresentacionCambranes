package com.example.empleados.controlador;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.example.empleados.entity.Pelicula;
import com.example.empleados.interfaz.IpeliculaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class Control {
    @Autowired
    private IpeliculaService service;
   @GetMapping("/")
    public String listar(Model model){
        List<Pelicula>animes=service.listar();
        model.addAttribute("pelicula", animes);

        return "index";

    }


    @GetMapping("/new")
	public String nuevo(Model model) {
		model.addAttribute("pelicula", new Pelicula());
		return "form";
	}

	@PostMapping("/save")
	public String save(@Valid Pelicula p,Model model) {
		service.save(p);
		
		return "redirect:/";
	}

	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id,Model model){
		Optional<Pelicula>anime=service.listarId(id);
		model.addAttribute("pelicula", anime);
		return"form";
	}

	@GetMapping("/eliminar/{id}")
	public String eliminar(@PathVariable int id,Model model) {
		service.delete(id);
		return "redirect:/";
	}
}
