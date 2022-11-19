
public class ICMS implements Imposto{
	
	@Override
	public double calcula(Orcamento orcamento) {
		System.out.print("Valor do ICMS: ");
		return orcamento.getValor() * 0.10;

	}
}
