public class Persona { //este es el padre y si uso "final" en medio de public y class no podra heredarse
    String cedula;
    String nombre;
    int edad;
    public Persona(String cedula, String nombre, int edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
    }
    public void imprimir() {
        System.out.println("Datos: \nCedula: " + cedula + ", \nNombre: " + nombre + ", \nEdad: " + edad);
    }
}

