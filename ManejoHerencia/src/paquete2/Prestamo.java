/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class Prestamo {
    
    protected Persona beneficiario;
    protected int tiempoPrestamoMeses;
    protected String ciudadPrestamo;
    
    public Prestamo(Persona b, int t, String c) {
        beneficiario = b;
        tiempoPrestamoMeses = t;
        ciudadPrestamo = c;
    }
    
    public void establecerBeneficiario(Persona b) {
        beneficiario = b;
    }
    
    public void establecerTiempoPrestamoMeses(int t) {
        tiempoPrestamoMeses = t;
    }
    
    public void establecerCiudadPrestamo(String c) {
        ciudadPrestamo = c;
    }
    
    public Persona obtenerBeneficiario() {
        return beneficiario;
    }
    
    public int obtenerTiempoPrestamoMeses() {
        return tiempoPrestamoMeses;
    }
    
    public String obtenerCiudadPrestamo() {
        return ciudadPrestamo;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Beneficiario: %s %s (username: %s)\n"
                + "Tiempo de Préstamo: %d meses\n",
                beneficiario.obtenerNombre(),
                beneficiario.obtenerApellido(),
                beneficiario.obtenerUsername(),
                tiempoPrestamoMeses);
        
        return cadena;
    }
    
}
