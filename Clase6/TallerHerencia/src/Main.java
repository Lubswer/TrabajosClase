public class Main {
    public static void main(String[] args) {
        Profesor p = new Profesor("1234567890", "Pedro", 40, 500);
        Estudiante estudiante = new Estudiante("1753019122", "Lubswer", 20, "A001");
        Persona per = new Persona("9874563210", "Andrea", 17);
        System.out.println(" ============================");
        System.out.print("Estudiante ");
        estudiante.imprimirEstudiante();
        System.out.println(" ============================");
        System.out.print("Profesor ");
        p.imprimirProfesor();
        System.out.println(" ============================");
        System.out.print("Persona ");
        per.imprimir();
    }
}
