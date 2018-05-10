package exercicios_Matrizes;

import java.util.Random;

import javax.swing.JOptionPane;

public class Ex04 {

	public static void main(String[] args) {
		
		//Variaveis
		
		String[][] caixaAsterisco = new String[5][15];
		String showPainel ="**** Resultado ****\n\n";
		String num = "1";
		Random gerarNumero = new Random();
		
		//Construindo a caixa
				//Parte superior
		
		for(int linhaAste = 0; linhaAste < 15 ; linhaAste++) {
			if(caixaAsterisco[0][linhaAste] == null) {
				caixaAsterisco[0][linhaAste] = "*";
				
				
			showPainel+= caixaAsterisco[0][linhaAste];
			
		
			}
		
		}
		
				//Laterais
			caixaAsterisco[3][8] = num;
		for(int colunaAste2 = 1 ; colunaAste2 < 4 ; colunaAste2++) {
			if(colunaAste2 == 2) {
				showPainel+= "\n";
				showPainel+= "*          "+caixaAsterisco[3][8]+"          *";
			
			}else if(caixaAsterisco[colunaAste2][0] == null) {
				caixaAsterisco[colunaAste2][0] = "*                      	*";
				
				showPainel+="\n";
				showPainel+= caixaAsterisco[colunaAste2][0];
				
				
				
					
			
		    }
			}
		
		
				//Parte inferior
			showPainel+="\n";
			
		for(int linhaAste2 = 0; linhaAste2 < 15 ; linhaAste2++) 
			if(caixaAsterisco[4][linhaAste2] == null) {
				caixaAsterisco[4][linhaAste2] = "*";
				
				showPainel+= caixaAsterisco[4][linhaAste2];
			}
	
				
				
		//Mostrando a caixa
		JOptionPane.showMessageDialog(null, showPainel);
	}

}

