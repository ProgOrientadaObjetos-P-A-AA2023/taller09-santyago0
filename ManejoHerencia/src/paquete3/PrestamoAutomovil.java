/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.Prestamo;
import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo {
    
    private String tipoAutomovil;
    private String marcaAutomovil;
    private Persona garante1;
    private double valorAutomovil;
    private double valorMensual;
    
    public PrestamoAutomovil(Persona b, int t, String c, String tA, String mA,
            Persona g, double vA) {
        super(b, t, c);
        tipoAutomovil = tA;
        marcaAutomovil = mA;
        garante1 = g;
        valorAutomovil = vA;
    }
    
    public void establecerTipoAutomovil(String t) {
        tipoAutomovil = t;
    }
    
    public void establecerMarcaAutomovil(String m) {
        marcaAutomovil = m;
    }
    
    public void establecerGarante(Persona g) {
        garante1 = g;
    }
    
    public void establecerValorAutomovil(double v) {
        valorAutomovil = v;
    }
    
    public void establecerValroMensual() {
        valorMensual = valorAutomovil/tiempoPrestamoMeses;
    }
    
    @Override
    public void establecerCiudadPrestamo(String c) {
        ciudadPrestamo = c.toLowerCase();
    }
    
    public String obtenerTipoAutomovil() {
        return tipoAutomovil;
    }
    
    public String obtenerMarcaAutomovil() {
        return marcaAutomovil;
    }
    
    public Persona obtenerGarante() {
        return garante1;
    }
    
    public double obtenerValorAutomovil() {
        return valorAutomovil;
    }
    
    public double obtenerValorMensual() {
        return valorMensual;
    }
    
    public String obtenerCiudad() {
        return ciudadPrestamo;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("%s",super.toString());
        
        cadena = String.format("%sPRÉSTAMO AUTOMÓVIL:\n"
                + "\tCiudad: %s\n"
                + "\tTipo de Automóvil: %s\n"
                + "\tMarca del Automóvil: %s\n"
                + "\tGarante: %s %s (username: %s)\n"
                + "\tValor Automóvil: $%.2f\n"
                + "\tValor Mensual Pago Préstamo Automóvil: $%.2f\n",
                cadena,ciudadPrestamo.toLowerCase(),
                tipoAutomovil,
                marcaAutomovil,
                garante1.obtenerNombre(),
                garante1.obtenerApellido(),
                garante1.obtenerUsername(),
                valorAutomovil,
                valorMensual);
        
        return cadena;
    }
    
}
