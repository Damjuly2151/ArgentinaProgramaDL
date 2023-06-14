package com.proyectoDL.DL.Interface;

import com.proyectoDL.DL.entity.Persona;
import java.util.List;


public interface IPersonaService {
    //traer una lista de personas
    public List<Persona> getPersona();
            
    //guardar objeto de persona
    public void savePersona(Persona persona);
            
    //eliminar objeto de persona
    public void deletePersona(Long Id);
 
    //buscar una persona por Id
    public Persona findPersona(Long Id);
    
}
