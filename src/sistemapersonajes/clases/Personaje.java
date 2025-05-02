package sistemapersonajes.clases;

public abstract class Personaje {
    protected String nombre;
    protected int salud;
    protected int salud; 
    protected int nivel;
    public Personaje(String nombre, int salud, int nivel) {
    public Personaje(String nombre, int salud, int nivel) { // Constructor de la clase Personaje
        this.nombre = nombre;
        this.salud = salud;
        this.nivel = nivel;
    }
    abstract void atacar();
    abstract void atacar(); // Método abstracto que debe ser implementado por las subclases

    public String getNombre() { // Método getter para obtener el nombre del personaje
        return nombre;
    }
    public void setNombre(String nombre) { // Método setter para establecer el nombre del personaje
        this.nombre = nombre;
    }
    public int getSalud() { // Método getter para obtener la salud del personaje
        return salud;
    }
    public void setSalud(int salud) { // Método setter para establecer la salud del personaje
        this.salud = salud;
    }
    public int getNivel() { // Método getter para obtener el nivel del personaje
        return nivel;
    }
    public void setNivel(int nivel) { // Método setter para establecer el nivel del personaje
        this.nivel = nivel;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + salud;
        result = prime * result + nivel;
        return result;
    public int hashCode() { // Método hashCode para generar un código hash único para el personaje
        final int prime = 31; // Número primo utilizado para calcular el hash
        int result = 1; // Inicializa el resultado del hash
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode()); // Calcula el hash del nombre
        result = prime * result + salud; // Calcula el hash de la salud
        result = prime * result + nivel; // Calcula el hash del nivel
        return result; 
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
    public boolean equals(Object obj) { // Método equals para comparar dos objetos Personaje
        if (this == obj) // Verifica si el objeto es el mismo
            return true;
        if (obj == null)
        if (obj == null) // Verifica si el objeto es nulo
            return false;
        if (getClass() != obj.getClass())
        if (getClass() != obj.getClass()) // Verifica si el objeto es de la misma clase
            return false;
        Personaje other = (Personaje) obj;
        Personaje other = (Personaje) obj; // Convierte el objeto a la clase Personaje
        if (nombre == null) {
            if (other.nombre != null)
            if (other.nombre != null) // Compara los nombres de los personajes
                return false;
        } else if (!nombre.equals(other.nombre))
        } else if (!nombre.equals(other.nombre)) // Compara los nombres de los personajes
            return false;
        if (salud != other.salud)
        if (salud != other.salud) // Compara las salud de los personajes
            return false;
        if (nivel != other.nivel)
        if (nivel != other.nivel) // Compara los niveles de los personajes
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Personaje [nombre=" + nombre + ", salud=" + salud + ", nivel=" + nivel + "]";
    public String toString() { // Método toString para representar el objeto como una cadena
        return "Personaje [nombre=" + nombre + ", salud=" + salud + ", nivel=" + nivel + "]"; // Devuelve una cadena con los atributos del personaje
    }
}
