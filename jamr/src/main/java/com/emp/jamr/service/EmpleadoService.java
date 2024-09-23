package com.emp.jamr.service;

import java.util.List;
import java.util.Optional;

import com.emp.jamr.model.Empleado;
import com.emp.jamr.repository.RepositoryEmpleado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoService implements IEmpleadoService {

    @Autowired
    private RepositoryEmpleado empleadoRepository;

    @Override
    public List<Empleado> getAllEmpleados() {
        return empleadoRepository.findAll();
    }

    @Override
    public Optional<Empleado> getEmpleadoById(int id) {
        return empleadoRepository.findById(id);
    }

    @Override
    public Empleado saveEmpleado(Empleado empleado) {
        empleadoRepository.save(empleado);
        return null;
    }

    @Override
    public Empleado updateEmpleado(Empleado updatedEmpleado, int id) {
        return empleadoRepository.findById(id)
                .map(e -> {
                    e.setNombre(updatedEmpleado.getNombre());
                    e.setCorreo(updatedEmpleado.getCorreo());
                    e.setSueldo(updatedEmpleado.getSueldo());
                    return e; // Return the updated entity
                })
                .orElseThrow();
    }

    @Override
    public void deleteEmpleado(int id) {
        empleadoRepository.deleteById(id);
    }

}
