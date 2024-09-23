package com.emp.jamr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.jamr.model.Empleado;
import com.emp.jamr.service.EmpleadoService;

@RestController
@RequestMapping("/api/Empleado")
@CrossOrigin(origins = "*")
public class EmpleadoController {

    @Autowired
    private EmpleadoService service;

    // Get all
    @GetMapping("/list")
    public List<Empleado> getAllProducts() {
        return service.getAllEmpleados();
    }

    // Create
    @PostMapping("/Create")
    public Empleado createEmpleado(@RequestBody Empleado empleado) {
        return service.saveEmpleado(empleado);
    }

    @PutMapping("/Edit/{id}")
    public ResponseEntity<Empleado> updateEmpleado(@PathVariable int id, @RequestBody Empleado empleado) {
        try {
            Empleado updateEmpleado = service.updateEmpleado(empleado, id);
            return ResponseEntity.ok(updateEmpleado);
        } catch (Exception e) {
            System.out.println(e.toString());
            return ResponseEntity.notFound().build();
        }
    }

    // Delete
    @DeleteMapping("/Delete/{id}")
    public ResponseEntity<Void> deleteEmpleado(@PathVariable int id) {
        try {
            service.deleteEmpleado(id);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return null;
    }

}
