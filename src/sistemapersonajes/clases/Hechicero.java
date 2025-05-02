package sistemapersonajes.clases;

import sistemapersonajes.interfaces.Defendible;
import sistemapersonajes.interfaces.Magico;
import sistemapersonajes.subclases.PersonajesHabilidadesMagicas;

public class Hechicero extends PersonajesHabilidadesMagicas implements Magico, Defendible {
    private int mana; // Atributo de la clase Hechicero
    private int concentracion; // Atributo de la clase Hechicero

    @Override
    public void lanzarHechizo() {
        System.out.println("El hechicero " + nombre + " lanza un poderoso hechizo.");   // Implementación del método lanzarHechizo
    }
    public Hechicero(String nombre, int nivel, int salud, int mana, int concentracion) { // Constructor de la clase Hechicero
        super(nombre, nivel, salud); // Llama al constructor de la clase padre PersonajesHabilidadesMagicas
        this.mana = mana;  // Inicializa el mana del hechicero
        this.concentracion = concentracion;  // Inicializa la concentración del hechicero
    }

    @Override
    public void atacar() {
        System.out.println("El hechicero " + nombre + " lanza un hechizo."); // Implementación del método atacar
    }

    public void invocarEntidad() {
        System.out.println("El hechicero " + nombre + " invoca una entidad."); // Implementación del método invocarEntidad
    }
    
    public void defender() {
        System.out.println("El hechicero se defiende."); // Implementación del método defender
    }
}
