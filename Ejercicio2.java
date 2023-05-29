public class Ejercicio2 {

    // Se probó la función rotarIzquierdaArray
	public static void main(String[]args) {
		int[] A = generarArray(5);
		imprimirArray(A);
		A = rotarIzquierdaArray(A, 2);
		imprimirArray(A);
	}
	
    // Función para rotar un array de acuerdo a un número 
	public static int[] rotarIzquierdaArray(int[] A, int d) {
		int[] Aiz = new int[A.length];
		for(int i=0; i<A.length; i++) {
			Aiz[i] = A[(i+d) % A.length];
		}
		return Aiz;
	}
	
	public static void imprimirArray(int[] A) {
		for(int i=0; i<A.length; i++) 
			System.out.print(A[i] + " ");
		System.out.println("");
	}
	
	public static int[] generarArray(int n) {
		int[] A = new int[n];
		for(int i=0; i<n; i++)
			A[i] = i+1;
		return A;
	}
	
}