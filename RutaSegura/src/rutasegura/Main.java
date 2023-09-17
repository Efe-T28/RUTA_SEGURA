/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rutasegura;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("******RUTA SEGURA*******");
        System.out.println("---COOPERATIVA COOMACOD---");
        System.out.println("A CONTINUACIÓN DIGITE LOS DATOS PARA SOLICITAR UN PASAJE");
        Costo costo = new Costo();
        
        Cliente cliente = new Cliente();
        Scanner datos = new Scanner(System.in);

        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = datos.nextLine();
        cliente.setNombre(nombre);

        System.out.print("Ingrese el ID del cliente: ");
        double id = datos.nextDouble();
        cliente.setId(id);

        System.out.println("\nDatos del cliente ingresados:");
        cliente.mostrarDatos();

        
        Conductor a = new Conductor("Manuel Lopez",0001,31,"Ford Escape");
        Conductor b = new Conductor("Brayan Plata",0002,27,"Ram 1500");
        Conductor c = new Conductor("Mario Castillo",0003,34,"GMC Sierra");
        Conductor d = new Conductor("Natalia Peréz",0004,35,"Montero Sport");
        Conductor e = new Conductor("Marta Carrillo",0005,32,"Scania Volvo");
        
         System.out.println("    Conductor Elegido   "+e.getConductor());
        

        costo.setPrecioRutaA(16000.0);
        costo.setPrecioRutaB(18000.0);
        costo.setPrecioRutaC(27000.0);
        costo.setEncargo(5000.0);
        costo.setCargas(10000.0);

        Scanner scanner = new Scanner(System.in);
        double valorViaje = 0.0;

        while (true) {
            System.out.println("Menú:");
            System.out.println("1 - Seleccionar Ruta");
            System.out.println("2 - Agregar Encargo");
            System.out.println("3 - Calcular Costo Total");
            System.out.println("0 - Salir");

            System.out.print("Elija una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Opciones de rutas:");
                    System.out.println("A - Ruta Valledupar-Codazzi: $" + costo.getPrecioRutaA());
                    System.out.println("B - Ruta Valledupar-Peublo Bello: $" + costo.getPrecioRutaB());
                    System.out.println("C - Ruta Valledupar-Chiriguana : $" + costo.getPrecioRutaC());

                    System.out.print("Elija una ruta (A/B/C): ");
                    String rutaElegida = scanner.next().toUpperCase();

                    double costoRuta = 0.0;

                    switch (rutaElegida) {
                        case "A":
                            costoRuta = costo.getPrecioRutaA();
                            break;
                        case "B":
                            costoRuta = costo.getPrecioRutaB();
                            break;
                        case "C":
                            costoRuta = costo.getPrecioRutaC();
                            break;
                        default:
                            System.out.println("Ruta no válida.");
                            continue;
                    }

                    System.out.print("¿Desea llevar carga? (Si/No): ");
                    String respuestaCarga = scanner.next().toLowerCase();
                    double costoCarga = 0.0;

                    if (respuestaCarga.equals("si")) {
                        costoCarga = costo.getCargas();
                    }

                    valorViaje += costoRuta + costoCarga;
                    break;

                case 2:
                    System.out.print("¿Desea agregar un encargo? (Si/No): ");
                    String respuestaEncargo = scanner.next().toLowerCase();
                    double costoEncargo = 0.0;

                    if (respuestaEncargo.equals("si")) {
                        costoEncargo = costo.getEncargo();
                    }

                    valorViaje += costoEncargo;
                    break;

                case 3:
                    System.out.println("Costo total del viaje: $" + valorViaje);
                    break;

                case 0:
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
 }
    

