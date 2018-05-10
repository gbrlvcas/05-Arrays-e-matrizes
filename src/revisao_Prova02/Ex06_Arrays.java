package revisao_Prova02;

import javax.swing.JOptionPane;

public class Ex06_Arrays {

	public static void main(String[] args) {
		
		//Variaveis
		String[] pergunta = new String [10];
		
			String escolherResposta = "**** Escolha a resposta correta ****\n\n";
			
		int[] resposta = new int [10];
			
		
		
		//Solicitando a pergunta
		for(int questionario = 0 ; questionario < 10 ; questionario++){
			
			pergunta[questionario] = JOptionPane.showInputDialog("Digite 10 perguntas");
				escolherResposta+="Selecione SIM ou NAO para sua pergunta\nPergunta feita: "+pergunta[questionario];
			resposta[questionario] = Integer.parseInt(JOptionPane.showInputDialog(escolherResposta));
				
			
		}

	}

}
