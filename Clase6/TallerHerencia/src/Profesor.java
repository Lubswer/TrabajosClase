class Profesor extends Persona{
    double salario;
    public Profesor(String cedula, String nombre, int edad, double salario) {
        super(cedula, nombre, edad);
        this.salario = salario;
    }
    public void imprimirProfesor() {
        super.imprimir();
        System.out.println("Salario: " + salario);
    }
}