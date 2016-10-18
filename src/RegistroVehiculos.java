import java.util.*;
import java.util.stream.Collectors;

public class RegistroVehiculos {
    private Set<Coche> coches = new HashSet<>();

    public void registrarVehiculo(Coche coche){
        coches.add(coche);
    }

    public Optional<Coche> obtenerVehiculo(String matricula){
        Coche cocheRetornar = null;
        for (Coche c: coches){
            if (c.getMatricula().equals(matricula)){
                cocheRetornar = c;
            }
        }
        if (cocheRetornar != null)
            return Optional.ofNullable(cocheRetornar);
        else
            return null;
    }

    public void eliminarVehiculo(String matricula){
        Coche a = null;
        for (Coche c: coches){
            if (c.getMatricula().equals(matricula)){
                a = c;
            }
        }
        coches.remove(a);
    }

    public Optional<Coche> obtenerVehiculoPrecioMax(){
        return Optional.ofNullable(Collections.max(coches, Comparator.comparing(Coche::getPrecio)));
    }

    public List<Coche> obtenerVehiculosMarca(String marca){
        return coches.stream().filter(coche -> coche.getMarca().equals(marca)).collect(Collectors.toList());
    }

    public List<Coche> obtenerTodos(){
        return new ArrayList<Coche>(coches);
    }
}

