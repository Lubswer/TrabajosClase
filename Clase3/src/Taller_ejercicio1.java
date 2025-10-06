import javax.swing.*;
import java.util.Scanner;

public class Taller_ejercicio1 {
    String nombre;
    String equipo;
    int edad;
    Scanner teclado = new Scanner(System.in);

    public Taller_ejercicio1(String nombre, String equipo, int edad) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.edad = edad;
        this.teclado = new Scanner(System.in);
    }

    void impresion() {
        System.out.println("El jugador es: " + nombre + " y el equipo es: " + equipo + " y el edad es: " + edad);
    }

    void pedirDatos() {
        System.out.println("Ingrese el nombre: ");
        this.nombre = teclado.nextLine();
        teclado = new Scanner(System.in);
        System.out.println("Ingrese el equipo: ");
        this.equipo = teclado.nextLine();
        teclado = new Scanner(System.in);
        System.out.println("Ingrese el edad: ");
        this.edad = teclado.nextInt();
        teclado = new Scanner(System.in);
    }


    public static void main(String[] args) {

        Taller_ejercicio1 defensa = new Taller_ejercicio1(" ", " ", 0);
        Taller_ejercicio1 delandero = new Taller_ejercicio1("Messi", "Barcelona", 39);
        Taller_ejercicio1 arquero = new Taller_ejercicio1("Kaviedes", "Ecuador", 45);

        defensa.pedirDatos();
        defensa.impresion();

        delandero.impresion();


        arquero.impresion();


    }
}



