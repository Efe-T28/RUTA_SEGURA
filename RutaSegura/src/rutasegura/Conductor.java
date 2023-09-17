/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rutasegura;

/**
 *
 * @author LENOVO
 */
public class Conductor {
     private String Nombre;
    private double ID;
    private int edad;
    private String vehiculo;

    public Conductor(String Nombre, double ID, int edad, String vehiculo) {
        this.Nombre = Nombre;
        this.ID = ID;
        this.edad = edad;
        this.vehiculo = vehiculo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getID() {
        return ID;
    }

    public void setID(double ID) {
        this.ID = ID;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    public String getConductor(){
        return ("\n Nombre: "+this.Nombre+"\n Identificacion: "+this.ID+"\n Edad: "+this.edad+"\n Vehiculo: "+this.vehiculo);
    }
}
