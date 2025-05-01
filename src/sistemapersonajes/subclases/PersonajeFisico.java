package sistemapersonajes.subclases;
import sistemapersonajes.clases.Personaje;

public abstract class PersonajeFisico extends Personaje {
    public PersonajeFisico(String nombre, int nivel, int salud) {
        super(nombre, nivel, salud);
    }
    void lanzaObjeto() {
        System.out.println("Lanza objeto");
    }
}
