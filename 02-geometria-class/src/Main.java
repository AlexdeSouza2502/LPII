
public class Main {

	public static void main(String[] args) {

		// Teste da classe Quadrado
		Quadrado primeiroQuadrado = new Quadrado();
		primeiroQuadrado.setLado(12);
		
		double areaPrimeiroQuadrado = primeiroQuadrado.calculaArea();
		System.out.println("Area quadrado: " + areaPrimeiroQuadrado);
		
		System.out.println("Desenho quadrado: ");
		primeiroQuadrado.desenhar();
	}
}
