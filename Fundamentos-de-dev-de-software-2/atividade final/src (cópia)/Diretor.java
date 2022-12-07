public abstract class Diretor extends Empregado{

    private float salarioFixo;
    private float gratificacoes;

    public Diretor(String nome, String setor,
                     float salariofixo, float gratificacoes){
        super(nome, setor);
        this.salarioFixo= salariofixo;
        this.gratificacoes= gratificacoes;
    }

    public float getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(float salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public float getGratificacoes() {
        return gratificacoes;
    }

    public void setGratificacoes(float gratificacoes) {
        this.gratificacoes = gratificacoes;
    }
    public double getPagamento(){ return (salarioFixo+gratificacoes);}

    @Override
    public String toString() {
        return"Diretor " + super.toString()+ "[Salario fixo= " +
                salarioFixo + ", gratificacoes= " + gratificacoes + "Pagamento= "
                + getPagamento() + "]";
    }
}
