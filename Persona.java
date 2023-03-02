package org.losremedios.ut5.actividades.ActividadConjuntos5_1;

public class Persona implements Comparable {

    String nombre;
    Integer edad;

    Persona () {}

    Persona (String nombre, Integer edad){
        this.nombre=nombre;
        this.edad=edad;
    }



    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Integer getEdad (){
        return edad;
    }
    public void setEdad(Integer edad){
        this.edad=edad;
    }


    @Override
    public int compareTo(Object o) {

        Persona comp = (Persona)o;
        if(this.edad==comp.edad){
            return 0;
        }
        if(this.edad>comp.edad){
            return 1;
        }

        return -1;

    }
}
