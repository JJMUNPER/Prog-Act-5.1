package org.losremedios.ut5.actividades.ActividadConjuntos5_1;

import java.util.Comparator;

public class ComparaConjuntoPersonas implements Comparator<Persona> {


    @Override
    public int compare(Persona o1, Persona o2) {

        if (o1.nombre.compareToIgnoreCase(o2.nombre) == 0) {
            if (o1.edad == o2.edad) {
                return 0;
            }
            if (o1.edad > o2.edad) {
                return 1;
            }
            return -1;
        }
        return o1.nombre.compareToIgnoreCase(o2.nombre);
    }

}
