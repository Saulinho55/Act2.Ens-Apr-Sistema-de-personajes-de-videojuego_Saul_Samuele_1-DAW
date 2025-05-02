package sistemapersonajes.clases;

import sistemapersonajes.clases.Batalla;
import sistemapersonajes.interfaces.Defendible;
import sistemapersonajes.interfaces.Magico;
import sistemapersonajes.subclases.PersonajesHabilidadesMagicas;

public class Batalla {
    private Personaje jugador1;
    private Personaje jugador2;

    public Batalla(String nombre, int salud, int nivel, Personaje jugador1, Personaje jugador2) {
        super();
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public Personaje getJugador1() {
        return jugador1;
    }

    public void setJugador1(Personaje jugador1) {
        this.jugador1 = jugador1;
    }

    public Personaje getJugador2() {
        return jugador2;
    }

    public void setJugador2(Personaje jugador2) {
        this.jugador2 = jugador2;
    }

    void atacar() {
        System.out.println();
    }

    public void iniciar() {
        System.out.println("🗡️ ¡Comienza la batalla entre " + jugador1.getNombre() + " y " + jugador2.getNombre() + "!");

        int turno = 1;
        while (jugador1.getSalud() > 0 && jugador2.getSalud() > 0) {
            System.out.println("\n🔁 Turno " + turno);

            turnoDe(jugador1, jugador2);
            if (jugador2.getSalud() <= 0) break;

            turnoDe(jugador2, jugador1);
            turno++;
        }

        mostrarGanador();
    }

    private void turnoDe(Personaje atacante, Personaje defensor) {
        System.out.println("➡️ " + atacante.getNombre() + " ataca a " + defensor.getNombre());
        atacante.atacar();

        int daño = 10 + atacante.getNivel();

        // Si el atacante es mágico, debe gastar mana
        if (atacante instanceof Magico) {
            Magico magico = (Magico) atacante;
            int manaDisponible = ((Mago) atacante).getMana(); // o Hechicero

            if (manaDisponible >= 20) {
                magico.lanzarHechizo();
                ((Mago) atacante).setMana(manaDisponible - 20);
                daño += 10; // daño adicional por magia
            } else {
                System.out.println("⚠️ " + atacante.getNombre() + " no tiene suficiente mana. El hechizo falla.");
                daño /= 2; // daño reducido por ataque débil
            }
        }

        if (defensor instanceof Defendible) {
            System.out.println(defensor.getNombre() + " intenta defenderse...");
            ((Defendible) defensor).defender();
            daño /= 2;
        }

        defensor.setSalud(defensor.getSalud() - daño);
        if (defensor.getSalud() < 0) defensor.setSalud(0);

        System.out.println(defensor.getNombre() + " pierde " + daño + " de salud. Salud restante: " + defensor.getSalud());
    }

    private void mostrarGanador() {
        if (jugador1.getSalud() <= 0 && jugador2.getSalud() <= 0) {
            System.out.println("🤝 ¡Empate! Ambos han caído.");
        } else if (jugador1.getSalud() <= 0) {
            System.out.println("🏆 " + jugador2.getNombre() + " gana la batalla.");
        } else {
            System.out.println("🏆 " + jugador1.getNombre() + " gana la batalla.");
        }
    }
}


