/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import pila.Base;
import pila.Pila;

/**
 *
 * @author maria_a.vasquez
 */
public class OperacionesPila {
    
    public static <T extends Base> Pila<T> duplicarPila (Pila<T> pilaO){
       
        Pila<T> pilaDuplicada =new Pila<>();
        Pila<T> pilaAux =new Pila<>();
        
        while (!pilaO.estaVacia()){
            T elemento=pilaO.desapilar();
            pilaAux.apilar(elemento);
        }
        while (!pilaAux.estaVacia()){
            T elemento=pilaAux.desapilar();
            T elementoCopiado=(T)elemento.copy();
            
            pilaO.apilar(elemento);
            pilaDuplicada.apilar(elementoCopiado);
        }
        return pilaDuplicada;
        
        
    }
    public static <T extends Base> Pila<T> pilaInvertida(Pila<T> pilaO){
        Pila<T> pilaDuplicada = duplicarPila(pilaO);
        Pila<T> pilaInvertida =new Pila<>();
        
        while (!pilaDuplicada.estaVacia()){
            pilaInvertida.apilar(pilaDuplicada.desapilar());
        }
        return pilaDuplicada;
        
        
    } 
    public static <T extends Base> Pila<T> pilaProductos(Pila<T> pilaO){
        Pila<T> pilaDuplicada = duplicarPila(pilaO);
        Pila<T> pilaProductos =new Pila<>();
        while (!pilaDuplicada.estaVacia()){
            
           T producto =pilaDuplicada.desapilar();
           Producto p=(Producto)producto;
           String nombreP=p.getNombre();
           if (nombreP.charAt(0)=='A'|| nombreP.charAt(0)== 'a'){
               pilaProductos.apilar(producto);
           }
            
        }
        return pilaProductos;
    }
    
}
