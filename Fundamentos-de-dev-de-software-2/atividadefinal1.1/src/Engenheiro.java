
public class Engenheiro extends Empregado {
        private int qtdadeVistorias;
        private float valorVistoria;
		public Engenheiro(String nome, String setor, 
				 int qtdadeVistorias, float valorVistoria) {
			super(nome, setor);
			this.qtdadeVistorias = qtdadeVistorias;
			this.valorVistoria = valorVistoria;
		}
		public double getPagamento() {
			return (qtdadeVistorias*valorVistoria);
		}
		@Override
		public String toString() {
			return "Engenheiro"+ super.toString()+"[qtdadeVistorias=" + 
		    qtdadeVistorias + ", valorVistoria=" + valorVistoria +
		    "Pagamento="+ getPagamento()+"]";
		}
		public int getQtdadeVistorias() {
			return qtdadeVistorias;
		}
		public void setQtdadeVistorias(int qtdadeVistorias) {
			this.qtdadeVistorias = qtdadeVistorias;
		}
		public float getValorVistoria() {
			return valorVistoria;
		}
		public void setValorVistoria(float valorVistoria) {
			this.valorVistoria = valorVistoria;
		}
		
        
}
