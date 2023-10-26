package pe.edu.continental.InyecciondeDependenciasConSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import pe.edu.continental.InyecciondeDependenciasConSpring.model.Equipo;
@Repository
public interface AppRepository extends JpaRepository<Equipo, Long> {

}
