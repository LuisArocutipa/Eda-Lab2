public class Ejercicio1 {
	
	// Se probó la función invertirArray
	public static void main(String[]args) {
		int[] A = generarArray(8);
		imprimirArray(A);
		A = invertirArray(A);
		imprimirArray(A);
	}
	
	// Función que invierte un array
	public static int[] invertirArray(int[] A) {
		int[] Ain = new int[A.length];
		for(int i=0; i<A.length; i++) 
			Ain[A.length-1-i] = A[i];
		return Ain;
	}
	
	// Función adicional para imprimir un array
	public static void imprimirArray(int[] A) {
		for(int i=0; i<A.length; i++) 
			System.out.print(A[i] + " ");
		System.out.println("");
	}
	
	// Función utilizada para crear casos de prueba
	public static int[] generarArray(int n) {
		int[] A = new int[n];
		for(int i=0; i<n; i++)
			A[i] = i+1;
		return A;
	}

}