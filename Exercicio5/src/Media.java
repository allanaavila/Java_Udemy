
public class Media {

	public static void main(String[] args) {
		// media dos numeros pares
		
		
		int tamanho = 6;
		
		int[] numero = new int[tamanho];
		
		numero[0] = 8;
		numero[1] = 2;
		numero[2] = 11;
		numero[3] = 14;
		numero[4] = 13;
		numero[5] = 20;
		
		double media = 0.0;
		double soma = 0.0;
		int quantidadeDePares = 0;
		
		for(int i = 0; i < tamanho; i++) {
			
			if(numero[i] % 2 == 0) {
				soma =  soma + numero[i];
				
				quantidadeDePares++;
			}

		}	
		
		if (quantidadeDePares == 0) {
			System.out.println("Nao havia nenhum numero par");
		}
		else {
			media = soma / quantidadeDePares;
			System.out.printf("%.1f%n", media);
		}

	}

}
