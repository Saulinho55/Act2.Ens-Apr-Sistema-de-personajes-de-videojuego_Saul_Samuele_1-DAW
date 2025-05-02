package sistemapersonajes.clases;

import sistemapersonajes.interfaces.Curable;
import sistemapersonajes.interfaces.Magico;
import sistemapersonajes.subclases.PersonajesHabilidadesMagicas;

public class Mago extends PersonajesHabilidadesMagicas implements Magico, Curable {
    }
    @Override
    public void atacar() {
        System.out.println("El mago " + nombre + " lanza un ataque");
        System.out.println("El mago " + nombre + " lanza un ataque"); // Implementación del método atacar
    }
    @Override
    public void curar() {
        System.out.println("El mago " + nombre + " se cura");
        System.out.println("El mago " + nombre + " se cura"); // Implementación del método curar
    }
    @Override
    public void lanzarHechizo() {
        System.out.println("El mago " + nombre + " lanza un hechizo.");
        System.out.println("El mago " + nombre + " lanza un hechizo."); // Implementación del método lanzarHechizo
    }
    public void regenerarMana() {
        System.out.println("El mago " +nombre+ " regenera mana");
    }
}
