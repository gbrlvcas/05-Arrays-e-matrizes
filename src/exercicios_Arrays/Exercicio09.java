package exercicios_Arrays;

import javax.swing.JOptionPane;

public class Exercicio09 {

	public static void main(String[] args) {
		
		
		//Variaveis com vetores
		String[] produto = new String [20];
		double[] valor = new double [20];
		int[] quantidade = new int [20];
		
		
		//Variaveis de cadastro
		String cadastrarProdt;
		int fimCadastro;
		boolean sairCadastro = false;
		boolean validaVer = false;
		int contador = 0;
		
		
		//Variaveis de Listagem
			//As variaveis de listagem ficam no bloco de codigos de listagem
		
		//Variaveis de Alteração
		String msgAlterar;
		String prodtAlterar;
		int alterarProdt;
		boolean sairAlteracao = false;
		boolean validaAlt = false;
		int fimAlteracao;
		
		
		//Variaveis de Exclusao
		int prodtExcluir;
		int confirmaExcluir;
		int fimExcluir;
		boolean sairExcluir = false;
		
		
		//Variaveis de Sair
		int confirmaSair;
		boolean sairEstoque = false;
		
		
		
		

		
		
		// Menu Estoque
		String mnestoque = "*******Gerenciamento de estoque*******\n\n";
		mnestoque += "1) Cadastrar produto\n";
		mnestoque += "2) Listar produtos\n";
		mnestoque += "3) Alterar produto\n";
		mnestoque += "4) Excluir produto\n";
		mnestoque +="5) Sair do estoque\n";
		int estoque;
		
//----------------------------------------------------------------------------		
		
		do {
		
		//Menu do estoque
		 estoque = Integer.parseInt(JOptionPane.showInputDialog(mnestoque));
		
		//Inicio do bloco - Caso em Menu estoque seja selecionado 1
		if(estoque == 1) {
		
		do {
			sairCadastro = false;
		//Solicitando nome do produto
		cadastrarProdt = JOptionPane.showInputDialog("Digite o nome do produto "+(contador+1)+" de 20");
		
		//Ver se o produto ja esta cadastrado
		for(int verifica = 0 ; verifica < 20; verifica++) {
			validaVer = false;
			if(cadastrarProdt.equals(produto[verifica])) {
				JOptionPane.showMessageDialog(null,"Esse produto ja foi cadastrado");
				validaVer = true;
				break;
				
				
			}
		}
		
		if(validaVer == false) {
		
		for(int registra = 0 ; registra < 20 ; registra++) {
			if(produto[registra] == null) {
				produto[registra] = cadastrarProdt;
				valor[registra] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto"));
				quantidade[registra] = Integer.parseInt(JOptionPane.showInputDialog("Quantidade do produto"));
				contador++;
				break;
			}
			
		}
		
		}
		
		fimCadastro = JOptionPane.showConfirmDialog(null, "Deseja cadastrar mais produtos?","",0);
		
		if(fimCadastro == 1) {
			sairCadastro = false;
			break;
		}
		
		if(fimCadastro == 0 && contador < 20) {
			sairCadastro = true;
		}else{
			JOptionPane.showMessageDialog(null, "Limite máximo de 20 produtos");
			sairCadastro = false;
		}
		
		}while(sairCadastro == true);
		
		}//Fim do bloco - Caso em Menu estoque seja selecionado 1
		
//----------------------------------------------------------------------------
		
		//Inicio do bloco - Caso em Menu estoque seja selecionado 2
		if(estoque == 2) {
			
			//Inicio da listagem de estoque
			String listaEstoque ="***** Listagem de estoque *****\n\n";
			
			
			for(int listar = 0; listar < 20 ; listar++){
				if(produto[listar] != null) {
				
				listaEstoque+="Produto: "+produto[listar]+"\n";
				listaEstoque+="Valor: R$ "+valor[listar]+"\n";
				listaEstoque+="Quantidade: "+quantidade[listar];
				listaEstoque+="\n\n";
				
				
				}
			}
			//Mostrar os produtos cadastrados no estoque
			JOptionPane.showMessageDialog(null, listaEstoque);
			}
			
			
			
					
		//Fim do bloco - Caso em Menu estoque seja selecionado 2
		
//----------------------------------------------------------------------------
	
		
		//Inicio do bloco - Caso em Menu estoque seja selecionado 3
		if(estoque == 3) {
		
		do { //Laço principal
			sairAlteracao = false;
			
			//Inicio da mensagem para o cliente selecionar o produto para altera-lo
			msgAlterar = "**** Alterar produto ****\n\nSelecione um produto para altera-lo\n";
			
			for(int alterar = 0 ; alterar < 20 ; alterar++) {
				if(produto[alterar] != null) {
				msgAlterar+=(alterar)+") "+produto[alterar]+"\n";
				}
			}
			
			do { //Laço para validar - se o produto a alterar ja existe no estoque
				validaAlt = false;
				
			//Mensagem para o cliente selecionar o produto e altera-lo
			alterarProdt = Integer.parseInt(JOptionPane.showInputDialog(msgAlterar));
			
			prodtAlterar = JOptionPane.showInputDialog("Digite o novo nome do produto");
			
				for(int verifica = 0 ; verifica < 20 ; verifica++) {
					
					if(prodtAlterar.equals(produto[verifica])){
						JOptionPane.showMessageDialog(null, "Este produto ja existe no sistema");
						validaAlt = true;
						break;
					}
				}
				
				
				if(validaAlt == false) {
					produto[alterarProdt] = prodtAlterar;
					valor[alterarProdt] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do novo produto"));
					quantidade[alterarProdt] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do novo produto"));
				}
				
				
				
			}while(validaAlt == true);
			
			
			fimAlteracao = JOptionPane.showConfirmDialog(null, "Deseja alterar mais algum produto?","",0);
				if(fimAlteracao == 0) {
					sairAlteracao = true;
				}
			
		}while(sairAlteracao == true);
		
		
		}//Fim do bloco - Caso em Menu estoque seja selecionado 3
		
//----------------------------------------------------------------------------	
		//Inicio do bloco - Caso em Menu estoque seja selecionado 4
		
		do {
			sairExcluir = false;
		if(estoque == 4) {
			
			//Menu de exclusão
			String mnExcluir = "**** Excluir produto ****\n\n";
			
			for(int excluir = 0 ; excluir < 20 ; excluir++) {
				if(produto[excluir] != null) {
				mnExcluir+= excluir+") "+produto[excluir];
				
				}
				
			}
			
			prodtExcluir = Integer.parseInt(JOptionPane.showInputDialog(mnExcluir));
			confirmaExcluir = JOptionPane.showConfirmDialog(null, "Deseja excluir mesmo o produto "+(produto[prodtExcluir])+" do seu estoque","",0);
					if(confirmaExcluir == 0) {
						produto[prodtExcluir] = null;
					}
						
					fimExcluir = JOptionPane.showConfirmDialog(null, "Deseja excluir mais algum produto?","",0);
					if(fimExcluir == 0) {
						sairExcluir = true;
					}
				
					
					
					}
			
			
		}while(sairExcluir == true); //Fim do bloco - Caso em Menu estoque seja selecionado 4
	
		
//------------------------------------------------------------------------
				
		//Inicio do bloco - Caso em Menu estoque seja selecionado 5
		if(estoque == 5) {
				sairEstoque = false;
				
			confirmaSair = JOptionPane.showConfirmDialog(null, "Deseja sair do estoque?","",0);
				if(confirmaSair == 0) {
					sairEstoque = true;
				}
			}
			
			
			
			
			
			
		}while(sairEstoque == false);
		
		}
		
	}
	