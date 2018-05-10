package exercicios_Arrays;

import javax.swing.JOptionPane;

public class Exercicio4o {

	public static void main(String[] args) {
		
		//Variaveis
		
		String[] gabarito = new String [10];
		boolean erroGabarito = false;
		
		String[] nomeAluno = new String [10];
		int qntAluno = 0;
				
		
		String[] alunoResponde = new String [10];
		boolean erroAluno = false;
		
		int[] acertou = new int [10];
		int[] errou = new int [10];
		
		
		
		//Estrutura da mensagem
		String texto = " Lista de erros e acertos\n\n";
		
		
		//Escrever as questões do gabarito
		
		for(int i = 0; i < gabarito.length; i++) {
			
			do {
					
			
			gabarito[i] = JOptionPane.showInputDialog("Digite a resposta do gabarito (A B C D) "+(i+1)+" de 10");
			
			switch(gabarito[i]) {
			
			case "a":
			case "b":
			case "c":
			case "d":
				
			erroGabarito = false;
			
			break;
			
			default:
				JOptionPane.showMessageDialog(null, "Digite apenas (A B C D) para o gabarito");
				erroGabarito = true;
			break;
			}
		
			
					
		}while(erroGabarito == true);
			
		}
			
			
	// -------------------------------------------------------------------------------------------------------------------------------------
		
			
		//Solicitando nome do aluno
			
			nomeAluno[qntAluno] = JOptionPane.showInputDialog("Digite o seu nome");
			
			
		
			do {
		
		//Laço referente a quantidade de nomes e notas dadas pelos alunos	
			
			for(int i = 0; i < alunoResponde.length; i++) {		
		
				//Laço referente aos erros de gabarito
				
				do {
						
				
					alunoResponde[i] = JOptionPane.showInputDialog("Digite as 10 questoes do gabarito aqui, apenas (A B C D) "+(i+1)+" de 10");
					
				switch(alunoResponde[i]) {
				
				case "a":
				case "b":
				case "c":
				case "d":
				erroAluno = false;
				break;
				
				default:
					JOptionPane.showMessageDialog(null, "Digite apenas (A B C D) para o gabarito");
					erroAluno = true;
				break;
				}
				
				
				
				}while(erroAluno == true);
				
				
				if(alunoResponde[i].equals(gabarito[i])){
					acertou[qntAluno]++;
					
				}else{
					errou[qntAluno]++;
				}
				
				
				
				
			}
			
			
			
			qntAluno++;
			
			nomeAluno[qntAluno] = JOptionPane.showInputDialog("Digite o seu nome, ou escreva SAIR").toLowerCase();
			
			
			
			
				
			
	
			
			
		}while(!nomeAluno[qntAluno].equals("sair"));
			
			//Metodo bolha
			
			int maiorNumero, menorNumero;
			String guardarNome;
			
			for(int i = 0 ; i < nomeAluno.length ; i++) {
				
				for(int i2 = i+1; i2 < nomeAluno.length - 1 ; i2++) {
					if(acertou[i2] > acertou[i]){
						
						maiorNumero = acertou[i];
						acertou[i] = acertou[i2];
						acertou[i2] = maiorNumero;
						
						menorNumero = errou[i];
						errou[i] = errou[i2];
						errou[i2] = menorNumero;
						
						guardarNome = nomeAluno[i];
						nomeAluno[i] = nomeAluno[i2];
						nomeAluno[i2] = guardarNome;
						
						
						
						
					}
				}
				}
	
					
			for(int i = 0; i < qntAluno; i++){
			texto+= "Aluno: "+nomeAluno[i]+" acertou: "+acertou[i]+" errou: "+errou[i]+"\n";
			}
			
				
				
				//Mostrando texto para o cliente
				JOptionPane.showMessageDialog(null, texto);
	
		
	}
			
			
			
			
			
	

}
	

