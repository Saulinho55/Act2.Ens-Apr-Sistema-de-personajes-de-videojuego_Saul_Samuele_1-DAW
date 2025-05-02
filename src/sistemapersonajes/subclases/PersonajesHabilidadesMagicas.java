package sistemapersonajes.subclases;
import sistemapersonajes.clases.Personaje;
public abstract class PersonajesHabilidadesMagicas extends Personaje{ // Clase abstracta que representa un personaje con habilidades mágicas
    public PersonajesHabilidadesMagicas(String nombre, int nivel, int salud) { // Constructor de la clase base
        super(nombre, nivel, salud); // Constructor de la clase base
    }
    void lanzaMagia() { // Método para lanzar magia
    System.out.println("Lanza magia"); // Método para lanzar magia
    }
}
