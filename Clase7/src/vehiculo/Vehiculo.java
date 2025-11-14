package vehiculo;

public  class Vehiculo {
    private String placa;
    private String marca;
    private int año;
    private String propietario;
    public Vehiculo(String placa, String marca, int año, String propietario) {
        this.placa = placa;
        this.marca = marca;
        this.año = año;
        this.propietario = propietario;
    }


    public String getPlaca() {return placa;}
    public String getMarca() {return marca;}
    public int getAño(){return año;}
    public String getPropietario() {return propietario;}

    public void setPlaca(String placa) {

            if (placa != null && !placa.isEmpty()) {
                this.placa = placa;
            } else {
                System.out.println("Placa no valida");
                this.placa = null;
                System.out.println("intente con otro numero de placa");

            }

    }


}
