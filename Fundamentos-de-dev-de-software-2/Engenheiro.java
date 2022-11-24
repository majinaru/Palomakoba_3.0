
public class Engenheiro extends Empregado 
	{
	private int qdtVistorias;
	private float valorVistoria;
	
	public Engenheiro(String nome, String setor, int qdtVistorias, float valorVistoria) {
		super(nome, setor);
		this.qdtVistorias = qdtVistorias;
		this.valorVistoria = valorVistoria;

	}

	public int getQdtVistorias() {
		return qdtVistorias;
	}

	public float getValorVistoria() {
		return valorVistoria;
	}

	public void setQdtVistorias(int qdtVistorias) {
		this.qdtVistorias = qdtVistorias;
	}

	public void setValorVistoria(float valorVistoria) {
		this.valorVistoria = valorVistoria;
	}
	public double getPagamento() {
		return(qdtVistorias * valorVistoria);
	}

	@Override
	public String toString() 
		{
		return " \nEngenheiro " + super.toString()+ " \n Nº Vistorias = " + qdtVistorias + ", \nValor Vistoria = " + valorVistoria + " \nTotal = " + getPagamento() + ".";
		}
	
	
	
	}
