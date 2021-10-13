
public class MaiorNumeroePosicao {

	public static void main(String[] args) {
		
		
		int tamanho = 6;
		
		int[] numero = new int[tamanho];
		
		
		numero[0] = 8;
		numero[1] = 4;
		numero[2] = 10;
		numero[3] = 14;
		numero[4] = 13;
		numero[5] = 7;
		
		
		int maiorNumero = 0;
		int maiorPosicao = 0;
		
		
		
		for(int i = 0; i < tamanho; i++) {
			if(i == 0) {
				maiorNumero = numero[i];
				maiorPosicao = i;
			}
			else {
				if(numero[i] > maiorNumero) {
					maiorNumero = numero[i];
					maiorPosicao = i;
				}
			}
		}
		
		System.out.println("Maior numero: " + maiorNumero);
		System.out.println("Posicao do maior numero: " + maiorPosicao);
	}
}
