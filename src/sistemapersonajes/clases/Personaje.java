package sistemapersonajes.clases;

public abstract class Personaje {
    protected String nombre;
    protected int salud;
    protected int nivel;
    public Personaje(String nombre, int salud, int nivel) {
        this.nombre = nombre;
        this.salud = salud;
        this.nivel = nivel;
    }
    abstract void atacar();

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getSalud() {
        return salud;
    }
    public void setSalud(int salud) {
        this.salud = salud;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
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
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Personaje other = (Personaje) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (salud != other.salud)
            return false;
        if (nivel != other.nivel)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Personaje [nombre=" + nombre + ", salud=" + salud + ", nivel=" + nivel + "]";
    }
}
