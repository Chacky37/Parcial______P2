/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Saul Hernandez Castilla
 */
public class Participante {
    private String nombre;
    private String apellido;
    private int numerodelpart;
    private Llanta info;

    public Participante(String nombre, String apellido, int numerodelpar) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Participante(String nombre, String apellido, int numerodelpart, Llanta info) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numerodelpart = numerodelpart;
        this.info = info;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Llanta getInfo() {
        return info;
    }

    public void setInfo(Llanta info) {
        this.info = info;
    }

    public int getNumerodelpart() {
        return numerodelpart;
    }

    public void setNumerodelpart(int numerodelpart) {
        this.numerodelpart = numerodelpart;
    }

    
    
    @Override
    public String toString() {
        return "Participante{" +
                "nombre=" + nombre + 
                ", apellido=" + apellido +
                ", info=" + info.toString()+ '}';
    }
    
    
    
    
    
    
    
    
}
