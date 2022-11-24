
public class Caixa extends Empregado{
	private float salFixo;
	private float bonus;
	public Caixa(String nome, String setor,
			float salFixo, float bonus) {
		super(nome,setor);
		this.salFixo= salFixo;
		this.bonus= bonus;
	}
	
	public float getSalarioFixo() {
		return salFixo;
	}
	
	public float getBonus() {
		return bonus;
	}
	
	public void setSalarioFixo(float salarioFixo) {
		this.salFixo = salarioFixo;
	}
	
	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	public double getPagamento() {
		return (salFixo+bonus);
	}

	@Override
	public String toString() {
		return "Caixa"+ super.toString()+ "[salarioFixo=" + salFixo + 
				", bonus=" + bonus + "Pagamento="+getPagamento()+
				"]";
	}
	
}