package sistemapersonajes.clases;

import sistemapersonajes.interfaces.Defendible;
import sistemapersonajes.subclases.PersonajeFisico;

public class Guerrero extends PersonajeFisico implements Defendible {
    private int fuerza; // Atributo de la clase Guerrero
    private int armadura; // Atributo de la clase Guerrero
    private int escudo; // Atributo de la clase Guerrero

    public Guerrero(String nombre, int nivel, int salud, int fuerza, int armadura, int escudo) { // Constructor de la clase Guerrero
        super(nombre, nivel, salud); // Llama al constructor de la clase padre PersonajeFisico
        this.fuerza = fuerza; // Inicializa la fuerza del guerrero
        this.armadura = armadura;
        this.escudo = escudo;
    }
    @Override
    public void atacar() {
        System.out.println("El guerrero " + nombre + " lanza un ataque."); // Implementación del método atacar
    }
    @Override
    public void defender() {
        System.out.println("El guerrero " + nombre + " se defiende."); // Implementación del método defender
    }
}
