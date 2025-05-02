package sistemapersonajes.subclases;
import sistemapersonajes.clases.Personaje;

public abstract class PersonajeFisico extends Personaje { // Clase abstracta que representa un personaje físico
    public PersonajeFisico(String nombre, int nivel, int salud) { // Constructor de la clase base
        super(nombre, nivel, salud); // Constructor de la clase base
    }
    void lanzaObjeto() { // Método para lanzar un objeto
        System.out.println("Lanza objeto"); // Método para lanzar un objeto
    }
}
