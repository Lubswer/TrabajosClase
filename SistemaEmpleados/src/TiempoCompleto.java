public class TiempoCompleto extends Empleado{
    private double sueldoBase;
    private double bono;
    private String tipo;
    public TiempoCompleto(int codigo, String nombre, String cargo, double sueldoBase, double bono, String tipo) {
        super(codigo,nombre,cargo);
        if(sueldoBase<0){
            throw new IllegalArgumentException("El sueldo es negativo");
        }else if(bono<0){
            throw new IllegalArgumentException("El bono es negativo");
        }else{
            this.sueldoBase = sueldoBase;
            this.bono = bono;
            this.tipo = tipo;
        }
    }
    public  double calcularSueldo( double Scantidad, double Bcantidad){
        double total = Scantidad + Bcantidad;
        return total;
    }
    public double getSueldoBase() { return this.sueldoBase; }
    public double getBono() { return this.bono; }
    public String getTipo() { return this.tipo; }

}
