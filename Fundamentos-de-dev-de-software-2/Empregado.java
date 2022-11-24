
public abstract class Empregado {
	private String nome;
	private String setor;
	public abstract double getPagamento(); // nao tem codigo
	
	public Empregado(String nome, String setor) {
		super();
		this.nome = nome;
		this.setor = setor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getSetor() {
		return setor;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	@Override
	public String toString() {
		return "Nome = " + nome + ", \nSetor = " + setor + ", ";
	}
	
}
