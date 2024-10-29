package edoo_s8_teoria_Ejercicios;

/**
 *
 * @author LUCANO
 * @param <T>
 */
public class Pila<T> {
    
    private Nodo<T> L;
    
    public Pila(){
        L = null;
    }
    
    public Pila(Nodo <T> L){
        this.L = L;
    }
    
    public Nodo<T> getL(){
        return L;
    } 
    
    public void setL(Nodo<T> L){
        this.L = L;
    }
    
    public void clear(){
        L = null;
    }
    
    public boolean isEmpty(){
        return L==null;
    }
    
    public T top(){
        return L.getInfo();
    }
    
    public T pop(){
        T cima = L.getInfo();
        L = L.getSig();
        return cima;
    }
    
    public void push(T info){
        Nodo<T> nuevo = new Nodo(info);
        nuevo.setSig(L);
        L = nuevo;
    }
    
    
}
