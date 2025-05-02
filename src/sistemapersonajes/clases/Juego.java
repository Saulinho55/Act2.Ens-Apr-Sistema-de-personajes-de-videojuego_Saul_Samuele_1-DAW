package sistemapersonajes.clases;
import java.util.ArrayList;
import sistemapersonajes.interfaces.Curable;
import sistemapersonajes.interfaces.Defendible;
import sistemapersonajes.interfaces.Magico;
import sistemapersonajes.interfaces.Movilizable;
import sistemapersonajes.interfaces.Volador;

public class Juego {
    private ArrayList<Personaje> personajes = new ArrayList<>();

    public void AñadirPersonaje(Personaje personaje) {
        personajes.add(personaje);
    }

    public void mostrarAcciones() {
        for (Personaje personaje : personajes) {
            System.out.println(personaje);
            personaje.atacar();
            if (personaje instanceof Curable) ((Curable) personaje).curar();
            if (personaje instanceof Magico) ((Magico) personaje).lanzarHechizo();
            if (personaje instanceof Defendible) ((Defendible) personaje).defender();
            if (personaje instanceof Volador) ((Volador) personaje).volar();
            if (personaje instanceof Movilizable) ((Movilizable) personaje).moverse();
        }
    }
    public void listarPersonajes() {
        for (int i = 0; i < personajes.size(); i++) {
            System.out.println(i + ". " + personajes.get(i));
        }
    }
    
    public void EliminarPersonaje(int indice) {
        if (indice >= 0 && indice < personajes.size()) {
            System.out.println(personajes.get(indice).nombre + " eliminado.");
            personajes.remove(indice);
        } else {
            System.out.println("Índice inválido.");
        }
    }
    
}