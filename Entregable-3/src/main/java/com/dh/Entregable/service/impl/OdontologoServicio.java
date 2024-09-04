package com.dh.Entregable.service.impl;


import com.dh.Entregable.entity.Odontologo;
import com.dh.Entregable.repository.IOdontologoRepository;
import com.dh.Entregable.service.IOdontologoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OdontologoServicio implements IOdontologoServicio {
    @Autowired
    private IOdontologoRepository repository;

    public Odontologo guardar(Odontologo odontologo) {
        return repository.save(odontologo);
    }
    public Odontologo buscarPorId(Long id) {
        Optional<Odontologo> odontologoBuscado = repository.findById(id);
        return odontologoBuscado.orElse(null);
    }
    public List<Odontologo> listarTodos() {
        return repository.findAll();
    }
    public void actualizar(Odontologo odontologo) {
        repository.save(odontologo);
    }
    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
