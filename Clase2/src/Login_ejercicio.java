import java.util.Scanner;



public class Login_ejercicio {
    public static void main(String[] args) {

        String usuario , clave;
        Scanner teclado = new Scanner(System.in);

        System.out.println("/// LOGIN ///");

        do{
            System.out.println("Ingrese su usuario: ");
            usuario = teclado.nextLine();
            teclado = new Scanner(System.in);
            System.out.println("Ingrese su clave: ");
            clave = teclado.nextLine();
            if(!clave.equals("Andreateamo") && !usuario.equals("Lubswer")){
                System.out.println("Usuario y Clave incorrecta");
            }else{
                if(!usuario.equals("Lubswer")){
                    System.out.println("Usuario incorrecto");
                }else{
                    if(!clave.equals("Andreateamo")){
                        System.out.println("Clave incorrecta");

                    }
                }
            }
        }while( !usuario.equals("Lubswer") || !clave.equals("Andreateamo"));
        System.out.println("Registro Exitoso!!");
    }
}
