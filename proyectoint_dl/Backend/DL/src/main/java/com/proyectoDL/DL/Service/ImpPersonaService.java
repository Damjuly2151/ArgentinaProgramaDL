
package com.proyectoDL.DL.Service;

import com.proyectoDL.DL.Interface.IPersonaService;
import com.proyectoDL.DL.entity.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService {
   @Autowired  IPersonarepository Ipersonarepository;
    
   @Override
    public List<Persona> getPersona() {
        List<Persona> persona = Ipersonarepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        Ipersonarepository.save(persona);
               
    }

    @Override
    public void deletePersona(Long Id) {
        Ipersonarepository.deleteById(Id);
    }

    @Override
    public Persona findPersona(Long Id) {
        Persona persona = Ipersonarepository.findById(Id);
                return persona;
    }
    
}
