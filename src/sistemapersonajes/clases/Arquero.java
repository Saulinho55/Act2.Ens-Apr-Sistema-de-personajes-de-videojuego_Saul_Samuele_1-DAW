package sistemapersonajes.clases;
import sistemapersonajes.interfaces.Movilizable;
import sistemapersonajes.interfaces.Volador;
import sistemapersonajes.subclases.PersonajeFisico;

public class Arquero extends PersonajeFisico implements Volador, Movilizable{
    private int agilidad;
    private int numFlechas;
    public Arquero(String nombre, int nivel, int salud, int agilidad, int numFlechas) {
        super(nombre, nivel, salud);
        this.agilidad = agilidad;
        this.numFlechas = numFlechas;
    }
    @Override
    public void atacar() {
        System.out.println("El arquero " + nombre + " lanza una flecha.");
    }

    public void dispararFlecha() {
        System.out.println("El arquero " + nombre + " dispara una flecha.");
    }

    public void reabastecerFlechas() {
        System.out.println("El arquero " + nombre + " reabastece sus flechas.");
    }
    @Override
    public void moverse() {
        System.out.println("El arquero " + nombre + " se mueve.");
    }

    @Override
    public void volar() {
        System.out.println("El arquero " + nombre + " vuela.");
    }
}
