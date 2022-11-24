import java.util.Calendar;
public class Pessoa {
	private String nome;
	private int anonasc;

	public Pessoa(String nome, int anonasc) {
		super();
		this.nome = nome;
		this.anonasc = anonasc;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade= " + calculaIdade()+"]";
	}

	public String getNome() {
		return nome;
	}

	public int getAnonasc() { // get = busca informação
		return anonasc;
	}

	public void setNome(String nome) { // set= muda/insere informação
		this.nome = nome;
	}

	public void setAnonasc(int anonasc) {
		this.anonasc = anonasc;
	}
	
	public int calculaIdade() {
		int idade;
		int anoatual= Calendar.getInstance().get(Calendar.YEAR);
		idade = anoatual - anonasc;
		return idade;
	}
}
