import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Persona agregarPersona(Scanner teclado){

        System.out.println("Ingrese el nombre del persona: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese la edad de la persona:  ");
        int edad = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese el pais de la persona: ");
        String pais = teclado.nextLine();
        System.out.println("Ingrese la universidad: ");
        String universidad = teclado.nextLine();

        return new Persona(nombre, edad, pais, universidad);
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("//// PARTE 1 ////");
        System.out.println("///Datos de la persona agregada ");
        Persona agregarPersona = agregarPersona(teclado);
        agregarPersona.mostrar();
        System.out.println(" ");
        System.out.println("//// PARTE 2 ////");
        System.out.println("Mis datos con datos quemados: ");
        Persona yo = new Persona();
        yo.mostrar();
        System.out.println(" ");
        System.out.println("//// PARTE 3 ////");
        System.out.println("Cambiar mi pais: ");
        System.out.println("Ingrese el nuevo pais: ");
        String pais = teclado.nextLine();
        System.out.println("Mis nuevos Datos: ");
        yo.cambiarPais(pais);
        yo.mostrar();
        System.out.println(" ");
        System.out.println("Desea conocer su edad en 10 años?");
        String validar= teclado.nextLine();
        if(validar.equals("si")){
            System.out.println(yo.conocerEdadFuturo());

        }else{
            yo.conocerEdad();
        }

    }
}