package com.dh.Entregable.service.impl;

import com.dh.Entregable.entity.Turno;
import com.dh.Entregable.repository.ITurnoRepository;
import com.dh.Entregable.service.ITurnoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TurnoServicio implements ITurnoServicio {
    @Autowired
    private ITurnoRepository repository;


    public Turno guardar(Turno turno) {
        return repository.save(turno);
    }
    public Turno buscarPorId(Long id) {
        Optional<Turno> turnoBuscado = repository.findById(id);
        return turnoBuscado.orElse(null);
    }
    public List<Turno> listarTodos() {
        return repository.findAll();
    }
    public void actualizar(Turno turno) {
        repository.save(turno);
    }
    public void eliminar(Long id) {
        repository.deleteById(id);
    }

}
