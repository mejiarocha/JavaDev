package com.emp.jamr.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emp.jamr.model.Empleado;

@Repository
public interface RepositoryEmpleado extends JpaRepository<Empleado, Integer>{

}
