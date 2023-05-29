// Clase genérica
public class Node<T> {

    // Atributos fundamentales de la clase Node
	private Node<T> nextNode;
	private T data;
	
    // Constructor
	public Node(T data, Node<T> nextNode) {
		this.nextNode = nextNode;
		this.data = data;
	}

    // Setters y Getters
	public Node<T> getNext() {
		return nextNode;
	}

	public void setNext(Node<T> nextNode) {
		this.nextNode = nextNode;
	}

	public T getData() {
		return data;
	}
    
	public void setData(T data) {
		this.data = data;
	}
	
}
