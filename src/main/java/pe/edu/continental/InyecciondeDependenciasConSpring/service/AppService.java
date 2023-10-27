package pe.edu.continental.InyecciondeDependenciasConSpring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.continental.InyecciondeDependenciasConSpring.model.Equipo;
import pe.edu.continental.InyecciondeDependenciasConSpring.repository.AppRepository;

@Service
public class AppService implements IAppService {

    @Autowired
    AppRepository appRepository;

    @Override
    public List<Equipo> listarEquipos() {
        List<Equipo> listaEquipos = appRepository.findAll();
        return listaEquipos;
    }

    @Override
    public Optional<Equipo> buscarEquipo(Long id) {
        Optional<Equipo> equipoEncontrado = appRepository.findById(id);
        return equipoEncontrado;
    }

    @Override
    public void registrarEquipo(Equipo equipo) throws Exception {
        try {
            appRepository.save(equipo);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

}
