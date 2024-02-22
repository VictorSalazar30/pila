
package pila;

import java.util.LinkedList;

/**
 *
 * @author maria_a.vasquez
 * @param <T>

 */

public class Pila <T extends Base>{
    
    private LinkedList<T> tope;

    public Pila() {
        tope = new LinkedList<>();
    }
    
    public void apilar (T elemento){
        tope.addFirst(elemento);
    }
    
    public T desapilar (){
        return tope.removeFirst();
    }
    
    public boolean estaVacia (){
        return tope.isEmpty();
    }

    @Override
    public String toString() {
        String card="[";
        for (T e: tope){
            card+= " " +e.toString();
        }
        return card+"]";
    }
    
    
    
    
    
    
    
}
