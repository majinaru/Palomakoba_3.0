
public class Diretor extends Empregado{

	private String salarioFixo;

	private String gratificacao;

	public Diretor(String nome, String setor, String salarioFixo, String gratificacao) {
		super(nome, setor);
		this.salarioFixo = salarioFixo;
		this.gratificacao = gratificacao;
	}
	
	
}
