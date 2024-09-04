package com.dh.Entregable.controller;

import com.dh.Entregable.entity.Odontologo;
import com.dh.Entregable.service.IOdontologoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/odontologos")
public class OdontologoController {
    private final IOdontologoServicio iOdontologoServicio;
    @Autowired
    public OdontologoController(IOdontologoServicio iOdontologoServicio) {
        this.iOdontologoServicio = iOdontologoServicio;
    }

    @PostMapping
    public ResponseEntity<Odontologo> guardar(@RequestBody Odontologo odontologo) {
        return ResponseEntity.ok(iOdontologoServicio.guardar(odontologo));
    }
    @GetMapping
    public ResponseEntity<List<Odontologo>> listarTodos() {
        return ResponseEntity.ok(iOdontologoServicio.listarTodos());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Odontologo> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(iOdontologoServicio.buscarPorId(id));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Odontologo> actualizar(@PathVariable Long id, @RequestBody Odontologo odontologo) {
        return ResponseEntity.ok(odontologo);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        return ResponseEntity.noContent().build();
    }

}
