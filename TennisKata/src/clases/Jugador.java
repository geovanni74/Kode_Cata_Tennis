package clases;


public class Jugador {
    private String nombre;
    private int puntaje=0;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public Jugador(String nombre) {
      this.nombre=nombre;
    }
    
}
