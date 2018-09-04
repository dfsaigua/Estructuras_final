package segundo_parcial;

public class NodoABB<T extends Comparable<T>> {
    private T data;
    private T data1;
    private NodoABB<T> izq, der;

    public NodoABB(T data,T data1){
        this.data = data;
        this.data1 = data1;
        izq = null;
        der = null;
    }
    public NodoABB(T data, NodoABB<T>  izq, NodoABB<T>  der){
        this.data = data;
        this.izq = izq;
        this.der = der;
    }

    public T getData(){
        return this.data;
    }
    public NodoABB<T>  getDer(){
        return this.der;
    }
    public NodoABB<T>  getIzq(){
        return this.izq;
    }
    public  void setData(T data){
        this.data =data;
    }
    public  void setDer(NodoABB<T> nodo){
        this.der =nodo;
    }
    public void  setIzq(NodoABB<T> nodo){
        this.izq =nodo;
    }

    public T getData1() {
        return data1;
    }

    public void setData1(T data1) {
        this.data1 = data1;
    }
    
    
    @Override
    public String toString() {
	return this.data.toString();
    }
}