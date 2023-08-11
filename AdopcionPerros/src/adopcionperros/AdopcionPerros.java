package adopcionperros;

import adopcionperros.entities.Perro;
import adopcionperros.entities.Persona;

/*
 Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
*/


public class AdopcionPerros {

    public static void main(String[] args) {
        
        //crear dos personas
        //String nombre, String apellido, int edad, String documento, Perro perro
        Perro perro1 = new Perro("Pipo", "sin raza", 7, "pequenio");
        Persona p1 = new Persona("Pedro", "Rodriguez", 32, "123456789", perro1);
        Perro perro2 = new Perro("pipi", "caniche", 12, "mediano");
        Persona p2 = new Persona("Carla", "Gonzalez", 48, "4561268574", perro2);
        
        System.out.println("La persona 1 es: " + p1);
        System.out.println("");
        System.out.println("La persona 2 es: " + p2);
        
        
       
    }

}
