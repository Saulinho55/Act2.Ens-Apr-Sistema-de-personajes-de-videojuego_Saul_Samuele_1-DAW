package sistemapersonajes.clases;
import java.util.ArrayList;
import sistemapersonajes.interfaces.Curable;
import sistemapersonajes.interfaces.Defendible;
import sistemapersonajes.interfaces.Magico;
import sistemapersonajes.interfaces.Movilizable;
import sistemapersonajes.interfaces.Volador;

public class Juego {
    private ArrayList<Personaje> personajes = new ArrayList<>(); // Lista de personajes en el juego

    public void AñadirPersonaje(Personaje personaje) { // Método para añadir un personaje a la lista
        personajes.add(personaje);
    }

    public void mostrarAcciones() { // Método para mostrar las acciones de todos los personajes
        for (Personaje personaje : personajes) {
            System.out.println(personaje); // Mostrar información del personaje
            personaje.atacar(); // Llamar al método atacar del personaje
            if (personaje instanceof Curable) ((Curable) personaje).curar(); // Llamar al método curar si el personaje es curable
            if (personaje instanceof Magico) ((Magico) personaje).lanzarHechizo(); // Llamar al método lanzarHechizo si el personaje es mágico
            if (personaje instanceof Defendible) ((Defendible) personaje).defender(); // Llamar al método defender si el personaje es defendible
            if (personaje instanceof Volador) ((Volador) personaje).volar(); // Llamar al método volar si el personaje es volador
            if (personaje instanceof Movilizable) ((Movilizable) personaje).moverse(); // Llamar al método moverse si el personaje es movilizable
        }
    }
    public void ListaPersonajes() { // Método para mostrar la lista de personajes
        for (int i = 0; i < personajes.size(); i++) { // Iterar sobre la lista de personajes
            System.out.println(i + ". " + personajes.get(i)); // Mostrar el índice y la información del personaje
        }
    }
    
    public void EliminarPersonaje(int indice) { // Método para eliminar un personaje de la lista
        if (indice >= 0 && indice < personajes.size()) { // Verificar si el índice es válido
            System.out.println(personajes.get(indice).nombre + " eliminado."); // Mostrar mensaje de eliminación
            personajes.remove(indice); // Eliminar el personaje de la lista
        } else {
            System.out.println("Índice inválido."); // Mostrar mensaje de error si el índice no es válido
        }
    }
    
}