
public class ISS implements Imposto{

	@Override
	public double calcula(Orcamento orcamento) {
		System.out.print("Valor do ISS:  ");
		return orcamento.getValor() * 0.06;
	}
}
