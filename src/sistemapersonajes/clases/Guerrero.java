package sistemapersonajes.clases;

import sistemapersonajes.interfaces.Defendible;
import sistemapersonajes.subclases.PersonajeFisico;

public class Guerrero extends PersonajeFisico implements Defendible {
    private int fuerza;
    private int armadura;
    private int escudo;

    public Guerrero(String nombre, int nivel, int salud, int fuerza, int armadura, int escudo) {
        super(nombre, nivel, salud);
        this.fuerza = fuerza;
        this.armadura = armadura;
        this.escudo = escudo;
    }
    @Override
    public void atacar() {
        System.out.println("El guerrero " + nombre + " lanza un ataque.");
    }
    @Override
    public void defender() {
        System.out.println("El guerrero " + nombre + " se defiende.");
    }
}
