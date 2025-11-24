
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class TechESFOT {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        ArrayList<Empleado> empleados = new ArrayList<>();
        do {
            System.out.println("//                     ===== MENU DE EMPLEADOS ===== //");
            System.out.println("1. Registrar empelado tiempo completo\n2. Registrar empleado medio tiempo\n3. Mostrar emplados registrados\n4. Mostrar estadisticas\n5. Salir");
            System.out.println("-> Ingrese una opcion: ");

            try {
                opcion = teclado.nextInt();
                switch (opcion) {
                    case 1:
                        empleados.add(crearTiempoCompleto(teclado));
                        System.out.println("Empleado a tiempo completo registrado exitosamente!");
                        break;
                    case 2:
                        empleados.add(crearTiempoMedio(teclado));
                        System.out.println("Empleado a medio registrado exitosamente!");
                        break;
                    case 3:
                        if (empleados.isEmpty()) {
                            throw new ArrayVacioExeptioPersonalizada("Lista de empleados vacia!");
                        } else {

                            for (Empleado emp : empleados) {
                                if (emp instanceof TiempoCompleto) {
                                    TiempoCompleto tc = (TiempoCompleto) emp;
                                    double sueldoBase = tc.getSueldoBase();
                                    double bono = tc.getBono();
                                    System.out.println("Codigo: " + tc.getCodigo() +
                                            ", Nombre: " + tc.getNombre()
                                            + ", Cargo: " + tc.getCargo() +
                                            ", Sueldo: $" + tc.calcularSueldo(sueldoBase, bono) + " -> TIPO: " + tc.getTipo());
                                }
                                System.out.println("-----------------------------------------------------------------");
                                if (emp instanceof TiempoMedio) {
                                    TiempoMedio tm = (TiempoMedio) emp;
                                    double horas = tm.getHoras();
                                    double pagoHora = tm.getPagoHora();
                                    System.out.println("Codigo: " + tm.getCodigo() +
                                            ", Nombre: " + tm.getNombre() +
                                            ", Cargo: " + tm.getCargo() +
                                            ", Sueldo: $" + tm.calcularSueldo(horas, pagoHora) + " -> TIPO: " + tm.getTipo());
                                }
                            }
                        }
                        break;
                    case 4:
                        if (empleados.isEmpty()) {
                            throw new ArrayVacioExeptioPersonalizada("Lista de empleados vacia!");
                        } else {
                            int idMayor = 0;
                            String nombreMayor = " ";
                            double promedioSalarial = 0;
                            double sueldoMayor = 0;
                            int contador = 0;
                            ArrayList<Double> sueldos = new ArrayList<>();
                            for (Empleado emp : empleados) {
                                if (emp instanceof TiempoCompleto) {
                                    TiempoCompleto tc = (TiempoCompleto) emp;
                                    double sueldoBase = tc.getSueldoBase();
                                    double bono = tc.getBono();
                                    sueldos.add(tc.calcularSueldo(sueldoBase, bono));
                                }
                                if (emp instanceof TiempoMedio) {
                                    TiempoMedio tm = (TiempoMedio) emp;
                                    double horas = tm.getHoras();
                                    double pagoHora = tm.getPagoHora();
                                    sueldos.add(tm.calcularSueldo(horas, pagoHora));
                                }
                            }
                            for (Double s : sueldos) {
                                promedioSalarial += s;
                                contador += 1;
                            }
                            promedioSalarial = promedioSalarial / contador;
                            for (Double s : sueldos) {
                                if (s > sueldoMayor) {
                                    sueldoMayor = s;
                                }
                            }
                            for (Empleado emp : empleados) {
                                if (emp instanceof TiempoCompleto) {
                                    TiempoCompleto tc = (TiempoCompleto) emp;
                                    double sueldoBase = tc.getSueldoBase();
                                    double bono = tc.getBono();
                                    double sueldoC = tc.calcularSueldo(sueldoBase, bono);
                                    if (sueldoC == sueldoMayor) {
                                        idMayor = tc.getCodigo();
                                    }
                                }

                                if (emp instanceof TiempoMedio) {
                                    TiempoMedio tm = (TiempoMedio) emp;
                                    double horas = tm.getHoras();
                                    double pagoHora = tm.getPagoHora();
                                    double sueldoM = tm.calcularSueldo(horas, pagoHora);
                                    if (sueldoM == sueldoMayor) {
                                        idMayor = tm.getCodigo();
                                    }
                                }

                            }
                            for (Empleado emp : empleados) {
                                if (emp instanceof TiempoCompleto) {
                                    TiempoCompleto tc = (TiempoCompleto) emp;
                                    int idC = tc.getCodigo();
                                    if (idC == idMayor) {
                                        nombreMayor = tc.getNombre();
                                    }
                                }

                                if (emp instanceof TiempoMedio) {
                                    TiempoMedio tm = (TiempoMedio) emp;
                                    int idM = tm.getCodigo();
                                    if (idM == idMayor) {
                                        nombreMayor = tm.getNombre();
                                    }
                                }
                            }
                            System.out.println("El empleado con mayor sueldo es: " + nombreMayor);
                            System.out.println("El promedio de los sueldos es: " + promedioSalarial);
                        }
                        break;
                    case 5:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opcion fuera de rango!");
                }
            } catch (IllegalArgumentException iae) {
                System.out.println("Error: " + iae.getMessage());
            } catch (InputMismatchException ime) {
                System.out.println("Error: Ingreso de tipo de dato incorrecto");
                teclado.nextLine();
            } catch (ArrayVacioExeptioPersonalizada avep) {
                System.out.println("Error: " + avep.getMessage());

            }
        } while (opcion != 5);
        teclado.close();

    }

    // metodos lectores de objetos
    public static TiempoCompleto crearTiempoCompleto(Scanner teclado) {
        System.out.println("Ingrese el codigo del empleado: ");
        int codigo = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese el nombre: ");
        String nombre = teclado.next();
        System.out.println("Ingrese el cargo: ");
        String cargo = teclado.next();
        System.out.println("Ingrese el sueldo base del empleado");
        double sueldo = teclado.nextDouble();
        System.out.println("Ingrese el bono del empleado: ");
        double bono = teclado.nextDouble();
        teclado.nextLine();
        return new TiempoCompleto(codigo, nombre, cargo, sueldo, bono, "Empleado de tiempo completo");

    }

    public static TiempoMedio crearTiempoMedio(Scanner teclado) {
        System.out.println("Ingrese el codigo del empleado: ");
        int codigo = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese el nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el cargo: ");
        String cargo = teclado.nextLine();
        System.out.println("Ingrese las Horas que trabajara: ");
        double horas = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Ingrese el pago por hora: ");
        double pago = teclado.nextDouble();
        teclado.nextLine();
        return new TiempoMedio(codigo, nombre, cargo, horas, pago, "Empleado a medio tiempo");
    }
}
