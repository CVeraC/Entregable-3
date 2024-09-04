package com.dh.Entregable.service;

import com.dh.Entregable.entity.Paciente;

import java.util.List;

public interface IPacienteServicio {
   Paciente guardar(Paciente paciente);
    Paciente buscarPorId(Long id);
    List<Paciente> listarTodos();
    void actualizar(Paciente paciente);
    void eliminar(Long id);
}
