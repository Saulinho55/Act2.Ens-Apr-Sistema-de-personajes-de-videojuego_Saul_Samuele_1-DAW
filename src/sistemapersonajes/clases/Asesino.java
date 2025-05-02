package sistemapersonajes.clases;

import sistemapersonajes.interfaces.Curable;
import sistemapersonajes.interfaces.Movilizable;
import sistemapersonajes.subclases.PersonajeFisico;

public class Asesino extends PersonajeFisico implements Movilizable, Curable {
    private int sigilo, critico; // Atributos de la clase Asesino

    public Asesino(String nombre, int nivel, int salud, int sigilo, int critico) { // Constructor de la clase Asesino
        super(nombre, nivel, salud); // Llama al constructor de la clase padre PersonajeFisico
        this.sigilo = sigilo; // Inicializa el sigilo del asesino
        this.critico = critico; // Inicializa el crítico del asesino
    }
    @Override
    public void atacar() {
        System.out.println("El asesino " + nombre + " lanza un ataque sigiloso."); // Implementación del método atacar
    }
    
    @Override
    public void curar() {
        System.out.println("El asesino " + nombre + " se cura."); // Implementación del método curar
    }
    @Override
    public void moverse() {
        System.out.println("El asesino " + nombre + " se mueve sigilosamente."); // Implementación del método moverse
    }
    public void atacarPorLaEspalda() {
        System.out.println("El asesino " + nombre + " ataca por la espalda."); // Implementación del método atacarPorLaEspalda
    }
    public void ocultar() {
        System.out.println("El asesino " + nombre + " se oculta."); // Implementación del método ocultar
    }
}
