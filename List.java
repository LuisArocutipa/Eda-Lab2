// Clase genérica para implementar listas
public class List<T> {

    // Atributo que guarda el nodo inicial y principal de la lista
	private Node<T> root;
	private int size;
	
    // Constructor para inicializar los atributos
	public List() {
		root = null;
		size = 0;
	}
	
    // Función que devuelve el nodo raíz
	public Node<T> getRoot() {
		return root;
	}
	
    // Función que devuelve si la lista esta vacío
	public boolean isEmpty() {
		return root == null;
	}
	
    // Función que devuelve el número de elementos de la lista
	public int size() {
		return size;
	}

    // Funciones para agregar elementos a la lista
	public void add(T data) {
		if(isEmpty()) { 
			root = new Node<T>(data, null);
			size++;
		}
		else {
			Node<T> aux = root;
			while(aux.getNext() != null)
				aux = aux.getNext();
			aux.setNext(new Node<T>(data, null));
			size++;
		}
	}
	
	public void add(int i, T data) {
		if(i==0) {
			Node<T> aux = root;
			root = new Node<T>(data, aux);
			size++;
		}
		else if(i<=size && i>0) {
			Node<T> aux = root;
			i--;
			while(i!=0) {
				aux = aux.getNext();
				i--;
			}
			aux.setNext(new Node<T>(data, aux.getNext()));
			size++;
		} else
			System.out.println("No se puede agregar un elemento en esa posición");
	}
	
    // Función para vaciar una lista
	public void clear() {
		root = null;
	}
	
    // Función que devuelve si el nodo contiene un elemento ingresado
	public boolean contains(T object) {
		Node<T> aux = root;
		while(aux.getNext() != null) {
			if(aux.getData().equals(object))
				return true;
			aux = aux.getNext();
		}
		if(aux.getData().equals(object))
			return true;
		return false;
	}
	
    // Función que compara dos listas
	public boolean equals(List<T> lista) {
		Node<T> aux = root;
		Node<T> aux2 = lista.getRoot();
		while(aux.getData().equals(aux2.getData()) && aux.getNext()!=null && aux2.getNext()!=null) {
			aux = aux.getNext();
			aux2 = aux2.getNext();
		}
		if(aux.getData().equals(aux2.getData()))
			return true;
	return false;
	}
	
    // Función que devuelve un elemento de la lista
	public T get(int i) {
		if(i>=0 && i<size) {
			Node<T> aux = root;
			while(i>0) {
				aux = aux.getNext();
				i--;
			}
			return aux.getData();
		} else 
			return null;
	}
	
    // Función que devuelve el indice del primer elemento que coincida con el objeto ingresado
	public int indexOf(T object) {
		int i = 0;
		Node<T> aux = root;
		while(aux.getNext() != null) {
			if(aux.getData().equals(object))
				return i;
			aux = aux.getNext();
			i++;
		}
		if(aux.getData().equals(object))
			return i;
		return -1;
	}
	
    // Función que devuelve el indice del último elemento que coincida con el objeto ingresado
	public int lastIndexOf(T object) {
		int i = -1;
		Node<T> aux = root;
		for(int j=0; j<size; j++) {
			if(aux.getData().equals(object)) 
				i = j;
			aux = aux.getNext();
		}
		return i;
	}
	
    // Función que elimina el elemento que se encuentre en la posición ingresada
	public T remove(int i) {
		if(i==0) {
			T data = root.getData();
			root = root.getNext();
			size--;
			return data;
		}
		else if(i<size && i>0) {
			Node<T> aux = root;
			i--;
			while(i!=0) {
				aux = aux.getNext();
				i--;
			}
			T data = aux.getNext().getData();
			aux.setNext(aux.getNext().getNext());
			size--;
			return data;
		} else
			return null;
	}
	
    // Función que elimina el primer elemento que coincida con el objeto ingresado
	public boolean remove(T object) {
		Node<T> aux = root;
		if(aux.getData().equals(object)) {
			root = aux.getNext();
			size--;
			return true;
		} else {
			while(aux.getNext()!=null) {
				if(aux.getNext().getData().equals(object)) {
					aux.setNext(aux.getNext().getNext());
					size--;
					return true;
				}
				aux = aux.getNext();
			}
			return false;
		}
	}
	
    // Función que reemplaza un elemento de la lista en una posición especifica
	public T set(int i, T object) {
		if(i>=0 && i<size) {
			Node<T> aux = root;
			while(i>0) {
				aux = aux.getNext();
				i--;
			}
			T data = aux.getData();
			aux.setData(object);
			return data;
		} else 
			return null;
	}
	
    // Función que devuelve una nueva lista de acuerdo al rango ingresado
	public List<T> subList(int from, int to){
		List<T> sub = new List<T>();
		if(from<to && from>=0 && to<size) {
			Node<T> aux = root;
			while(from>0) {
				aux = aux.getNext();
				from--;
				to--;
			}
			while(to>0) {
				sub.add(aux.getData());
				aux = aux.getNext();
				to--;
			}
			sub.add(aux.getData());
			aux = aux.getNext();
			return sub;
		}
		return sub;
	}
	
    // Función adicional para imprimir una lista
	public void print() {
		if(isEmpty()) {
			System.out.println("La lista esta vacia");
		} else {
			Node<T> aux = root;
			for(int i=0; i<size; i++) {
				System.out.print(aux.getData() + " ");
				aux = aux.getNext();
			}
			System.out.println("");
		}
	}
	
}