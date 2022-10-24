
package com.portfolio.andres.Interface;

import com.portfolio.andres.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    //trae una lista de persona
    public List<Persona> getPersona();
    
    public void savePersona(Persona persona);
    
    //Eliminar un objeto buscado por id
    public void deletePersona(Long id);
    
// buscar persona por id
    public Persona findPersona(Long id);
}
