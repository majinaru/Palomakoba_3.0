
public abstract class Empregado {
     private String nome;
     private String setor;
     
               public abstract double getPagamento();
     
	 public Empregado(String nome, String setor) {
		super();
		this.nome = nome;
		this.setor = setor;
	 }
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	@Override
	public String toString() {
		return "[nome=" + nome + ", setor=" + setor + "]";
	}    
}
