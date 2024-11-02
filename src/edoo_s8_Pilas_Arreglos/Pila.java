package edoo_s8_Pilas_Arreglos;

import javax.swing.DefaultListModel;

/**
 *
 * @author LUCANO
 * @param <T>
 */
public class Pila<T> {
    
    private T v[];
    private int totalElementos;
    
    public Pila(){
        v = (T[]) new Object[50];
        totalElementos = 0;
    }
    
    public Pila(int limite){
        v = (T[]) new Object[limite];
        totalElementos = 0;
    }
    
    public void clear(){
        totalElementos = 0;
    }
    
    public boolean isEmpty(){
        return totalElementos == 0;
    }
    
    public T top(){
        return v[totalElementos-1];
    }
    
    public T pop(){
        T cima = v[totalElementos-1];
        totalElementos--;
        return cima;
    }
    
    public boolean push(T valor){
        if(totalElementos < v.length){
            v[totalElementos] = valor;
            totalElementos++;
            return true;
        }
        return false;
    }
    
    public void mostrar(DefaultListModel modelo){
        int i;
        modelo.removeAllElements();
        for(i=totalElementos-1;i>=0;i--)
            modelo.addElement(v[i]);
    }
    
    
}