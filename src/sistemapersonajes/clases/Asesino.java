package sistemapersonajes.clases;

import sistemapersonajes.interfaces.Curable;
import sistemapersonajes.interfaces.Movilizable;
import sistemapersonajes.subclases.PersonajeFisico;

public class Asesino extends PersonajeFisico implements Movilizable, Curable {
    private int sigilo, critico;

    public Asesino(String nombre, int nivel, int salud, int sigilo, int critico) {
        super(nombre, nivel, salud);
        this.sigilo = sigilo;
        this.critico = critico;
    }
    @Override
    public void atacar() {
        System.out.println("El asesino " + nombre + " lanza un ataque sigiloso.");
    }
    
    @Override
    public void curar() {
        System.out.println("El asesino " + nombre + " se cura.");
    }
    @Override
    public void moverse() {
        System.out.println("El asesino " + nombre + " se mueve sigilosamente.");
    }
    public void atacarPorLaEspalda() {
        System.out.println("El asesino " + nombre + " ataca por la espalda.");
    }
    public void ocultar() {
        System.out.println("El asesino " + nombre + " se oculta.");
    }
}
