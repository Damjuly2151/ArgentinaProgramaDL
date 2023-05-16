package com.proyectoDL.DL.repository;

import com.proyectoDL.DL.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ipersona extends JpaRepository <Persona, Long> {
    
}
