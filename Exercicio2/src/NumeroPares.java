
public class NumeroPares {

	public static void main(String[] args) {
		
		int tamanho = 6;
		
		int[] numero = new int[tamanho];
		
		
		numero[0] = 8;
		numero[1] = 2;
		numero[2] = 11;
		numero[3] = 14;
		numero[4] = 13;
		numero[5] = 20;
		
		
		int quantidade = 0;
		
		for(int i = 0; i < tamanho; i++) {
			if(numero[i] % 2 == 0) {
				System.out.println(numero[i]);
				quantidade = quantidade + 1;
			}
		}
		
		System.out.println("Quantidade de numeros pares: " + quantidade);

	}

}
