/* Faça um programa, com uma função que necessite de um argumento. A função retorna o valor de caractere ‘P’, se seu argumento for positivo, e ‘N’, se seu argumento for zero ou negativo.
*/
import java.util.Scanner;

class App {
	private static int numero;

	public void print(int numero) {
		String letter;
		if (numero > 0) {
			letter = "P"; 
		} else {
			letter = "N";
		}
		System.out.println(letter);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		App e = new App();
		
		System.out.print("Digite o Número: ");
		numero = scan.nextInt();
		
		e.print(numero);
	}
}