
public class Media {

	public static void main(String[] args) {
		
		int tamanho = 4;
		
		String[] nome = new String[tamanho];
		double[] semestre1 = new double[tamanho];
		double[] semestre2 = new double[tamanho];
		
		
		nome[0] = "Joao";
		nome[1] = "Maria";
		nome[2] = "Carlos";
		nome[3] = "Teresa";
		
		semestre1[0] = 7.0;
		semestre1[1] = 9.2;
		semestre1[2] = 5.0;
		semestre1[3] = 5.5;
		
		semestre2[0] = 8.5;
		semestre2[1] = 6.5;
		semestre2[2] = 6.0;
		semestre2[3] = 6.5;
		
		double media = 0.0;
		
		
		for(int i = 0; i < tamanho; i++) {
			
			media = (semestre1[i] + semestre2[i]) / 2.0;
			
			if(media >= 6.0) {
				System.out.println(nome[i]);
			}
		}
		
		//media = 0;
	}

}
