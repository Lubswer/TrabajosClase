import java.text.DecimalFormat;
import java.util.Scanner;
public class Taller_ejercicio2 {
    public static void main(String[] args){
        //2. Operaciones matemáticas básicas.

        int numero1;
        int numero2;
        double multiplicacion,divicion,suma,resta;
        DecimalFormat df = new DecimalFormat("0.00");

        Scanner teclado = new Scanner(System.in);

        System.out.println("INGRESO DE NUMEROS PARA OPERECIONES");
        System.out.print("Ingrese el primer numero entero: ");
        numero1 = teclado.nextInt();
        teclado = new Scanner(System.in);
        System.out.print("Ingrese el segundo numero entero: ");
        numero2 = teclado.nextInt();
        teclado = new Scanner(System.in);

        System.out.println("// Resultados //");

        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        divicion = (double) numero1 / numero2;


        System.out.println("Suma : " + suma );
        System.out.println("Resta : " + resta );
        System.out.println("Multiplicacion : " + multiplicacion );
        System.out.println("Divicion: " + df.format(divicion));
        System.out.println("Modulo numero1 : " + (numero1 % 2));
        System.out.println("Modulo numero2 : " + (numero2 % 2));





    }
}
