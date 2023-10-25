package pe.edu.continental.InyecciondeDependenciasConSpring.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Equipo {
    private String nombre;
    private Float presupuesto;
    private Date fechaFundacion;
}
