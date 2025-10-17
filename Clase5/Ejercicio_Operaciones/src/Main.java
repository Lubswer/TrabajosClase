
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        OperacionesMatematicas obj1 = new OperacionesMatematicas(8, 9.9);
        OperacionesMatematicas obj2 = new OperacionesMatematicas(38, 19.9, 800000);
        int opcion;
        do {
            System.out.println("/// DEFINA CON QUE OBJETO QUIERE TRABAJAR ///");
            System.out.println("1. Objeto 1");
            System.out.println("2. Objeto 2");
            System.out.println("3. Mostrar datos del objeto");
            System.out.print("Ingrese la opcion: ");
            opcion = teclado.nextInt();
            teclado = new Scanner(System.in);
            switch (opcion) {
                case 1:
                    int opcion1;
                    do {
                        System.out.println("Operaciones que se puede realizar al Objeto 1: ");
                        System.out.println("1. duplicar valor del entero");
                        System.out.println("2. Multiplcar decimal para si mismo");
                        System.out.println("3. Salir");
                        opcion1 = teclado.nextInt();
                        if (opcion1 == 1) {
                            obj1.SumarEntero();
                            System.out.println("El nuevo valor del entero para el objeto es: " + obj1.getEntero() );
                        }else if (opcion1 == 2) {
                            obj1.MultiplicarDecimal();
                            System.out.println("El nuevo valor del Decimal en el objeto es:" + obj1.getDecimal() );
                        }else if (opcion1 == 3) {
                            System.out.println("Saliendo...");
                        }
                    }while(opcion1 != 3);
                    break;
                case 2:
                    int opcion2;
                    do {
                        System.out.println("Operaciones que se puede realizar al Objeto 2: ");
                        System.out.println("1. duplicar valor del entero");
                        System.out.println("2. Multiplcar decimal para si mismo");
                        System.out.println("3. Dividir long para 10");
                        System.out.println("4. Salir");
                        opcion2 = teclado.nextInt();
                        if (opcion2 == 1) {
                            obj1.SumarEntero();
                            System.out.println("El nuevo valor del entero para el objeto es: " + obj1.getEntero() );
                        }else if (opcion2 == 2) {
                            obj1.MultiplicarDecimal();
                            System.out.println("El nuevo valor del Decimal en el objeto es:" + obj1.getDecimal() );
                        }else if (opcion2 == 3) {
                            obj1.DividirLong();
                            System.out.println("El nuevo valor del long dividido entre 10 es: " + obj1.getExtenso() );
                        }else if (opcion2 == 4) {
                            System.out.println("Saliendo...");
                        }
                    }while(opcion2 != 4);
                    break;
                case 3:
                    System.out.println("Datos Objeto 1:");
                    System.out.println("El entero:" + obj1.getEntero());
                    System.out.println("El decimal:" + obj1.getDecimal());
                    System.out.println("El long:" + obj1.getExtenso());
                    System.out.println(" ");
                    System.out.println("Datos Objeto 2:");
                    System.out.println("El entero:" + obj2.getEntero());
                    System.out.println("El decimal:" + obj2.getDecimal());
                    System.out.println("El long:" + obj2.getExtenso());
                    break;
                case 4:
                    System.out.println("Salir...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        } while (opcion != 4);


    }
}