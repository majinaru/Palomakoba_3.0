import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Principal {
	public static void main(String[] args) {
		ArrayList <Empregado> lista = new ArrayList <Empregado>();
		int opte='0';
		String opcao,nome,setor,txtvistoria,txtvalor;
		String txtsalario, txtbonus;
		while (opte!='7'){
			opcao= JOptionPane.showInputDialog(null,
			   "\n1 - Insere um Engenheiro"+
		       "\n2 - Insere um Diretor"+
			   "\n3 - Insere um Caixa"+
			   "\n4 - Exibe todos os empregados"+
			   "\n5 - Exibe somente os Engenheiros"+
			   "\n6 - Exibe somente os Caixas"+
			   "\n7 - Sair");
			opte=opcao.charAt(0);
			switch(opte){
			case '1':nome = JOptionPane.showInputDialog(null,"Nome?");
			         setor = JOptionPane.showInputDialog(null,"Setor?");
			         txtvistoria=JOptionPane.showInputDialog(null,"Qtde Vistoria?");
			         int vistoria = Integer.parseInt(txtvistoria);
			         txtvalor=JOptionPane.showInputDialog(null,"Valor da Vistoria?");
			         float valor = Float.parseFloat(txtvalor);
			         Engenheiro e = new Engenheiro(nome,setor,vistoria,valor);
			         lista.add(e);
			         JOptionPane.showMessageDialog(null,"Inseriu engenheiro com sucesso");
			         break;
			case '2': // inserir um diretor
				nome= JOptionPane.showInputDialog(null, "Nome?");
					setor= JOptionPane.showInputDialog(null, "Setor?");
					txtsalario= JOptionPane.showInputDialog(null, "Salario fixo?");
					float salarioFixo= Integer.parseInt(txtsalario);
					String txtGratificacao = JOptionPane.showInputDialog(null, "Gratificacao?");
					float gratificacoes= Float.parseFloat(txtGratificacao);
					Diretor d = new Diretor(nome, setor, salarioFixo, gratificacoes);
					lista.add(d);
					JOptionPane.showMessageDialog(null, "Inseriu diretor com sucesso");
					break;
			case '3':nome = JOptionPane.showInputDialog(null,"Nome?");
	                 setor = JOptionPane.showInputDialog(null,"Setor?");
	                 txtsalario=JOptionPane.showInputDialog(null,"Salario Fixo?");
			         float salfixo = Float.parseFloat(txtsalario);
			         txtbonus=JOptionPane.showInputDialog(null,"Bonus?");
			         float bonus = Float.parseFloat(txtbonus);
			         Caixa c = new Caixa(nome,setor,salfixo,bonus);
			         lista.add(c);
			         JOptionPane.showMessageDialog(null,"Inseriu caixa com sucesso");
			         break;
			case '4': String saida="\nExibe Todos Empregados\n";
	                                           int i;
                                                         for (i=0;i<lista.size();i++)
                                                                    saida += lista.get(i).toString()+"\n\n";
                                                         JOptionPane.showMessageDialog(null, saida);
                                                         break;         
			case '5': saida="\nExibe somente Engenheiros\n";
                                                         for (Empregado x:lista){
    				      if (x instanceof Engenheiro){
                                                                      saida += x.toString()+"\n\n";}
                                                          }
                                                                JOptionPane.showMessageDialog(null, saida); 
				      break;
			case '6': break;
			}//switch 
	}//while
	}//main
}//class Principal
