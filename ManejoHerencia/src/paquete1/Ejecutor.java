/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.ArrayList;
import java.util.Scanner;
import paquete2.Prestamo;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;
import paquete5.*;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        // Variable a utilizar
        String nombre;
        String apellido;
        String username;
        String nombreIE;
        String siglas;
        int meses;
        String ciudad;
        String nombreG;
        String apellidoG;
        String usernameG;
        String tipoAuto;
        String marcaAuto;
        double valorAuto;
        String nivelE;
        double valorCarrera;
        ArrayList<Prestamo> lista = new ArrayList();
        
        // Variable para la entrada de datos
        Scanner sc = new Scanner(System.in);
        int opcion;
        String continuar;
        
        // Menú para ingresar Préstamos
        do {
            System.out.printf("%s\n%s\n%s\n%s\n\n%s",
                    "---[GENERACIÓN DE PRÉSTAMOS]---",
                    "Escoja el tipo de Préstamo que desea ingresar:",
                    "1) Préstamo Automóvil",
                    "2) Préstamo Educativo",
                    "Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println("");
            
            // Ingreso de datos de un Prestamo
            System.out.print("Ingrese el nombre del beneficiario: ");
            nombre = sc.nextLine();
            System.out.print("Ingrese el apellido del beneficiario: ");
            apellido = sc.nextLine();
            System.out.print("Ingrese el username del beneficiario: ");
            username = sc.nextLine();
            System.out.print("Ingrese el tiempo del préstamo en meses: ");
            meses = sc.nextInt();
            sc.nextLine();
            System.out.print("Ingrese la ciudad del préstamo: ");
            ciudad = sc.nextLine();
            
            // Objeto de tipo Persona para el Beneficiario
            Persona p = new Persona(nombre,apellido,username);
            
            if(opcion == 1) {
                // Ingreso de datos de un PrestamoAutomovil
                System.out.print("Ingrese el tipo de automóvil: ");
                tipoAuto = sc.nextLine();
                System.out.print("Ingrese la marca del automóvil: ");
                marcaAuto = sc.nextLine();
                System.out.print("Ingrese el nombre del garante: ");
                nombreG = sc.nextLine();
                System.out.print("Ingrese el apellido del garante: ");
                apellidoG = sc.nextLine();
                System.out.print("Ingrese el username del garante: ");
                usernameG = sc.nextLine();
                System.out.print("Ingrese el valor del automóvil: ");
                valorAuto = sc.nextDouble();
                sc.nextLine();
                System.out.println("");

                // Objeto de tipo Persona para el Garante
                Persona g = new Persona(nombreG,apellidoG,usernameG);

                // Objeto de tipo PrestamoAutomovil
                PrestamoAutomovil pA = new PrestamoAutomovil(p,meses,
                        ciudad,tipoAuto,marcaAuto,g,valorAuto);
                pA.establecerValroMensual();

                lista.add(pA);
            }else {
                if(opcion == 2) {
                    System.out.print("Ingrese el nivel de estudios: ");
                    nivelE = sc.nextLine();
                    System.out.print("Ingrese el nombre del la institución: ");
                    nombreIE = sc.nextLine();
                    System.out.print("Ingrese las siglas de la institución: ");
                    siglas = sc.nextLine();
                    System.out.print("Ingrese el valor de la carrera: ");
                    valorCarrera = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("");
                    
                    // Objeto de tipo InstitucionEducativa
                    InstitucionEducativa iE = new InstitucionEducativa(
                            nombreIE,siglas);
                    
                    // Objeto de tipo PrestamoEducativo
                    PrestamoEducativo pE = new PrestamoEducativo(p,meses,
                            ciudad,nivelE,iE,valorCarrera);
                    pE.establecerValorMensual();
                    
                    lista.add(pE);
                }else {
                    System.out.println("\nOpción no válida, ingrese de nuevo"
                            + "\n");
                }
            }
            
            System.out.println("¿Desea seguir ingresando más préstamos?\nDigite"
                    + " 'S' para continuar o digite cualquier otra letra para "
                    + "salir del promgrama");
            continuar = sc.nextLine().toLowerCase();
            
            if(!continuar.equals("s")) {
               for(int i = 0; i < lista.size(); i++){
                   Prestamo prestamo = lista.get(i);
                   System.out.printf("\nPRÉSTAMO (%d):\n%s",
                           i+1,
                           prestamo);
                } 
            }
            
        }while(continuar.equals("s"));
    }
    
}
