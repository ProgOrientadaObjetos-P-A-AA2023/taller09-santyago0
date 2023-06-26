package paquete5;

/**
 *
 * @author santy
 */
public class InstitucionEducativa {
    
    private String nombre;
    private String siglas;
    
    public InstitucionEducativa(String n, String s) {
        nombre = n;
        siglas = s;
    }
    
    public void establecerNombre(String n) {
        nombre = n;
    }
    
    public void establecerSiglas(String s) {
        siglas = s;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public String obtenerSiglas() {
        return siglas;
    }
    
}
