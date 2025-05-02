package sistemapersonajes;
import java.util.Scanner;
import sistemapersonajes.clases.*;
public class Main {
    public static void main(String[] args) {
        Juego juego = new Juego();
        Scanner scanner = new Scanner(System.in);
        juego.AñadirPersonaje(new Guerrero("Fernando", 10, 100, 80, 50, 40));
        juego.AñadirPersonaje(new Mago("Saul", 15, 80, 100, 90));
        juego.AñadirPersonaje(new Arquero("Samuele", 12, 90, 95, 20));
        juego.AñadirPersonaje(new Hechicero("Antonio", 14, 85, 110, 100));
        juego.AñadirPersonaje(new Asesino("Abdul", 13, 70, 85, 95));
        int opcion;
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Mostrar acciones");
            System.out.println("2. Crear personaje");
            System.out.println("3. Eliminar personaje");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1 -> juego.mostrarAcciones();
                case 2 -> {
                    System.out.println("Escoja su tipo:");
                    System.out.println("1. Guerrero");
                    System.out.println("2. Mago");
                    System.out.println("3. Arquero");
                    System.out.println("4. Hechicero");
                    System.out.println("5. Asesino");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Nivel: ");
                    int nivel = scanner.nextInt();
                    System.out.println("Salud: ");
                    int salud = scanner.nextInt();
                    switch (tipo) {
                        case 1 -> {
                            System.out.println("Fuerza: ");
                            int fuerza = scanner.nextInt();
                            System.out.println("Armadura: ");
                            int armadura = scanner.nextInt();
                            System.out.println("Escudo: ");
                            int escudo = scanner.nextInt();
                            juego.AñadirPersonaje(new Guerrero(nombre, nivel, salud, fuerza, armadura, escudo));
                        }
                        case 2 -> {
                            System.out.print("Maná: ");
                            int mana = scanner.nextInt();
                            System.out.print("Sabiduria: ");
                            int sabiduria = scanner.nextInt();
                            juego.AñadirPersonaje(new Mago(nombre, nivel, salud, mana, sabiduria));
                        }
                        case 3 -> {
                            System.out.print("Agilidad: ");
                            int agilidad = scanner.nextInt();
                            System.out.print("Flechas: ");
                            int flechas = scanner.nextInt();
                            juego.AñadirPersonaje(new Arquero(nombre, nivel, salud, agilidad, flechas));
                        }
                        case 4 -> {
                            System.out.print("Maná: ");
                            int mana = scanner.nextInt();
                            System.out.print("Concentración: ");
                            int concentracion = scanner.nextInt();
                            juego.AñadirPersonaje(new Hechicero(nombre, nivel, salud, mana, concentracion));
                        }
                        case 5 -> {
                            System.out.print("Sigilo: ");
                            int sigilo = scanner.nextInt();
                            System.out.print("Crítico: ");
                            int critico = scanner.nextInt();
                            juego.AñadirPersonaje(new Asesino(nombre, nivel, salud, sigilo, critico));
                        }
                        default ->
                        System.out.println("Error. No valido");
                    }
                }
                case 3 -> {
                    juego.ListaPersonajes();
                    System.out.println("Introduce el numero de personaje");
                    int indice = scanner.nextInt();
                    juego.EliminarPersonaje(indice);
                }
                case 0 -> 
                System.out.println("Gracias por usarme.");
                default -> 
                System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }
}
