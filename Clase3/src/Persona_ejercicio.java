public class Persona_ejercicio { //clase
    String nombre; //atribtutos
    int edad;
    String correo;
    String cedula;

    public Persona_ejercicio(String nombre, int edad, String correo, String cedula) { // revisen informacion de afuera, constructor
        this.nombre = nombre;
        this.edad = edad; //this es un puntero qe me dice esto es un atributo, para diferenciar cuadno son iguales
        this.correo = correo;
        this.cedula = cedula;

    }

    void impresion(){ //metodo propio
        System.out.println("Bienvenido: " + nombre + " " + edad + " " + correo +  " " + cedula); //recibe una orden para realizar el metodo o accion
    }

    public static void main(String[] args) { //main para ejecutar

        Persona_ejercicio objeto1 = new Persona_ejercicio("lubswer", 20, "lubswer@gmail.com", "1753019122"); //Persona_ejercicio es de la Clase
        //new persona_ejercicio es del metodo constructor
        objeto1.impresion(); // digo que metodo quiero mandar

        Persona_ejercicio objeto2 = new Persona_ejercicio( "Carlitos UWU", 20, "carlito@gmail.com", "02101512150");
        objeto2.impresion();



    }


}
