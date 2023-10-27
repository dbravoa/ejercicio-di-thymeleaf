package pe.edu.continental.InyecciondeDependenciasConSpring.service;

import java.util.List;
import java.util.Optional;

import pe.edu.continental.InyecciondeDependenciasConSpring.model.Equipo;

public interface IAppService {
    List<Equipo> listarEquipos();

    Optional<Equipo> buscarEquipo(Long id);

    void registrarEquipo(Equipo equipo) throws Exception;
}
