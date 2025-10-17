public class OperacionesMatematicas {
    private int entero;
    private double decimal;
    private long extenso;


    public OperacionesMatematicas(int entero, double decimal, long extenso) {
        this.entero = entero;
        this.decimal = decimal;
        this.extenso = extenso;
    }
    public OperacionesMatematicas(int entero, double decimal) {
        this.entero = entero;
        this.decimal = decimal;

    }
    public int getEntero( ) {
        return entero;
    }
    public double getDecimal( ) {
       return   decimal;
    }
    public long getExtenso(  ) {
        return  extenso;
    }

    public void SumarEntero( ) {

        this.entero += entero;
    }
    public void DividirLong( ) {
        this.extenso = extenso/10;
    }
    public void MultiplicarDecimal( ) {
        this.decimal = decimal * decimal;
    }
}
