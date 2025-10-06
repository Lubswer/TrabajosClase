import java.util.Scanner;

public class Switch_ejercicio {
    public static void main(String[] args) {
        String dia;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite un dia de la semana : ");
        dia = teclado.nextLine();
        String diaValido = dia.toLowerCase();
        switch (diaValido) {
            case "domingo":
                System.out.println("El " + dia + " es fin de semana");
                break;

            case "sabado":
                System.out.println("El " + dia + " es fin de semana");
                break;

            case "sábado":
                System.out.println("El " + dia + " es fin de semana");
                break;

            case "viernes":
                System.out.println("El " + dia + " es dia laborable");
                break;

            case "jueves":
                System.out.println("El " + dia + " es dia laborable");
                break;

            case "miercoles":
                System.out.println("El " + dia + " es dia laborable");
                break;

            case "miércoles":
                System.out.println("El " + dia + " es dia laborable");
                break;

            case "martes":
                System.out.println("El " + dia + " es dia laborable");
                break;

            case "lunes":
                System.out.println("El " + dia + " es dia laborable");
                break;

            default:
                System.out.println("Dia no valido");

        }
    }
}
