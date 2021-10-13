
public class Juros {

	public static void main(String[] args) {
		

		int tamanho = 4;
		
		String[] produto = new String[tamanho];
		double[] compra = new double[tamanho];
		double[] venda = new double[tamanho];
		
		
		produto[0] = "Feijao";
		produto[1] = "Arroz";
		produto[2] = "Oleo";
		produto[3] = "Sal";
		
		
		compra[0] = 10.0;
		compra[1] = 12.0;
		compra[2] = 5.0;
		compra[3] = 3.0;
		
		venda[0] = 11.0;
		venda[1] = 12.80;
		venda[2] = 5.70;
		venda[3] = 4.0;
		
		int contAbaixoDe10 = 0;
		int contEntre10E20 = 0;
		int contAcimaDe20 = 0;
		
		double totalCompra = 0.0;
		double totalVenda = 0.0;
		
		
		for (int i = 0; i < tamanho; i++) {
			
			double lucro = venda[i] - compra[i];

			double porcentagemDeLucro = lucro / compra[i] * 100.0;
			
				if (porcentagemDeLucro < 10.0) {
						contAbaixoDe10++;
				}
				else 
					if (porcentagemDeLucro <= 20.0) {
							contEntre10E20++;
					}
					else {
						contAcimaDe20++;
					}
		}
		
		System.out.println("Lucro abaixo de 10%: " + contAbaixoDe10);
		System.out.println("Lucro entre 10% e 20%: " + contEntre10E20);
		System.out.println("Lucro acima de 20%: " + contAcimaDe20);

		
		
		for (int i = 0; i < tamanho; i++) {
			
			totalCompra = totalCompra + compra[i];
			totalVenda = totalVenda + venda[i];
		}
		
		double totalLucro = totalVenda - totalCompra;
		
		System.out.printf("Valor total de compra: %.2f%n", totalCompra);
		System.out.printf("Valor total de venda: %.2f%n", totalVenda);
		System.out.printf("Lucro total: %.2f%n", totalLucro);
	}
	

}
