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
            System.out.println(personaje);
            personaje.atacar(); // Llama al método atacar() de la clase base
            // Verifica si el personaje implementa interfaces específicas
            if (personaje instanceof Curable) ((Curable) personaje).curar();
            if (personaje instanceof Magico) ((Magico) personaje).lanzarHechizo();
            if (personaje instanceof Defendible) ((Defendible) personaje).defender();
            if (personaje instanceof Volador) ((Volador) personaje).volar();
            if (personaje instanceof Movilizable) ((Movilizable) personaje).moverse();

            // Verifica si el personaje es un Arquero y llama a sus métodos específicos
            if (personaje instanceof Arquero) {
                Arquero arquero = (Arquero) personaje;
                arquero.dispararFlecha();
                arquero.reabastecerFlechas();
            }

            // Verifica si el personaje es un Mago y llama a sus métodos específicos
            if (personaje instanceof Mago) {
                Mago mago = (Mago) personaje; // Ejemplo de método específico
                mago.regenerarMana();
            }

            // Verifica si el personaje es un Hechicero y llama a sus métodos específicos
            if (personaje instanceof Hechicero) {
                Hechicero hechicero = (Hechicero) personaje;
                hechicero.invocarEntidad(); 
            }

            // Verifica si el personaje es un Asesino y llama a sus métodos específicos
            if (personaje instanceof Asesino) {
                Asesino asesino = (Asesino) personaje;
                asesino.ocultar();
                asesino.atacarPorLaEspalda();
            }
        }
    }

    public void ListaPersonajes() {
        for (int i = 0; i < personajes.size(); i++) {
            System.out.println(i + ". " + personajes.get(i));
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