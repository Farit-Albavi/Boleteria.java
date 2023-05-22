package cola;

import excepciones.ColaVaciaException;

public class Cola<T> implements InterfaceCola<T> {

    private Nodo<T> frente, ultimo;
    private int longitud;

    public Cola() {
        //sin cabecera, frente=ultimo=null; longitud = 0;
    }

    @Override
    public void encolar(T dato) {
        Nodo<T> aux = new Nodo<>(dato);
        if (frente == null) {  //esta vacia
            frente = ultimo = aux;
        } else {
            ultimo.setSigte(aux);
            ultimo = aux;
        }
        longitud++;
    }

    @Override
    public T descolar() throws ColaVaciaException {
        if (isEmpty()) {
            throw new ColaVaciaException();
        }
        T dato = frente.getDato();
        frente = frente.getSigte();
        longitud--;
        if (longitud == 0) {
            ultimo = null;
        }
        return dato;
    }

    @Override
    public T consultar() throws ColaVaciaException {
        if (isEmpty()) {
            throw new ColaVaciaException();
        }
        return frente.getDato();
    }

    @Override
    public int buscar(T dato) {
        Nodo<T> aux = frente;
        for (int i = 1; i <= longitud; i++) {
            if (dato.toString().equals(aux.getDato().toString())) {
                return i;  //encontre 
            }
            aux = aux.getSigte();
        }
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return longitud == 0;
    }

    @Override
    public void iniciar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int size() {
        return longitud;
    }

    @Override
    public Object[] toArray() {
        Object[] arreglo = new Object[longitud];
        Nodo<T> aux = frente;
        for (int i = 0; i < longitud; i++) {
            arreglo[i] = aux.getDato();
            aux = aux.getSigte();
        }
        return arreglo;
    }

}
