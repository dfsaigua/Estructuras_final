package segundo_parcial;

import java.util.*;

public class ABB <T extends Comparable<T>>{
    private NodoABB<T> raiz;
            
    public ABB(){
        raiz = null;
    }
    public ABB(NodoABB<T> raiz){
        this.raiz = raiz;
    }
    
    public NodoABB<T>  getRaiz(){
        return this.raiz;
    }
    public void  setRaiz(NodoABB<T> nodo){
        this.raiz =nodo;
    }
    public NodoABB<T> buscar(T data){
        return buscar(raiz, data);
    }
    public NodoABB<T> insertar(T data,T data1){
        raiz = insertar(raiz, data,data1);
        return raiz;
    }
    public int izquierdos (){
        return izquierdos(this.raiz);
    }
    public ABB<T> espejo (){
        ABB<T> arbol = new ABB();
        arbol.raiz = espejo(this.raiz);
        return arbol;
    }

    
            
    
    
    public String preOrder(){
        if (raiz == null) return "";
        return preOrder(raiz).replaceAll("( )+", " ").substring(1);
    }
    public String inOrder(){
        if (raiz == null) return "";
        return inOrder(raiz).replaceAll("( )+", " ").substring(1);
    }
    public String posOrder(){
        if (raiz == null) return "";
        return posOrder(raiz).replaceAll("( )+", " ").substring(1);  
    }
    public String anchura(){
        if (raiz == null) return "";
        return anchura(raiz).replaceAll("( )+", " ").substring(1); 
    }
 
    private NodoABB<T> buscar(NodoABB<T> nodo, T data){
	if(nodo == null) return null;
	if(data.compareTo(nodo.getData()) == 0) 
		return nodo;
	if(data.compareTo(nodo.getData()) > 0)
		return buscar(nodo.getDer(), data);
	else
		return buscar(nodo.getIzq(), data);
    }
    
    private NodoABB<T> insertar(NodoABB<T> nodo, T nuevo,T nuevo1){
	if(nodo == null) 
		return new NodoABB(nuevo,nuevo1);
	if (nuevo.compareTo(nodo.getData())== 0) 
		return nodo;
	else if (nuevo.compareTo(nodo.getData()) > 0) 
		nodo.setDer(insertar(nodo.getDer(), nuevo,nuevo1));
	else 
		nodo.setIzq(insertar(nodo.getIzq(), nuevo,nuevo1));
	return nodo;
    }
    
    private String preOrder(NodoABB<T> nodo){
        if(nodo == null) return "";
        return " " + nodo.toString() + " " + preOrder(nodo.getIzq()) +" "+ preOrder(nodo.getDer());
    }
    private String inOrder(NodoABB<T> nodo){
        if(nodo == null) return "";
        return " " + inOrder(nodo.getIzq()) +" "+ nodo.toString() + " " +  inOrder(nodo.getDer());
    }
    private String posOrder(NodoABB<T> nodo){
        if(nodo == null) return "";
        return " " + posOrder(nodo.getIzq()) +" "+ posOrder(nodo.getDer())+ " " +nodo.toString() ;
    }
    private String anchura(NodoABB<T> nodo){
        Queue <NodoABB<T> > cola = new LinkedList();
        String retorno = "";
        cola.add(nodo);
        while(cola.peek()!= null){
            nodo=cola.poll();
            if (nodo.getIzq() != null) cola.add(nodo.getIzq());
            if (nodo.getDer() != null) cola.add(nodo.getDer());
            retorno+= "; " + nodo.getData1().toString();
        }
        return retorno;
    }
    private int izquierdos (NodoABB<T> nodo ){
        if (nodo == null) return 0;
        int total = 0;
        if (nodo.getIzq() != null) total= 1+ izquierdos(nodo.getIzq());
        if (nodo.getDer() != null) total+= izquierdos(nodo.getDer());
        return total;
    }
    private NodoABB<T> espejo (NodoABB<T> nodo ) {
        if (nodo == null) return null;
        NodoABB<T> temp;
        temp = nodo.getIzq();
        nodo.setIzq(espejo(nodo.getDer()));
        nodo.setDer(espejo(temp));
        return nodo;
    }
    
}