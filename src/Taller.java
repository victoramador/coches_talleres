import java.util.*;

public class Taller {
    private Map<Persona, Coche> reparaciones = new TreeMap<>(Comparator.comparing(Persona::getNumSeguridadSocial));
    public Coche registrarReparacion(Persona persona, Coche coche){
        reparaciones.put(persona, coche);
        return coche;
    }
    public Set<Persona> obtenerClientes(){
        Set<Persona> set = reparaciones.keySet();
        return set;
    }
    public Coche obtenerCoche(Persona persona){
        return reparaciones.get(persona);
    }


}
