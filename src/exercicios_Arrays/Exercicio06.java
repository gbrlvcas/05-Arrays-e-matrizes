package exercicios_Arrays;

import javax.swing.JOptionPane;

public class Exercicio06 {

	public static void main(String[] args) {
		
		//Variaveis
		
		String[] nome = new String [10];
		int indice = 0;
		int[] questionario = new int [10];
		int perguntas = 0;
		int[] contaPerguntas = new int [10];
		int[] acertos = new int [10];
		int[] erros = new int [10];
		int contaAcertos = 0;
		int contaErros = 0;
		int newgame;
		
		
		//---------------------------------------------------------------------------------------------------------
		
		//Solicitando nome do participamente
		
		do {
			
			nome[indice] = JOptionPane.showInputDialog("Digite o seu nome");
			
			
			questionario[perguntas] = JOptionPane.showConfirmDialog(null, "1� Pergunta aqui","",0);
			contaPerguntas[perguntas] = perguntas + 1;
			
						
				if(questionario[perguntas] == 0) {
					
					acertos[indice]++;
					perguntas++;
					contaAcertos++;
				}else{
					erros[perguntas]++;
					perguntas++;
					contaErros++;
				}
				
				questionario[perguntas] = JOptionPane.showConfirmDialog(null, "2� Pergunta aqui","",0);
				contaPerguntas[perguntas] = perguntas + 1;
				
				
				if(questionario[perguntas] == 0) {
					
					acertos[indice]++;
					perguntas++;
					contaAcertos++;
				}else{
					erros[perguntas]++;
					perguntas++;
					contaErros++;
				}
				
				questionario[perguntas] = JOptionPane.showConfirmDialog(null, "3� Pergunta aqui","",0);
				contaPerguntas[perguntas] = perguntas + 1;
				
				
				if(questionario[perguntas] == 0) {
					
					acertos[indice]++;
					perguntas++;
					contaAcertos++;
				}else{
					erros[perguntas]++;
					perguntas++;
					contaErros++;
				}
				
				questionario[perguntas] = JOptionPane.showConfirmDialog(null, "4� Pergunta aqui","",0);
				contaPerguntas[perguntas] = perguntas + 1;
				
				
				if(questionario[perguntas] == 0) {
					
					acertos[indice]++;
					perguntas++;
					contaAcertos++;
				}else{
					erros[perguntas]++;
					perguntas++;
					contaErros++;
				}
				
				questionario[perguntas] = JOptionPane.showConfirmDialog(null, "5� Pergunta aqui","",0);
				contaPerguntas[perguntas] = perguntas + 1;
				
				
				if(questionario[perguntas] == 0) {
					
					acertos[indice]++;
					perguntas++;
					contaAcertos++;
				}else{
					erros[perguntas]++;
					perguntas++;
					contaErros++;
				}
				
				questionario[perguntas] = JOptionPane.showConfirmDialog(null, "6� Pergunta aqui","",0);
				contaPerguntas[perguntas] = perguntas + 1;
				
				
				if(questionario[indice] == 0) {
					
					acertos[perguntas]++;
					perguntas++;
					contaAcertos++;
				}else{
					erros[perguntas]++;
					perguntas++;
					contaErros++;
				}
				
				questionario[perguntas] = JOptionPane.showConfirmDialog(null, "7� Pergunta aqui","",0);
				contaPerguntas[perguntas] = perguntas + 1;
				
				
				if(questionario[perguntas] == 0) {
					
					acertos[indice]++;
					perguntas++;
					contaAcertos++;
				}else{
					erros[perguntas]++;
					perguntas++;
					contaErros++;
				}
				
				questionario[perguntas] = JOptionPane.showConfirmDialog(null, "8� Pergunta aqui","",0);
				contaPerguntas[perguntas] = perguntas + 1;
				
				
				if(questionario[perguntas] == 0) {
					
					acertos[indice]++;
					perguntas++;
					contaAcertos++;
				}else{
					erros[perguntas]++;
					perguntas++;
					contaErros++;
				}
				
				questionario[perguntas] = JOptionPane.showConfirmDialog(null, "9� Pergunta aqui","",0);
				contaPerguntas[perguntas] = perguntas + 1;
				
				
				if(questionario[perguntas] == 0) {
					
					acertos[indice]++;
					perguntas++;
					contaAcertos++;
				}else{
					erros[perguntas]++;
					perguntas++;
					contaErros++;
				}
				
				questionario[perguntas] = JOptionPane.showConfirmDialog(null, "10� Pergunta aqui","",0);
				contaPerguntas[perguntas] = perguntas + 1;
				
				
				if(questionario[perguntas] == 0) {
					
					acertos[indice]++;
					perguntas++;
					contaAcertos++;
				}else{
					erros[perguntas]++;
					perguntas++;
					contaErros++;
				}
				
				
				
				
			JOptionPane.showMessageDialog(null, "Ol� "+nome[indice]+"\nVoc� acertou "+contaAcertos+" perguntas\nVoc� Errou "+contaErros+" perguntas");
			
			//---------------------------------------------------------------------------------------------------------
			
			//Corre��es
			
			//Variavel de corre��o das respostas erradas
			
			String[] correto = new String [10];
			
			for(int correcao = 0; correcao < questionario.length ; correcao++){
			if(questionario[correcao] == 0 && erros[correcao] == 1){
				correto[correcao] = "N�o";
			}else{
				correto[correcao] ="Sim";
			}
			
			}
			
			
			
			//Variavel para mostrar os erros
			
			String qntErros = "";
			
			for(int correcao = 0; correcao < questionario.length ;  correcao++) {
			if(erros[correcao] == 1) {
				qntErros+="Voc� errou na quest�o "+contaPerguntas[correcao]+", Resposta correta: "+correto[correcao]+"\n";
			}
			}
			
			JOptionPane.showMessageDialog(null, qntErros);
			
			
			indice++;
			perguntas = 0;
			contaAcertos = 0;
			contaErros = 0;
			
			for(int apagaErros = 0 ; apagaErros < questionario.length; apagaErros++){
			erros[apagaErros] = 0;
			}
			
			
			
			
			newgame = JOptionPane.showConfirmDialog(null, "Existe um outro competidor?","",0);
			
		}while(newgame == 0);
		
		
		
		
		//---------------------------------------------------------------------------------------------------------
		//Ranking de jogadores
		
		int guardaRank;
		String nomeRank;
		String ranking = "***** Ranking de Jogadores *****\n";
			
		for(int rank = 0; rank < nome.length; rank++){
			
			for(int rank1 = rank + 1; rank1 < nome.length - 1; rank1++){
				
				if(acertos[rank] < acertos[rank1]){
					guardaRank = acertos[rank];
					acertos[rank] = acertos[rank1];
					acertos[rank1] = guardaRank;
					
					nomeRank = nome[rank];
					nome[rank] = nome[rank1];
					nome[rank1] = nomeRank;
					
				}
			}
			
		}
		

		for(int rank = 0; rank < nome.length; rank++){

			if(nome[rank] != null){
		ranking+= (rank+1)+"� Lugar: "+nome[rank]+" - "+acertos[rank]+" acertos\n";
			}
		}
		
		//Mostrando o rank
		JOptionPane.showMessageDialog(null, ranking);
		
		

	}

}
