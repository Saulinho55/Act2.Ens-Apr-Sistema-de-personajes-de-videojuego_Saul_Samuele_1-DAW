package sistemapersonajes.clases;
import sistemapersonajes.interfaces.Movilizable;
import sistemapersonajes.interfaces.Volador;
import sistemapersonajes.subclases.PersonajeFisico;

public class Arquero extends PersonajeFisico implements Volador, Movilizable{  
    private int agilidad; // Atributo de la clase Arquero
    private int numFlechas; // Atributo de la clase Arquero
    public Arquero(String nombre, int nivel, int salud, int agilidad, int numFlechas) { // Constructor de la clase Arquero
        super(nombre, nivel, salud); // Llama al constructor de la clase padre PersonajeFisico
        this.agilidad = agilidad;   // Inicializa la agilidad del arquero
        this.numFlechas = numFlechas; // Inicializa el número de flechas del arquero
    }
    @Override
    public void atacar() {
        System.out.println("El arquero " + nombre + " lanza una flecha.");  // Implementación del método atacar
    }

    public void dispararFlecha() {
        System.out.println("El arquero " + nombre + " dispara una flecha."); // Implementación del método dispararFlecha
    }

    public void reabastecerFlechas() {
        System.out.println("El arquero " + nombre + " reabastece sus flechas."); // Implementación del método reabastecerFlechas
    }
    @Override
    public void moverse() {
        System.out.println("El arquero " + nombre + " se mueve."); // Implementación del método moverse
    }

    @Override
    public void volar() {
        System.out.println("El arquero " + nombre + " vuela."); // Implementación del método volar
    }
}
