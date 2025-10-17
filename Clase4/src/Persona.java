public class Persona {
    private String nombre;
    private int edad;
    public String pais;
    public String universidad;
    public Persona(String nombre, int edad, String pais, String universidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.pais = pais;
        this.universidad = universidad;

    }
    public Persona(){
        this.nombre = "Lubswer";
        this.edad = 20;
        this.pais = "Ecuador";
        this.universidad = "EPN";
    }

    public void mostrar(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Pais: " + this.pais);
        System.out.println("Universidad: " + this.universidad);
    }

    public void cambiarPais(String nuevoPais){

        this.pais = nuevoPais;
    }
    public int conocerEdadFuturo(){
        return this.edad + 10;
    }
    public void conocerEdad(){
        System.out.println("Su edad se mantiene en: " + this.edad + " años");
    }

}
