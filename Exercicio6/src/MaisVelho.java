
public class MaisVelho {

	public static void main(String[] args) {
		
		int tamanho = 5;
		
		String[] nome = new String[tamanho];
		int[] idade = new int[tamanho];
		
		
		nome[0] = "Joao";
		nome[1] = "Maria";
		nome[2] = "Teresa";
		nome[3] = "Carlos";
		nome[4] = "Paulo";
		
		idade[0] = 16;
		idade[1] = 21;
		idade[2] = 15;
		idade[3] = 23;
		idade[4] = 17;
		
		
		int maiorIdade = 0;
		int maiorPosicao = 0;
		
		for(int i = 0; i < tamanho; i++) {
			if(idade[i] >= maiorIdade) {
				maiorIdade = idade[i];
				maiorPosicao = i;
			}
		}
		
		System.out.println("Pessoa mais velha: " + nome[maiorPosicao]);
	
	}

}
