import java.text.DecimalFormat;
import java.util.Scanner;

public class Taller_ejercicio4 {
    public static void main(String[] args){

        //4. Asignación compuesta.
        int variableEntera = 0;
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00")

        System.out.println("Ingrese un numero entero : ");
        variableEntera = teclado.nextInt();
        teclado.close();

        System.out.println(" += 2 :  " + (variableEntera += 2));

        System.out.println(" -= 2 :  " + (variableEntera -= 2));

        System.out.println(" *= 2 :  " + (variableEntera *= 2));

        System.out.println(" /= 2 :  " + df.format(variableEntera /= 2));

    }
}
