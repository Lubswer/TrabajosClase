import vehiculo.Vehiculo;
import java.util.Scanner;
public class MainClase7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Vehiculo ola = new Vehiculo("adasd","asdasdas", 45,"asdasd");
        String placa = teclado.nextLine();
        ola.setPlaca(placa);

        do {
            if(placa == null || placa.isEmpty()){
                placa = teclado.nextLine();
            }else{
                System.out.println("Placa correcta");
            }
        }while(ola.getPlaca() == null || ola.getPlaca().isEmpty());



    }
}
