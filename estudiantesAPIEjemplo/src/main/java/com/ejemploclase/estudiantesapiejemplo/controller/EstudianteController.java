package com.ejemploclase.estudiantesapiejemplo.controller;

import com.ejemploclase.estudiantesapiejemplo.entity.Estudiante;
import com.ejemploclase.estudiantesapiejemplo.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EstudianteController {

    @Autowired
    EstudianteRepository estudianteRepository;

    @GetMapping("estudiantes")
    public List<Estudiante> getAllEstudiantes()
    {

        return estudianteRepository.listarEstudiantes();
    }

    @PostMapping("estudiantes")
    public String addEstudiante(@RequestBody Estudiante estudiante)
    {
        estudianteRepository.agregarEstudiante(estudiante);
        return "Estudiante Ingresado";
    }

    @PutMapping("estudiantes")
    public String modificarEstudiante(@RequestBody Estudiante estudiante) {
        estudianteRepository.modificarEstudiante(estudiante);
        return "Estudiante Modificado";
    }

    @DeleteMapping("estudiantes/{id}")
    public void deleteEstudiante(@PathVariable(value = "id") Integer id){
        estudianteRepository.borrarEstudiante(id);
    }






}
