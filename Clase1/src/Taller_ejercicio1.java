import java.util.Scanner;

public class Taller_ejercicio1 {
    public static void main(String[] args){
        //1. Declaración y asignación de variables.

        int entero;
        double decimal;
        char caracter;
        String texto = " ";

        boolean condicion = false;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el numero de entero: ");
        entero = teclado.nextInt();

        teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero de decimal: ");
        decimal = teclado.nextDouble();

        teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero de caracter: ");
        caracter = teclado.next().charAt(0);

        teclado = new Scanner(System.in);
        System.out.println("Ingrese su nombre : ");
        texto = teclado.next();


        if(!texto.isBlank()){
            condicion = true;
        }
        System.out.println("/// Los campos /// ");
        System.out.println("Numero entero: " + entero);
        System.out.println("Numero decimal: " +decimal);
        System.out.println("Caracter : " + caracter);
        System.out.println("Texto: " + texto);
        System.out.println("Condicion : " + condicion);
    }
}
