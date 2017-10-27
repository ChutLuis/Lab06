package laboratorio.pkg5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author t203
 */
public class Nodo {
    
	private int v;
	private Nodo siguiente;//
	
	
	
	public Nodo(int v, Nodo siguiente) {
		super();
		this.v = v;
		this.siguiente = siguiente;
	}
	public int getV() {
		return v;
	}
	public void setV(int v) {
		this.v = v;
	}
	public Nodo getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	@Override
	public String toString() {
		return "Nodo [v=" + v + ", siguiente=" + siguiente + "]";
}
}
