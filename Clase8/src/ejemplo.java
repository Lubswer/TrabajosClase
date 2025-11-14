import java.util.Scanner;

public class ejemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1;
        int numero2;
        int opcion;
        String nombre;
        do {
            System.out.println("Sistema de prueba de try and catch");
            System.out.println("1. ingrese su nombre\n2. ingrese dos numeros y suma\n3. Salir\nIngrese un aopcion:");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    try {
                        System.out.print("Ingrese su nombre: ");
                        nombre = sc.nextLine();
                        if (nombre == null || nombre.isBlank()) {
                            throw new IllegalArgumentException("Error de String");

                        } else {
                            System.out.println("Tu nombre es: " + nombre);
                        }


                    } catch (IllegalArgumentException e) {
                        System.out.println("Ups! salio algo mal ----> Tipo de dato nulo o vacio");
                        System.out.println("Porque ---->  " + e.getMessage());
                    }

                    break;

                case 2:
                    try {
                        System.out.print("Ingrese el primer numero: ");
                        numero1 = sc.nextInt();
                        if (numero1 < 0) {
                            throw new ArithmeticException();
                        }
                        System.out.print("Ingrese el segundo numero: ");
                        numero2 = sc.nextInt();
                        if (numero2 < 0) {
                            throw new ArithmeticException();
                        }
                        if (numero1 > 0 && numero2 > 0) {
                            System.out.println("El primer numero es: " + numero1);
                            System.out.println("El segundo numero es: " + numero2);
                            System.out.println("Tus numeros sumados: " + (numero1 + numero2));
                        }
                    } catch (ArithmeticException e) {
                        System.out.println("Ups! salio algo mal ---->  Los no pueden ser menores a cero");
                        System.out.println("Porque ---->  " + e.getMessage());

                    } catch (Exception e) {
                        System.out.println("Ups! salio algo mal ---->  El tipo de dato ingresado no es un numero entero");
                        System.out.println("Porque ---->  " + e.getMessage());
                    } finally {
                        System.out.println("Fin del ingreso de numeros");
                    }
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println(("Opcion incorrecta"));
            }
        } while (opcion != 3);
    }
}
