/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author vina
 */
public class Paciente {
    
    private String rut,nombe, direccion, ciudad;
    private int edad;
    private boolean genero,isapre,donante;

    public Paciente() {
    }

    public Paciente(String rut, String nombe, String direccion, String ciudad, int edad, boolean genero, boolean isapre, boolean donante) {
        this.rut = rut;
        this.nombe = nombe;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.edad = edad;
        this.genero = genero;
        this.isapre = isapre;
        this.donante = donante;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombe() {
        return nombe;
    }

    public void setNombe(String nombe) {
        this.nombe = nombe;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }

    public boolean isIsapre() {
        return isapre;
    }

    public void setIsapre(boolean isapre) {
        this.isapre = isapre;
    }

    public boolean isDonante() {
        return donante;
    }

    public void setDonante(boolean donante) {
        this.donante = donante;
    }
    
    
    
}
