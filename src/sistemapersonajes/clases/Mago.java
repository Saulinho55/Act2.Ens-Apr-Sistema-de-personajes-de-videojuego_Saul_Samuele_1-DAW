package sistemapersonajes.clases;

import sistemapersonajes.interfaces.Curable;
import sistemapersonajes.interfaces.Magico;
import sistemapersonajes.subclases.PersonajesHabilidadesMagicas;

public class Mago extends PersonajesHabilidadesMagicas implements Magico, Curable {
    private int mana; // Atributo de la clase Mago
    private int sabiduria; // Atributo de la clase Mago
    public Mago(String nombre, int nivel, int salud, int mana, int sabiduria) { // Constructor de la clase Mago
        super(nombre, nivel, salud); // Llama al constructor de la clase padre con los parámetros necesarios
        this.mana = mana; // Inicializa el mana del mago
        this.sabiduria = sabiduria; // Inicializa la sabiduría del mago
    }
    @Override
    public void atacar() {
        System.out.println("El mago " + nombre + " lanza un ataque"); // Implementación del método atacar
    }
    @Override
    public void curar() {
        System.out.println("El mago " + nombre + " se cura"); // Implementación del método curar
    }
    @Override
    public void lanzarHechizo() {
        System.out.println("El mago " + nombre + " lanza un hechizo."); // Implementación del método lanzarHechizo
    }
    public void regenerarMana() {
        System.out.println("El mago " +nombre+ " regenera mana");
    }
}
