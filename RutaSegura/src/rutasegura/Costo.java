/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rutasegura;

/**
 *
 * @author LENOVO
 */
public class Costo {
     private double PrecioRutaA;
    private double PrecioRutaB;
    private double PrecioRutaC;
    private double Encargo;
    private double Cargas;

    public double getPrecioRutaA() {
        return PrecioRutaA;
    }

    public void setPrecioRutaA(double PrecioRutaA) {
        this.PrecioRutaA = PrecioRutaA;
    }

    public double getPrecioRutaB() {
        return PrecioRutaB;
    }

    public void setPrecioRutaB(double PrecioRutaB) {
        this.PrecioRutaB = PrecioRutaB;
    }

    public double getPrecioRutaC() {
        return PrecioRutaC;
    }

    public void setPrecioRutaC(double PrecioRutaC) {
        this.PrecioRutaC = PrecioRutaC;
    }

    public double getEncargo() {
        return Encargo;
    }

    public void setEncargo(double Encargo) {
        this.Encargo = Encargo;
    }

    public double getCargas() {
        return Cargas;
    }

    public void setCargas(double Cargas) {
        this.Cargas = Cargas;
    }
    
    public double ValorDelViaje(String rutaElegida){
        double costoRuta = 0.0;
        
        switch (rutaElegida){
            case "A":
                costoRuta = this.PrecioRutaA;
                break;
            case "B":
                costoRuta = this.PrecioRutaB;
                break;
            case "C":
                costoRuta = this.PrecioRutaC;
                break;
            default:
                System.out.println("Ruta no váñida");
                System.exit(0);
        }
        double ValorViaje = costoRuta + this.Cargas + this. Encargo;
        return ValorViaje;
    }
}
