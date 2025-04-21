package vehiculos;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Concesionario {

    private final TreeSet<Vehiculo> stock = new TreeSet<>();

    /**
     * añade un vehículo al concesionario.
     */
    public boolean alta(Vehiculo v) {
        return stock.add(v);
    }

    /**
     * elimina el vehículo cuya matrícula coincida.
     */
    public boolean baja(String matricula) {
        return stock.removeIf(v -> v.getMatricula().equalsIgnoreCase(matricula));
    }

    /**
     * busca un vehículo por matrícula.
     */
    public Vehiculo buscar(String matricula) {
        for (Vehiculo v : stock) {
            if (v.getMatricula().equalsIgnoreCase(matricula)) return v;
        }
        return null;
    }

    /**
     * Devuelve una vista de solo lectura del stock.
     */
    public Set<Vehiculo> getStock() {
        return Collections.unmodifiableSet(stock);
    }
}
