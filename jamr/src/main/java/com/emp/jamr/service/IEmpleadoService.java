package com.emp.jamr.service;

import java.util.List;
import java.util.Optional;
import com.emp.jamr.model.Empleado;

public interface IEmpleadoService {
    List<Empleado> getAllEmpleados();

    Optional<Empleado> getEmpleadoById(int id);

    Empleado saveEmpleado(Empleado empleado);

    Empleado updateEmpleado(Empleado empleado, int id);

    void deleteEmpleado(int id);
}