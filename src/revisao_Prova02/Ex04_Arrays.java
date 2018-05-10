package revisao_Prova02;

import javax.swing.JOptionPane;

public class Ex04_Arrays {

	public static void main(String[] args) {
		
		//Variaveis gabarito
		
		String[] gabarito = new String [10];
		boolean notaErrada = false;
		
		//Variaveis aluno e prova
		
		String[] nomeAluno = new String [100];
		String[] respondeProva = new String [10];
		int[] acertos = new int [10];
		int acertou = 0;
		int errou = 0;
		int contador = 0;
		int confirmaProva;
		boolean sairProva = true;
		
		//Variaveis de rank
		String rank ="**** Rank de Jogadores ****\n\n";
		int guardaNumero;
		String guardaNome;
		int posicaoRank = 1;
		
		
		
		//Escrevendo no gabarito
		
		for(int questoes = 0 ; questoes < 10 ; questoes++) {
			
		do {
			gabarito[questoes] = JOptionPane.showInputDialog("Digite o gabarito das 10 questões "+(questoes+1)+" de 10");
			
				switch (gabarito[questoes]) {
				case "a":
				case "b":
				case "c":
				case "d":
					notaErrada = false;
				break;
				default:
					JOptionPane.showMessageDialog(null, "Digite somente nota [A B C D]");
					notaErrada = true;
					break;
				
				
				}
				
		}while(notaErrada == true);
		}
		
		
		//Solicitando nome do aluno
		
		do {
			
		
			nomeAluno[contador] = JOptionPane.showInputDialog("Digite o seu nome");
			
			for(int prova = 0 ; prova < 10 ; prova++) {
				
				do {
				respondeProva[prova] = JOptionPane.showInputDialog("Digite a responta da prova "+(prova+1)+" de 10");
				
				switch (respondeProva[prova]) {
				case "a":
				case "b":
				case "c":
				case "d":
					notaErrada = false;
				break;
				default:
					JOptionPane.showMessageDialog(null, "Digite somente nota [A B C D]");
					notaErrada = true;
					break;
					
			}
				}while(notaErrada == true);
			}
				
				//Analisando as notas do aluno
				
				for(int analisa = 0 ; analisa < 10 ; analisa++) {
					if(respondeProva[analisa].equals(gabarito[analisa])) {
						acertou++;
						acertos[contador] = acertou;
						
					}else{
						errou++;
					}
				}
				
				//Mostrando os erros e acertos do aluno
				JOptionPane.showMessageDialog(null, "Olá "+nomeAluno[contador]+"\nVocê acertou: "+acertou+"\nVocê errou: "+errou);
				
				//Pedindo se outro aluno quer fazer a prova
				confirmaProva = JOptionPane.showConfirmDialog(null, "Outro aluno deseja fazer essa prova?","",0);
					if(confirmaProva == 0) {
						sairProva = false;
						acertou = 0;
						errou = 0;
						contador++;
						
					}else {
						sairProva = true;
					}
			
		}while(sairProva == false);
		
				//Método bolha - Caso haja mais de um vencedor
				if(contador > 0) {
					for(int i1 = 0 ; i1 < 9 ; i1++) {
						for(int i2 = i1+1 ; i2 < 10 ; i2++) {
							if(acertos[i2] > acertos[i1]) {
								guardaNumero = acertos[i2];
								acertos[i2] = acertos[i1];
								acertos[i1] = guardaNumero;
								
								guardaNome = nomeAluno[i2];
								nomeAluno[i2] = nomeAluno[i1];
								nomeAluno[i1] = guardaNome;
							}
							
						}
					}
				}
		
		
				//Gerando o rank
		if(contador == 0) {
			JOptionPane.showMessageDialog(null, "Houve apenas um participante");
		}else{
			for(int ranking = 0 ; ranking < 10 ; ranking++) {
				if(nomeAluno[ranking] != null) {
					rank+=(posicaoRank)+"º Lugar: "+nomeAluno[ranking]+" - "+acertos[ranking]+" acertos\n";
					posicaoRank++;
				}
			}
			
			//Mostrando o rank
			
			JOptionPane.showMessageDialog(null, rank);
		}
	}

}
