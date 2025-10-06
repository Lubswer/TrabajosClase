import java.util.Scanner;

public class Taller_ejercicio2 {
    String nombre;
    String cargo;
    double salario;
    String fecha;
    Scanner teclado = new Scanner(System.in);


    public Taller_ejercicio2(String nombre, String cargo, double salario, String fecha) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.fecha = fecha;

    }

    void impresion() {
        System.out.println("Nombre: " + nombre + "\nCargo: " + cargo + "\nSalario: " + salario + "\nFecha: " + fecha  );

    }

    void pedir(){
        System.out.println("Ingrese el nombre: ");
        this.nombre = teclado.next();
        teclado = new Scanner(System.in);
        System.out.println("Ingrese el cargo: ");
        this.cargo = teclado.next();
        teclado = new Scanner(System.in);
        System.out.println("Ingrese el salario: ");
        this.salario = teclado.nextDouble();
        teclado = new Scanner(System.in);
        System.out.println("Ingrese el fecha: ");
        this.fecha = teclado.next();
        teclado = new Scanner(System.in);
    }

    public static void main(String[] args) {

        Taller_ejercicio2 empleado1 = new Taller_ejercicio2( " ", " ", 0.0, " ");
        Taller_ejercicio2 empleado2 = new Taller_ejercicio2( " ", " ", 0.0, " ");
        Taller_ejercicio2 empleado3 = new Taller_ejercicio2( " ", " ", 0.0, " ");

        System.out.println(" Datos 1");
        empleado1.pedir();
        empleado1.impresion();
        System.out.println(" Datos 2");
        empleado2.pedir();
        empleado2.impresion();
        System.out.println(" Datos 3");
        empleado3.impresion();
        empleado3.impresion();


    }

}
