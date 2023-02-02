package com.ejemploclase.estudiantesapiejemplo.repository;

import com.ejemploclase.estudiantesapiejemplo.entity.Estudiante;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class EstudianteRepository {


    ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

    public ArrayList<Estudiante> listarEstudiantes()
    {

        return listaEstudiantes;
    }

    public void agregarEstudiante(Estudiante estudiante)
    {
        listaEstudiantes.add(estudiante);
    }


    public void modificarEstudiante(Estudiante estudiante)
    {
        for(int i=0; i<listaEstudiantes.size();i++)
        {
            if(listaEstudiantes.get(i).getId()== estudiante.getId())
            {
                listaEstudiantes.get(i).setNombre(estudiante.getNombre());
                listaEstudiantes.get(i).setApellidos(estudiante.getApellidos());
                listaEstudiantes.get(i).setEdad(estudiante.getEdad());
                listaEstudiantes.get(i).setDireccion(estudiante.getDireccion());

            }
        }
    }


    public void borrarEstudiante(int id)
    {
        for(Estudiante estudiante: listaEstudiantes)
        {
            if(estudiante.getId()==id)
            {
                listaEstudiantes.remove(estudiante);
                break;
            }
        }
    }


}
