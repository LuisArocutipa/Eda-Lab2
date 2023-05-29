public class Ejercicio3 {

    // Se probó la función trianguloRecursivo
	public static void main(String[]args) {
		trianguloRecursivo(8);
	}
	
    // Función recursiva para invertir un triangulo
	public static void trianguloRecursivo(int base) {
		if(base > 1)
			trianguloRecursivo(base - 1);
		for(int i=0; i<base; i++)
			System.out.print("*");
		System.out.println("");
			
	}
	
}