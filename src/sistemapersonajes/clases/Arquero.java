package sistemapersonajes.clases;
import sistemapersonajes.interfaces.Movilizable;
import sistemapersonajes.interfaces.Volador;
import sistemapersonajes.subclases.PersonajeFisico; // Ensure this class exists in the specified package

public class Arquero extends PersonajeFisico implements Volador, Movilizable{
    private int agilidad;
    private int numeFlechas;

    public Arquero(String nombre, int nivel, int salud, int agilidad, int numeFlechas) {
        super(nombre, nivel, salud);
        this.agilidad = agilidad;
        this.numeFlechas = numeFlechas;
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
}
