/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete2.Prestamo;
import paquete5.*;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo {
    
    private String nivelEstudio;
    private InstitucionEducativa centroEducativo;
    private double valorCarrera;
    private double valorMensual;
    
    public PrestamoEducativo(Persona b, int t, String c, String n,
            InstitucionEducativa cE, double vC) {
        super(b, t, c);
        nivelEstudio = n;
        centroEducativo = cE;
        valorCarrera = vC;
    }
    
    public void establecerNivelEstudio(String n) {
        nivelEstudio = n;
    }
    
    public void establecerCentroEducativo(InstitucionEducativa c) {
        centroEducativo = c;
    }
    
    public void establecerValorCarrera(double v) {
        valorCarrera = v;
    }
    
    public void establecerValorMensual() {
        valorMensual = (valorCarrera/tiempoPrestamoMeses) - (0.1 *
                (valorCarrera/tiempoPrestamoMeses));
    }
    
    @Override
    public void establecerCiudadPrestamo(String c) {
        ciudadPrestamo = c.toUpperCase();
    }
    
    public String obtenerNivelEstudio() {
        return nivelEstudio;
    }
    
    public InstitucionEducativa obtenerCentroeducativo() {
        return centroEducativo;
    }
    
    public double obtenerValorCarrera() {
        return valorCarrera;
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
        
        cadena = String.format("%sPRÉSTAMO EDUCATIVO:\n"
                + "\tCiudad: %s\n"
                + "\tNivel de Estudio: %s\n"
                + "\tCentro Educativo: %s (%S)\n"
                + "\tValor de la Carrera: $%.2f\n"
                + "\tValor Mensual Pago Préstamo Valor Carrera: $%.2f\n",
                cadena,ciudadPrestamo.toUpperCase(),
                nivelEstudio,
                centroEducativo.obtenerNombre(),
                centroEducativo.obtenerSiglas(),
                valorCarrera,
                valorMensual);
        
        return cadena;
    }
    
}
