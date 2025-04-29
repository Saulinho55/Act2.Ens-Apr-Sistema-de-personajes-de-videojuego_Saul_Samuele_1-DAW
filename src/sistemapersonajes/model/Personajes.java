package sistemapersonajes.model;

class Personaje {
    public String nombre;
    public int nivel;
    public int salud;
    public Personaje(String nombre, int nivel, int salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }
}