public class Ejercicio4 {
	
    // Clase para implementar listas y probar las funciones
	public static void main(String[]args) {
		
		List<Integer> lista = new List<Integer>();
		lista.add(4);
		lista.add(6);
		lista.add(9);
		lista.print();
		lista.add(3, 7);
		lista.print();
		if(lista.contains(2))
			System.out.println("La lista contiene al elemento");
		else
			System.out.println("La lista no contiene al elemento");
		
		List<Integer> lista2 = new List<Integer>();
		lista2.add(4);
		lista2.add(6);
		lista2.add(2);
		lista2.add(7);
		if(lista.equals(lista2))
			System.out.println("Las listas son iguales");
		else 
			System.out.println("Las listas no son iguales");
		lista2.print();
		lista2.add(6);
		System.out.println("La posicion del primer elemento 6 es: " + lista2.indexOf(6));
		System.out.println("El elemento que esta en la posicion 3: " + lista2.get(3));
		lista2.add(6);
		lista2.add(4);
		lista2.add(3);
		lista2.print();
		System.out.println("La posicion del ultimo elemento 6 es: " + lista2.lastIndexOf(6));
		System.out.println("Se elimino: " + lista2.remove(5));
		lista2.print();
		
		List<String> lista3 = new List<String>();
		lista3.add("uno");
		lista3.add("dos");
		lista3.add("tres");
		lista3.add("cuatro");
		lista3.add(0, "cero");
		lista3.print();
		if(lista3.remove("tres"))
			System.out.println("Se elimino el elemento");
		else
			System.out.println("No se elimino el elemento");
		lista3.print();
		System.out.println("Se reemplazo " +lista3.set(2, "cinco") + " por cinco");
		lista3.print();
		System.out.println("Numero de elementos de la lista: " + lista3.size());
		List<String> lista4 = lista3.subList(1, 2);
		lista4.print();
		
	}

}