import java.util.Scanner;

public class TesteDeImpostos {

	public static void main(String[] args) {
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		
		 

		  System.out.printf("Informe valor do Orçamento: ");
		  Scanner ler = new Scanner(System.in); 
		  double valor = ler.nextDouble();

		
		Orcamento orcamento = new Orcamento(valor);


		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		
		
		calculador.realizaCalculo(orcamento, iss);
		calculador.realizaCalculo(orcamento, icms);
		
	}
}
