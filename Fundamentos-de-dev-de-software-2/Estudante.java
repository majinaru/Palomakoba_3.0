public class Estudante extends Pessoa{
	private String registro;
	private float media;
	private float nota1,nota2;
	public Estudante(String nome, int anonasc, 
			String registro, float nota1, float nota2) {
		super(nome, anonasc);
		this.registro = registro;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	public String getRegistro() {
		return registro;
	}
	public float getMedia() {
		return media;
	}
	public float getNota1() {
		return nota1;
	}
	public float getNota2() {
		return nota2;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public void setMedia(float media) {
		this.media = media;
	}
	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}
	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}
	@Override
	public String toString() {
		return "Estudante [registro=" + registro + super.toString()+
				", media=" + calculaMedia() + ", nota1=" + 
				nota1 + ", nota2=" + nota2 + "]";
	}
	public float calculaMedia() {
		media = (nota1+nota2)/2;
		return media;
	}
}