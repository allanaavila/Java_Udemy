public class MaiorMenorAltura {

	public static void main(String[] args) {
		
		
		int tamanho = 5;
		
		double[] altura = new double[tamanho];
		char[] sexo = new char[tamanho];
		
		
		altura[0] = 1.70;
		altura[1] = 1.83;
		altura[2] = 1.54;
		altura[3] = 1.61;
		altura[4] = 1.75;
		
		sexo[0] = 'F';
		sexo[1] = 'M';
		sexo[2] = 'M';
		sexo[3] = 'F';
		sexo[4] = 'F';
		
		
		double menorAltura = altura[0];
		double maiorAltura = altura[0];
		
		double somaDasAlturasDasMulheres = 0.0;
		int contMulheres = 0;
		
		int contHomens = 0;
		
		
		
		for(int i = 0; i < tamanho; i++) {
			
			if(altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
		}
		
		System.out.println("Menor Altura: " + menorAltura);
		
		
		for(int i = 0; i < tamanho; i++) {
			
			if(altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}
		}
		
		System.out.println("Maior Altura: " + maiorAltura);

		
		
		for (int i = 0; i < tamanho ; i++) {
			if (sexo[i] == 'F') {
				somaDasAlturasDasMulheres = somaDasAlturasDasMulheres + altura[i];
				contMulheres++;
			}
		}
		
		if (contMulheres == 0) {
			
			System.out.println("Nao ha nenhuma mulher dentre as pessoas");
		}
		else {
			double media = somaDasAlturasDasMulheres / contMulheres;
			System.out.printf("Media das alturas das mulheres = %.2f%n", media);
		}
		
		for (int i = 0; i < tamanho; i++) {
			if (sexo[i] == 'M') {
				contHomens++;
			}
		}
		System.out.println("Numero de homens = " + contHomens);
	}

}
