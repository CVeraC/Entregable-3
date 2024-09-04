package com.dh.Entregable.service;

import com.dh.Entregable.entity.Turno;

import java.util.List;

public interface ITurnoServicio {
        Turno guardar(Turno turno);
        Turno buscarPorId(Long id);
        List<Turno> listarTodos();
        void actualizar(Turno turno);
        void eliminar(Long id);
}
