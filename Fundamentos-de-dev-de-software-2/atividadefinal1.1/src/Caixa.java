
public class Caixa extends Empregado{
	 private float salarioFixo;
	 private float bonus;
	 public Caixa(String nome, String setor, 
			 float salarioFixo, float bonus) {
		super(nome, setor);
		this.salarioFixo = salarioFixo;
		this.bonus = bonus;
	 }
	public float getSalarioFixo() {
		return salarioFixo;
	}
	public void setSalarioFixo(float salarioFixo) {
		this.salarioFixo = salarioFixo;
	}
	public float getBonus() {
		return bonus;
	}
	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
    public double getPagamento() {
    	return (salarioFixo+bonus);
    }
	@Override
	public String toString() {
		return "Caixa"+super.toString()+"[salarioFixo=" + salarioFixo + 
				", bonus=" + bonus + " Pagamento="+getPagamento()+
				"]";
	}
    
}
