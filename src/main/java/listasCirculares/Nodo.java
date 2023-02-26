package listasCirculares;

/**
 *
 * @author R
 */
public class Nodo {
    private Nodo siguiente;
    private double dato;

    public Nodo(Nodo siguiente, double dato) {
        this.siguiente = siguiente;
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public double getDato() {
        return dato;
    }

    public void setDato(double dato) {
        this.dato = dato;
    }
    
    
    
}
