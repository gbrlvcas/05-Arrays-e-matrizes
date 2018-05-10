package exercicios_Arrays;

import javax.swing.JOptionPane;

public class Exercicio10 {

	public static void main(String[] args) {
		
		
		
		// 0) Variavel - [Geral]
		boolean sairContatos = true;
		
		// 1) Variaveis [Cadastro - Contato]
		int contador = 0;
		String[] nome = new String [5];
		String[] sobreNome = new String [5];
			// Data de nascimento
			int[] dia = new int [5];
			int[] mes = new int [5];
			int[] ano = new int [5];
		String[] celular = new String [5];
		String[] endereco = new String [5];
		String[] dadosUnidos = new String [5];
		String mnCategoria;
		String novaCategoria;
		int escolhaCategoria;
		String[] armazenaCategoria = new String[5];
		int continuarCadastro;
		boolean sairCadastro = true;
		
		// 2) Variaveis - [Alteração - Contato]
		String menuAlteracao;
		int alterarContato;
		int confirmaAlterar;
		int continuarAlteracao;
		boolean sairAlteracao = true;
		
		// 3) Variaveis - [Exclusão - Contato]
		String menuExclusao;
		int excluirContato;
		int confirmaExclusao;
		int continuarExclusao;
		String armazenaNome;
		boolean sairExclusao = true;
		
		// 4) Variaveis - [Pesquisa - Contato]
		
		String menuPesquisa;
		String menuDados;
		int selecionarPesquisa;
		int continuarPesquisa;
		boolean sairPesquisa;
		
		
		// 5) Variaveis [Cadastro - Categoria]
		String[] categoria = new String [5];
		String verifCategoria;
		int contCategoria = 0;
		int continuarCategoria;
		boolean sairCategoria = true;
		
		// 6) Variaveis [Alteração - Categoria]
		String mnaltCategoria;
		int alterarCategoria;
		int confaltCatego;
		int contaltCatego;
		boolean sairaltCatego = true;
		
		// 7) Variaveis [Exclusão - Categoria]
		String mnexcCategoria;
		boolean saircatExclusao = true;
		
		
		
		
		
		
		//Menu da lista de contatos
		String menuContatos = "**** Menu de contatos ****\n\n";
				menuContatos+="1) Cadastrar contatos\n";
				menuContatos+="2) Alterar contatos\n";
				menuContatos+="3) Excluir contatos\n";
				menuContatos+="4) Pesquisar contatos\n";
				menuContatos+="5) Cadastrar categoria\n";
				menuContatos+="6) Alterar categoria\n";
				menuContatos+="7) Excluir categoria\n";
				menuContatos+="8) Lembrete de aniversario\n";
				
		int mostraMenu;	
				
		
		
		
		
	//Laço principal
	do {
		sairContatos = true;
		
			mostraMenu = Integer.parseInt(JOptionPane.showInputDialog(menuContatos));
		
			
		//Inicio do bloco de [Cadastro - Contato] - Caso "1" seja selecionado;
			if(mostraMenu == 1) {
		do {
			sairCadastro = true;
			
			nome[contador] = JOptionPane.showInputDialog("Digite o nome do contato");
			sobreNome[contador] = JOptionPane.showInputDialog("Digite o sobre nome de "+nome[contador]);
			dia[contador] = Integer.parseInt(JOptionPane.showInputDialog("Data de nascimento: digite o DIA"));
			mes[contador] = Integer.parseInt(JOptionPane.showInputDialog("Data de nascimento: digite o MÊS"));
			ano[contador] = Integer.parseInt(JOptionPane.showInputDialog("Data de nascimento: digite o ANO"));
			celular[contador] = JOptionPane.showInputDialog("Digite o número do DDD + celular");
			endereco[contador] = JOptionPane.showInputDialog("Digite o endereço");
			dadosUnidos[contador] = "Nome: "+nome[contador]+" "+sobreNome[contador]+"\n Nascimento: "+dia[contador]+"/"+mes[contador]+"/"+ano[contador]+"\nContato: "+celular[contador]+"\nEndereço: "+endereco[contador];
			
			mnCategoria = "**** Menu de categoria ****\n\n";
			
				for(int menuCat = 0 ; menuCat < 1 ; menuCat++){
					
					if(categoria[menuCat] == null){
					novaCategoria = JOptionPane.showInputDialog("Não existe uma categoria cadastrada\nDe um nome a uma nova categoria?");					
							categoria[contCategoria] = novaCategoria;
							mnCategoria+= menuCat+") "+categoria[menuCat]+"\n";
							
								
				}else{
					mnCategoria+= menuCat+") "+categoria[menuCat]+"\n";
				}
				}
			
				
				escolhaCategoria = Integer.parseInt(JOptionPane.showInputDialog(mnCategoria));
					armazenaCategoria[escolhaCategoria] = nome[contador];
				
			
			continuarCadastro = JOptionPane.showConfirmDialog(null, "Deseja cadastrar mais algum contato?","",0);
				if(continuarCadastro == 0) {
					sairCadastro = false;
					contador++;
				}
				
		}while(sairCadastro == false);
		
			}
			//Fim do bloco de [Cadastro - Contato] - Caso "1" seja selecionado;
		
// -----------------------------------------------------------------------------------------------------------------
			
			//Inicio do bloco de [Alteração - Contato] - Caso "2" seja selecionado;
			if(mostraMenu == 2){
			
			do{	
				sairAlteracao = true;
			menuAlteracao = "**** Menu de alteração ****\n\n";
			
			for(int alteracao = 0 ; alteracao < 5 ; alteracao++){
				if(nome[alteracao] != null){
					menuAlteracao+=alteracao+") "+nome[alteracao]+" "+sobreNome[alteracao]+"\n";
				}
				
			}
			
			
			alterarContato = Integer.parseInt(JOptionPane.showInputDialog(menuAlteracao));
			confirmaAlterar = JOptionPane.showConfirmDialog(null, "Você realmente deseja alterar este contato?","",0);
				if(confirmaAlterar == 0){
					
					nome[alterarContato] = JOptionPane.showInputDialog("Digite o nome do novo contato");
					sobreNome[alterarContato] = JOptionPane.showInputDialog("Digite o sobre nome de "+nome[alterarContato]);
					dia[alterarContato] = Integer.parseInt(JOptionPane.showInputDialog("Data de nascimento: digite o DIA"));
					mes[alterarContato] = Integer.parseInt(JOptionPane.showInputDialog("Data de nascimento: digite o MÊS"));
					ano[alterarContato] = Integer.parseInt(JOptionPane.showInputDialog("Data de nascimento: digite o ANO"));
					celular[alterarContato] = JOptionPane.showInputDialog("Digite o número do DDD + celular");
					endereco[alterarContato] = JOptionPane.showInputDialog("Digite o endereço");
					
					mnCategoria = "**** Menu de categoria ****\n\n";
					
						for(int lista = 0 ; lista < 5 ; lista++){
							if(categoria[lista] == null){
							mnCategoria+= lista+") "+categoria[lista];
							}
						}
						
						
					
				}else{
					sairAlteracao = false;
				}
			
				continuarAlteracao = JOptionPane.showConfirmDialog(null, "Deseja alterar mais algum contato?","",0);
					if(continuarAlteracao == 0){
						sairAlteracao = false;
					}else{
						sairAlteracao = true;
					}
				
					
			}while(sairAlteracao == false);	
			
			}
			
			
			//Fim do bloco de [Alteração - Contato] - Caso "2" seja selecionado;
		
// -----------------------------------------------------------------------------------------------------------------
			
			//Inicio do bloco de [Excluir -  Contato] - Caso "3" seja selecionado;
			if(mostraMenu == 3){
			do{
				sairExclusao = true;
			
			menuExclusao ="**** Menu de Exclusão ****\n\n";
			
			for(int exclusao = 0 ; exclusao < 5 ; exclusao++) {
				if(nome[exclusao] != null) {
					menuExclusao+= exclusao+") "+nome[exclusao]+"\n";
				}
			}
			
			excluirContato = Integer.parseInt(JOptionPane.showInputDialog(menuExclusao));
			confirmaExclusao = JOptionPane.showConfirmDialog(null, "Deseja mesmo excluir este contato?","",0);
				if(confirmaExclusao == 0) {
					nome[excluirContato] = null;
					
					for(int nll = 0 ; nll < 4 ; nll++){
						for(int num = 1 ; num < 5 ; num++){
							if(nome[nll] == null){
								armazenaNome = nome[num];
								nome[num] = nome[nll];
								nome[nll] = armazenaNome;
							}
						}
					}
					
					//Reposicionando os contatos
					
					}
					
			continuarExclusao = JOptionPane.showConfirmDialog(null,"Deseja excluir algum outro contato?","",0);
					if(continuarExclusao == 0) {
						sairExclusao = false;
				}else{
					sairExclusao = true;
				}
					
			}while(sairExclusao == false);
			
			}
			
			//Fim do bloco de [Excluir - Contato] - Caso "3" seja selecionado;
			
// -----------------------------------------------------------------------------------------------------------------			
			
			//Inicio do bloco de [Pesquisar - Contato] - Caso "4" seja selecionado;
			
			if(mostraMenu == 4) {
				
				do {
					sairPesquisa = true;
					
						menuPesquisa = "**** Menu de pesquisa ****\n\n";
						//Gerando os clientes para pesquisa
						for(int show = 0 ; show < 5 ; show++) {
							if(nome[show] != null) {
								menuPesquisa+= (show)+")"+nome[show]+"\n";
							}
						}
					
						//Selecionar o cliente da pesquisa
						selecionarPesquisa = Integer.parseInt(JOptionPane.showInputDialog(menuPesquisa));
							menuDados = "**** Dados do cliente ****\n\n";
							menuDados+= "Nome: "+nome[selecionarPesquisa]+" "+sobreNome[selecionarPesquisa]+"\n";
							menuDados+= "Data de Nascimento: "+dia[selecionarPesquisa]+"/"+mes[selecionarPesquisa]+"/"+ano[selecionarPesquisa]+"\n";
							menuDados+= "Celular: "+celular[selecionarPesquisa]+"\n";
							menuDados+= "Endereço: "+endereco[selecionarPesquisa]+"\n";
								for(int analisa = 0; analisa < 5 ; analisa++) {
									if(armazenaCategoria[analisa].equals(nome[selecionarPesquisa])) {
										menuDados+= "Categoria: "+categoria[analisa]+"\n\n	";
										break;
									}
								}
							menuDados+= "Deseja ver outro cliente?";
							
						//Perguntando ao cliente se ele quer pesquisar denovo
							continuarPesquisa = JOptionPane.showConfirmDialog(null, menuDados,"",0);
								if(continuarPesquisa == 0) {
									sairPesquisa = false;
								}else {
									sairPesquisa = true;
								}
								
				}while(sairPesquisa == false);
			}
			
			//Fim do bloco de [Pesquisar - Contato] - Caso "4" seja selecionado;
			
// -----------------------------------------------------------------------------------------------------------------
			
			//Inicio do bloco de [Cadastro - Categoria] - Caso "5" seja selecionado;
			
			if(mostraMenu == 5){
				
				do{
					sairCategoria = true;
				
					verifCategoria = JOptionPane.showInputDialog("Digite o nome da sua categoria");
						if(verifCategoria.equals("")){
							JOptionPane.showMessageDialog(null, "Você deixou o campo em branco");
							sairCategoria = true;
							
						}else{
					
					for(int verifica = 0 ; verifica < 5 ; verifica++){
						if(verifCategoria == categoria[verifica]){
							JOptionPane.showMessageDialog(null, "Ja existe uma categoria com este nome");
							sairCategoria = true;
							break;
						}
						}
					
					if(sairCategoria == false){
						
						categoria[contCategoria] = verifCategoria;
						contCategoria++;
						
						continuarCategoria = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outra categoria?","",0);
						if(continuarCategoria == 0){
							sairCategoria = false;
							
						}
						}
						
					}
						}
				}while(sairCategoria == false);
				
				}
				
	
			//Fim do bloco de [Cadastro - Categoria] - Caso "5" seja selecionado;
			
// -----------------------------------------------------------------------------------------------------------------	
			

			//Inicio do bloco de [Alterar - Categoria] - Caso "6" seja selecionado;		
			
			if(mostraMenu == 6){
			
				do{
					sairaltCatego = true;
					
			mnaltCategoria ="**** Alterar categoria ****\n\n";
			
			for(int alteracao = 0 ; alteracao < 5 ; alteracao++){
				if(categoria[alteracao] != null){
					mnaltCategoria += alteracao+") "+categoria[alteracao]+"\n";
				}
			}
			
			alterarCategoria = Integer.parseInt(JOptionPane.showInputDialog(mnaltCategoria));
			confaltCatego = JOptionPane.showConfirmDialog(null, "Deseja alterar esta categoria?","",0);
				if(confaltCatego == 0){
					
					verifCategoria = JOptionPane.showInputDialog("Digite o nome da nova categoria");
						for(int verifica = 0 ; verifica < 5 ; verifica++){
							
							if(verifCategoria.equals(categoria[verifica])){
								JOptionPane.showMessageDialog(null, "Ja existe uma categoria com esse nome");
								sairaltCatego = false;
								break;
							}
						}
						
						if(sairaltCatego == true){
							
							categoria[alterarCategoria] = verifCategoria;
							contaltCatego = JOptionPane.showConfirmDialog(null, "Deseja alterar mais categorias?","",0);
								if(contaltCatego == 0){
									sairaltCatego = false;
								}
						}
				}
			
				
				
				}while(sairaltCatego == false);
				
			
			}
			
			
			//Fim do bloco de [Alterar - Categoria] - Caso "6" seja selecionado;
			
// -----------------------------------------------------------------------------------------------------------------				
	
		
			//Inicio do bloco de [Alterar - Categoria] - Caso "6" seja selecionado;				
			
			if(mostraMenu == 7) {
				
				do {
					
					
					
				}while(saircatExclusao == false);
				
				
				
				
				
				
				
				
			}
		
		
		
	}while(sairContatos == false);
		
		
		
		
		
	}

}
