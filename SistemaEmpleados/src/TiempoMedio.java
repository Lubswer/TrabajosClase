public class TiempoMedio extends Empleado {
    private double horas;
    private double pagoHora;
    private String tipo;
    public TiempoMedio(int codigo, String nombre, String cargo, double horas, double pagoHora, String tipo) {
        super(codigo, nombre, cargo);
        if(horas < 0){
            throw new IllegalArgumentException("Horas invalido (menor a cero)!");
        }else if(pagoHora < 0){
            throw new IllegalArgumentException("Pago Hora invalido (menor a cero)!");
        }else {
            this.horas = horas;
            this.pagoHora = pagoHora;
            this.tipo = tipo;
        }
    }
    public double calcularSueldo(double horas, double pagoHora) {
        return horas * pagoHora;
    }
    public double getHoras() { return this.horas; }
    public double getPagoHora() { return this.pagoHora; }
    public String getTipo() { return this.tipo; }
}
