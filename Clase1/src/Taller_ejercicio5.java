import java.text.DecimalFormat;
import java.util.Scanner;

public class Taller_ejercicio5 {
    public static void main(String[] args) {
        //5. Ejercicio combinado.

        double base, altura, area;
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("// Area de un triangulo //");
        do{
            System.out.println("Ingrese la altura : " );
            altura = teclado.nextDouble();
            if(altura <= 0){
                System.out.println("La altura no puede ser cero ni negativa ");
            }
        }while(altura <= 0);

        teclado =  new Scanner(System.in);

        do{
            System.out.println("Ingrese la base : " );
            base = teclado.nextDouble();
            if(base <= 0){
                System.out.println("La altura no puede ser cero ni negativa ");
            }
        }while(base <= 0);

        teclado.close();

        area = (base * altura)/2;
        System.out.println("El area del triangulo es: "+ df.format(area));



    }
}
