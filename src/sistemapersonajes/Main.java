package sistemapersonajes;
import java.util.Scanner;
import sistemapersonajes.clases.*;
public class Main {
    public static void main(String[] args) {
        Juego juego = new Juego(); // Crear una instancia de Juego
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner
        // Crear personajes de ejemplo
        juego.AñadirPersonaje(new Guerrero("Fernando", 10, 100, 80, 50, 40));
        juego.AñadirPersonaje(new Mago("Saul", 15, 80, 100, 90));
        juego.AñadirPersonaje(new Arquero("Samuele", 12, 90, 95, 20));
        juego.AñadirPersonaje(new Hechicero("Antonio", 14, 85, 110, 100));
        juego.AñadirPersonaje(new Asesino("Abdul", 13, 70, 85, 95));
        int opcion; // Variable para almacenar la opción del usuario
        do {
            System.out.println("Seleccione una opción:"); // Mostrar menú de opciones
            System.out.println("1. Mostrar acciones"); //
            System.out.println("2. Crear personaje");
            System.out.println("3. Eliminar personaje");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> juego.mostrarAcciones(); // Mostrar acciones de los personajes
                case 2 -> { // Crear un nuevo personaje
                    System.out.println("Escoja su tipo:");
                    System.out.println("1. Guerrero");
                    System.out.println("2. Mago");
                    System.out.println("3. Arquero");
                    System.out.println("4. Hechicero");
                    System.out.println("5. Asesino");
                    int tipo = scanner.nextInt(); // Leer el tipo de personaje
                    scanner.nextLine();
                    System.out.println("Nombre: "); // Leer el nombre del personaje
                    String nombre = scanner.nextLine();
                    System.out.println("Nivel: "); // Leer el nivel del personaje
                    int nivel = scanner.nextInt();
                    System.out.println("Salud: "); // Leer la salud del personaje
                    int salud = scanner.nextInt();
                    switch (tipo) { // Crear el personaje según el tipo seleccionado
                        case 1 -> { // Crear un Guerrero
                            System.out.println("Fuerza: ");
                            int fuerza = scanner.nextInt(); // Leer la fuerza del Guerrero
                            System.out.println("Armadura: ");
                            int armadura = scanner.nextInt(); // Leer la armadura del Guerrero
                            System.out.println("Escudo: ");
                            int escudo = scanner.nextInt(); // Leer el escudo del Guerrero
                            juego.AñadirPersonaje(new Guerrero(nombre, nivel, salud, fuerza, armadura, escudo)); // Crear el Guerrero
                            System.out.println("Guerrero creado: " + nombre + " con nivel " + nivel + ", salud " + salud + ", fuerza " + fuerza + ", armadura " + armadura + ", escudo " + escudo);
                        }
                        case 2 -> { // Crear un Mago
                            System.out.println("Maná: ");
                            int mana = scanner.nextInt(); // Leer el maná del Mago
                            System.out.println("Sabiduria: ");
                            int sabiduria = scanner.nextInt(); // Leer la sabiduría del Mago
                            juego.AñadirPersonaje(new Mago(nombre, nivel, salud, mana, sabiduria)); // Crear el Mago
                            System.out.println("Mago creado: " + nombre + " con nivel " + nivel + ", salud " + salud + ", maná " + mana + ", sabiduría " + sabiduria);
                        }
                        case 3 -> { // Crear un Arquero
                            System.out.println("Agilidad: ");
                            int agilidad = scanner.nextInt(); // Leer la agilidad del Arquero
                            System.out.println("Flechas: ");
                            int flechas = scanner.nextInt(); // Leer las flechas del Arquero
                            juego.AñadirPersonaje(new Arquero(nombre, nivel, salud, agilidad, flechas)); // Crear el Arquero
                            System.out.println("Arquero creado: " + nombre + " con nivel " + nivel + ", salud " + salud + ", agilidad " + agilidad + ", flechas " + flechas);
                        }
                        case 4 -> { // Crear un Hechicero
                            System.out.println("Maná: ");
                            int mana = scanner.nextInt(); // Leer el maná del Hechicero
                            System.out.println("Concentración: ");
                            int concentracion = scanner.nextInt(); // Leer la concentración del Hechicero
                            juego.AñadirPersonaje(new Hechicero(nombre, nivel, salud, mana, concentracion)); // Crear el Hechicero
                            System.out.println("Hechicero creado: " + nombre + " con nivel " + nivel + ", salud " + salud + ", maná " + mana + ", concentración " + concentracion);
                        }
                        case 5 -> { // Crear un Asesino
                            System.out.println("Sigilo: ");
                            int sigilo = scanner.nextInt(); // Leer el sigilo del Asesino
                            System.out.println("Crítico: ");
                            int critico = scanner.nextInt(); // Leer el crítico del Asesino
                            juego.AñadirPersonaje(new Asesino(nombre, nivel, salud, sigilo, critico)); // Crear el Asesino
                            System.out.println("Asesino creado: " + nombre + " con nivel " + nivel + ", salud " + salud + ", sigilo " + sigilo + ", crítico " + critico);
                        }
                        default -> // Si no es un tipo válido muestra un mensaje de error
                        System.out.println("Error. No valido");
                    }
                }
                case 3 -> { // Eliminar un personaje
                    juego.ListaPersonajes(); // Mostrar la lista de personajes
                    System.out.println("Introduce el numero de personaje"); // Pedir al usuario el índice del personaje a eliminar
                    int indice = scanner.nextInt(); // Leer el índice del personaje a eliminar
                    juego.EliminarPersonaje(indice); // Eliminar el personaje de la lista
                }
                case 0 -> // Salir del programa
                System.out.println("Gracias por usarme.");
                default ->  // Si no es una opción válida muestra un mensaje de error
                System.out.println("Opción no válida.");
            }
        } while (opcion != 0); // Repetir hasta que el usuario elija salir
    }
}
