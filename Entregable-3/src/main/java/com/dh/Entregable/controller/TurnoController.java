package com.dh.Entregable.controller;

import com.dh.Entregable.entity.Turno;
import com.dh.Entregable.service.ITurnoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/turnos")
public class TurnoController {

    private final ITurnoServicio iTurnoServicio;
    @Autowired
    public TurnoController(ITurnoServicio iTurnoServicio) {
        this.iTurnoServicio = iTurnoServicio;
    }

    @PostMapping
    public ResponseEntity<Turno> guardar(@RequestBody Turno turno) {
        return ResponseEntity.ok(iTurnoServicio.guardar(turno));
    }
    @GetMapping
    public ResponseEntity<List<Turno>> listarTodos() {
        return ResponseEntity.ok(iTurnoServicio.listarTodos());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Turno> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(iTurnoServicio.buscarPorId(id));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Turno> actualizar(@PathVariable Long id, @RequestBody Turno turno) {
        return ResponseEntity.ok(turno);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        return ResponseEntity.noContent().build();
    }
}
