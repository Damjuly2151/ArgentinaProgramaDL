package com.proyectoDL.DL.controller;

import com.proyectoDL.DL.Interface.IPersonaService;
import com.proyectoDL.DL.entity.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class personaController {
    @Autowired IPersonaService ipersonaService;
    @GetMapping("persona/traer")
    public List<Persona> getPersona(){
        return ipersonaService.getPersona();
    }
    
    @PostMapping("person/crear")
    public String createPersona(@RequestBody Persona persona){
        ipersonaService.savePersona(persona);
        return "la persona fue creada correctamente";
              
    }
    
    @DeleteMapping("/persona/borrar/(Id)")
    public String deletePersona(@PathVariable Long Id){
        ipersonaService.deletePersona(Id);
        return "la persona fue eliminada correctamente";
    }
    
    @PutMapping("/persona/editar/(Id)")
    public Persona editPersona(@PathVariable Long Id,
            @RequestParam("nombre")String nuevoNombre,
            @RequestParam("apellido")String nuevoApellido,
            @RequestParam("img")String nuevoImg){
        Persona persona = ipersonaService.findPersona(Id);
        
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setImg(nuevoImg);
        
        ipersonaService.savePersona(persona);
        return persona;
        
    }
    
    
} 
