
public class VetorABC {

	public static void main(String[] args) {
		// Vetor c recebe vetor A e B
		
		int tamanho = 6;
		
		int[] vetorA = new int[tamanho];
		int[] vetorB = new int[tamanho];
		int[] vetorC = new int[tamanho];
		
		vetorA[0] = 8;
		vetorA[1] = 2;
		vetorA[2] = 11;
		vetorA[3] = 14;
		vetorA[4] = 13;
		vetorA[5] = 20;
		
		vetorB[0] = 5;
		vetorB[1] = 10;
		vetorB[2] = 3;
		vetorB[3] = 1;
		vetorB[4] = 10;
		vetorB[5] = 7;
		
		for(int i = 0; i < tamanho; i++) {
			
			vetorC[i] = vetorA[i] + vetorB[i];
			
			System.out.println(vetorC[i]);
		}
		

	}

}
