package sistemapersonajes.subclases;
import sistemapersonajes.clases.Personaje;
public abstract class PersonajesHabilidadesMagicas extends Personaje{
    public PersonajesHabilidadesMagicas(String nombre, int nivel, int salud) {
        super(nombre, nivel, salud);
    }
    void lanzaMagia() {
        System.out.println("Lanza magia");
    }
}
