package pe.edu.continental.InyecciondeDependenciasConSpring.service;

import java.util.List;

import pe.edu.continental.InyecciondeDependenciasConSpring.model.Equipo;

public interface IAppService {
    List<Equipo> listarEquipos();

    Equipo buscarEquipo();

    void registrarEquipo();
}
