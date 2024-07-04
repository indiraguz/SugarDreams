
package com.Proyecto.service;
import com.Proyecto.domain.Curso;
import java.util.List;


public interface CursoService {
        public List<Curso> getCursos(Curso curso);    

public Curso getIdCurso(Curso curso); 

public void save (Curso curso);

public void delete (Curso curso);
    
    
}
