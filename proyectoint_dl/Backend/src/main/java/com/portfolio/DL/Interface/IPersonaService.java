package com.portfolio.DL.Interface;

import com.portfolio.DL.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    //Traer una listas de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto tipo Persona
    public void savePersona(Persona persona);
            
    //Eliminar un objeto pero lo buscamos ID
    public void deletePersona(Long id);
            
    //Buscar persona por id
    public Persona findPersona(Long id);         
            
    
    
    
}
