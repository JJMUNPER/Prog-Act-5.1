package org.losremedios.ut5.actividades.ActividadConjuntos5_1;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Persona p1 = new Persona("Manolo",42);
        Persona p2 = new Persona("Antonio",26);
        Persona p3 = new Persona("Pepe",12);
        Persona p4 = new Persona("Manolo",33);

        TreeSet<Persona>personas= new TreeSet<>(new ComparaConjuntoPersonas());
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);


        System.out.println(personas);

    }
}
