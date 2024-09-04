package com.dh.Entregable.service.impl;


import com.dh.Entregable.entity.Paciente;
import com.dh.Entregable.repository.IPacienteRepository;
import com.dh.Entregable.service.IPacienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PacienteServicio implements IPacienteServicio {
    @Autowired
    private IPacienteRepository repository;

    public Paciente guardar(Paciente paciente) {
        return repository.save(paciente);
    }
    public Paciente buscarPorId(Long id) {
        Optional<Paciente> pacienteBuscado = repository.findById(id);
        return pacienteBuscado.orElse(null);
    }
    public List<Paciente> listarTodos() {
        return repository.findAll();
    }
    public void actualizar(Paciente paciente) {
        repository.save(paciente);
    }
    public void eliminar(Long id) {
       repository.deleteById(id);
    }
}
