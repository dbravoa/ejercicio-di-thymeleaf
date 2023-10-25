package pe.edu.continental.InyecciondeDependenciasConSpring.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import pe.edu.continental.InyecciondeDependenciasConSpring.model.Equipo;

@Service
public class AppService implements IAppService {

    private List<Equipo> listaEquipos = null;

    public void crearListaEquipo() throws Exception {
        listaEquipos = new ArrayList<Equipo>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
            listaEquipos.add(new Equipo("Sporting Cristal", 100000000.00f, sdf.parse("13-12-1955")));
            listaEquipos.add(new Equipo("Alianza Lima", 300000000.00f, sdf.parse("15-02-1901")));
            listaEquipos.add(new Equipo("Sport Boys", 500000.00f, sdf.parse("28-07-1927")));
        } catch (ParseException e) {
            throw new Exception(e);
        }
    }

    @Override
    public List<Equipo> listarEquipos() {
        try {
            crearListaEquipo();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return listaEquipos;
    }

    @Override
    public Equipo buscarEquipo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarEquipo'");
    }

    @Override
    public void registrarEquipo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registrarEquipo'");
    }

}
