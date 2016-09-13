package pe.edu.ulima.adapters.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sodm on 12/09/2016.
 */
public class GestorCursos {
    public List<Curso> listarCursos(){
        List<Curso> cursos= new ArrayList<>();
        cursos.add(new Curso(3,"Programacion"));
        cursos.add(new Curso(4, "Curso 2"));
        return cursos;
    }
}
