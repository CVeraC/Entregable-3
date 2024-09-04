package com.dh.Entregable.service;

import com.dh.Entregable.entity.Odontologo;
import java.util.List;


public interface IOdontologoServicio {
    Odontologo guardar(Odontologo odontologo);
    Odontologo buscarPorId(Long id);
    List<Odontologo> listarTodos();
    void actualizar(Odontologo odontologo);
    void eliminar(Long id);


}
