public abstract class  Empleado {
    private int codigo;
    private String nombre;
    private String cargo;
    public Empleado(int codigo, String nombre, String cargo) {
        if(codigo < 0){
            throw new IllegalArgumentException("Codigo invalido (menor a cero)!");
        }else if(nombre == null || nombre.isEmpty()){
            throw new IllegalArgumentException("Nombre fue llenado con valores nulos o blancos!");
        }else if(cargo == null || cargo.isEmpty()){
            throw new IllegalArgumentException("Cargo fue llenado con valores nulos!");
        }else {
            this.codigo = codigo;
            this.nombre = nombre;
            this.cargo = cargo;
        }
    }
    public abstract  double calcularSueldo(double a, double b);
    public int getCodigo() { return this.codigo; }
    public String getNombre() { return this.nombre; }
    public String getCargo() { return this.cargo; }


}
