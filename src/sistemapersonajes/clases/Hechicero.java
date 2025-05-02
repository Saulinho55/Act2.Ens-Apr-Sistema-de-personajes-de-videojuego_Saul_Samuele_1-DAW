package sistemapersonajes.clases;

import sistemapersonajes.interfaces.Defendible;
import sistemapersonajes.interfaces.Magico;
import sistemapersonajes.subclases.PersonajesHabilidadesMagicas;

public class Hechicero extends PersonajesHabilidadesMagicas implements Magico, Defendible {
    private int mana;
    private int concentracion;
    @Override
    public void lanzarHechizo() {
        System.out.println("El hechicero " + nombre + " lanza un poderoso hechizo.");
    }
    public Hechicero(String nombre, int nivel, int salud, int mana, int concentracion) {
        super(nombre, nivel, salud);
        this.mana = mana;
        this.concentracion = concentracion;
    }

    @Override
    public void lanzarHechizo() {
        System.out.println("El hechicero " + nombre + " lanza un poderoso hechizo.");
    }
    @Override
    public void atacar() {
        System.out.println("El hechicero " + nombre + " lanza un hechizo.");
        System.out.println("El hechicero " + nombre + " lanza un ataque.");
    }

    public void invocarEntidad() {
        System.out.println("El hechicero " + nombre + " invoca una entidad.");
        System.out.println("El hechicero " + nombre + " invoca una entidad."); // Implementación del método invocarEntidad
    }
    
    public void defender() {
        System.out.println("El hechicero se defiende.");
        System.out.println("El hechicero se defiende."); // Implementación del método defender
    }
}
