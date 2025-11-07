class Estudiante extends Persona{
    String codigo;
    public Estudiante(String cedula, String nombre, int edad, String codigo) {
        super(cedula, nombre, edad);
        this.codigo = codigo;
    }
    public void imprimirEstudiante() {
        super.imprimir();
        System.out.println("Codigo: " + codigo);
    }
}