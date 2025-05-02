package sistemapersonajes.clases;

import sistemapersonajes.interfaces.Curable;
import sistemapersonajes.interfaces.Magico;
import sistemapersonajes.subclases.PersonajesHabilidadesMagicas;

public class Mago extends PersonajesHabilidadesMagicas implements Magico, Curable {
    private int mana;
    private int sabiduria;
    public Mago(String nombre, int nivel, int salud, int mana, int sabiduria) {
        super(nombre, nivel, salud);
        this.mana = mana;
        this.sabiduria = sabiduria;
    }
    @Override
    public void atacar() {
        System.out.println("El mago " + nombre + " lanza un ataque");
    }
    @Override
    public void curar() {
        System.out.println("El mago " + nombre + " se cura");
    }
    @Override
    public void lanzarHechizo() {
        System.out.println("El mago " + nombre + " lanza un hechizo.");
    }
}
