
public class Tecnico extends Pessoa {
	String setor;
	String siape;
	public Tecnico(String nome, int anonasc, String setor, String siape) {
		super(nome, anonasc);
		this.setor = setor;
		this.siape = siape;
	}
	public String getSetor() {
		return setor;
	}
	public String getSiape() {
		return siape;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	public void setSiape(String siape) {
		this.siape = siape;
	}
	@Override
	public String toString() {
		return "Tecnico [" + super.toString() + ", " + "  setor=" +  setor + ", siape=" + siape + "]";
	}

	
	/*public String lotaServidor() {
		
	} */
}
