
public class Media {

	public static void main(String[] args) {
		// media e nota a baixo da media
		
		
		int tamanho = 4;
		
		double[] numero = new double[tamanho];
		
		
		numero[0] = 10.0;
		numero[1] = 15.5;
		numero[2] = 13.2;
		numero[3] = 9.8;
		
		double media = 0.0;
		double soma = 0.0;
		
		for(int i = 0; i < tamanho; i++) {
			
			soma = soma + numero[i];
		}
		
		media = soma/tamanho;
		System.out.println("Media: " + media);
		
		
		for(int i = 0; i < tamanho; i++) {
			
			if(numero[i] < media) {
				System.out.println("Abaixo da Media: " + numero[i]);
			}
		}
	}

}
