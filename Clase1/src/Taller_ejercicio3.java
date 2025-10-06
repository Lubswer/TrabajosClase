import java.sql.SQLOutput;
import java.util.Scanner;
public class Taller_ejercicio3 {
    public static void main(String[] args){
        //3. Casting y conversión de tipos.

        int entero;
        double decimal;

        Scanner teclado = new Scanner(System.in);

        System.out.println("// Ingrese de nuneros para el casteo //");

        System.out.print("Ingrese el numero entero: ");
        entero = teclado.nextInt();
        teclado =  new Scanner(System.in);
        System.out.print("Ingrese el numero deciaml: ");
        decimal = teclado.nextDouble();
        teclado.close();

        double casteoInt = entero;
        int casteoDecimal = (int)decimal;

        System.out.println("El casteo implicito del entero es: " + casteoInt);

        System.out.println("El casteo explicito del decimal es: " + casteoDecimal);




    }
}
