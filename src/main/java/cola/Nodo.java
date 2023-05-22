
package cola;

/**
 * Clase Nodo para lista enlazada
 * @author cbarua
 * @param <E>
 */
public class Nodo<E> {
     E dato;
     Nodo<E> sigte;

    public Nodo() {
    }
    public Nodo(E dat) {
        dato = dat;
    }

    public E getDato() {
        return dato;
    }

    public void setDato(E dato) {
        this.dato = dato;
    }

    public Nodo<E> getSigte() {
        return sigte;
    }

    public void setSigte(Nodo<E> sigte) {
        this.sigte = sigte;
    }
    
    
}
