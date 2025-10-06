
import java.util.Scanner;

public class Integrado_ejercicio {
    public static void main(String[] args){

        int numero, limite, caso = 0, edad;
        String usuario, clave, palabra;
        double altura;
        Scanner teclado = new Scanner(System.in);

        System.out.println("// Bienvedio al sistema de funcinalidades //");
        do{

            System.out.println("A continuacion ingrese el numero de funcion que quiera ejecutar!!");
            System.out.println("1. Tabla de multiplicar ");
            System.out.println("2. Validacion de identidad (LOGIN)");
            System.out.println("3. Verificar Datos para el cuartel ");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opcion: ");
            caso = teclado.nextInt();
            teclado =  new Scanner(System.in);

            switch(caso){
                case 1:
                    System.out.println("///// Tabla de multiplicar /////");
                    System.out.print("Ingrese el numero a ser multiplicado: ");
                    numero = teclado.nextInt();
                    teclado = new Scanner(System.in);
                    System.out.print("Ingrese el limite de la multiplcacion: ");
                    limite = teclado.nextInt();
                    teclado = new Scanner(System.in);
                    System.out.println("La tabla es: ");
                    for(int i = 0; i < limite; i++){
                        System.out.println(numero + " x " + (i + 1) + "  =  " + ( numero * (i + 1 )));
                    }
                    System.out.println("Numero multiplicado con exito!!");
                    break;
                case 2:
                    System.out.println("///// BINVENIDO AL SISTEMA DE LOGIN /////");
                    do{

                        System.out.print("Ingrese el usuario: ");
                        usuario = teclado.next();
                        teclado = new Scanner(System.in);
                        System.out.print("Ingrese su contraseña: ");
                        clave = teclado.next();
                        teclado = new Scanner(System.in);
                        if(!usuario.equals("Lubswer") && !clave.equals("789452")){
                            System.out.println("Usuario y contraseña incorrectas");
                            System.out.println("Intentalo una vez mas!!");
                        }else{
                            if(!usuario.equals("Lubswer")){
                                System.out.println("Usuario incorrecto");
                                System.out.println("Intentalo una vez mas!!");
                            }else{
                                if(!clave.equals("789452")){
                                    System.out.println("Clave incorrecta");
                                    System.out.println("Intentalo una vez mas!!");
                                }
                            }
                        }

                    }while(!usuario.equals("Lubswer") || !clave.equals("789452"));
                    System.out.println("Se ha logeado exitosamente!!");
                    System.out.println(" ");
                    System.out.println("Fin del Login");
                    System.out.println(" ");

                    break;
                case 3:
                    System.out.println("Bienvenido a la verificacion de requisitos para el servicio militar");
                    do{
                        System.out.print("Ingrese su altura: ");
                        altura = teclado.nextDouble();
                        teclado = new Scanner(System.in);
                        System.out.print("Ingrese su edad: ");
                        edad = teclado.nextInt();
                        teclado = new Scanner(System.in);
                        if(edad < 18 && altura < 1.60){
                            System.out.println("No comple con la altura ni la edad");
                        }else{
                            if(edad < 18) {
                                System.out.println("No comple con la edad establecida ");
                            }else{
                                if(altura < 1.60){
                                    System.out.println("No comple con la estatura establecida");
                                }else{
                                    System.out.println("Felicidades comple con todos los requisitos!!");
                                }
                            }
                        }
                        System.out.println("Desea continuar con un nuevo registro? (si/no):  ");
                        palabra = teclado.next();
                        teclado = new Scanner(System.in);

                    }while(palabra.equalsIgnoreCase("si"));
                    System.out.println("Requisitos cuartel finalizado con exito!");
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    caso = 5;
                    break;

                default:
                    System.out.println("ERROR !!!! Ingrese los numeros establecidos ");;
                    System.out.println(" ");
            }
        }while( caso != 5);

        System.out.println("/////Sistema de funcionalidades finalizado/////");

    }
}
