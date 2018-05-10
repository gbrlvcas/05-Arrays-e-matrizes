package exercicios_Matrizes;

import javax.swing.JOptionPane;

public class Ex02 {

	public static void main(String[] args) {
			
		//Variaveis principais
		
		int[][] numeros = new int [5][5];
		int contador = 1;
		
		//Variaveis de calculo
		
		int somaLinha = 0;
		int somaColuna = 0;
		int somaDiagpri = 0;
			int contDiagpri = 0;
		int somaDiagsec = 0;
			int contDiagsec = 4;
			int contDiagsec2 = 0;
		int somaMatriz = 0;
		String showResult;
		
		
// ---------------------------------------------------------------------------------------------------------------------
		
		//Inicio do painel de calculos
		showResult = "*** Calculos dos valores digitados ****\n\n";
		
		
		//Inicio do for - Solicitando para que o cliente digite os 25 numeros
		
		for(int linha = 0 ; linha < 5 ; linha++){
			for(int coluna = 0 ; coluna < 5 ; coluna++){
				
				numeros[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Digite uma sequencia de 25 numeros: "+contador+" de 25"));
					contador++;
					
					
					
					//Inicio dos calculos
					
					
						//Soma dos numeros na quarta linha
						if(linha == 3){
							somaLinha = somaLinha + (numeros[linha][coluna]);
						}
						
						//Soma dos numeros na segunda coluna
						if(coluna == 1){
						somaColuna = somaColuna + numeros[linha][coluna];
						}
						
						//Soma dos numeros da diagonal principal
						if(linha == contDiagpri && coluna == contDiagpri){
							somaDiagpri = somaDiagpri + numeros[linha][coluna];
								contDiagpri++;
						}
						
						
						//Somas dos numeros da diagonal secundaria
						if(linha == contDiagsec2 && coluna == contDiagsec){
							somaDiagsec = somaDiagsec + numeros[linha][coluna];
								contDiagsec--;
								contDiagsec2++;
						}
						
						//Soma de todos numeros da matriz
						somaMatriz = somaMatriz + numeros[linha][coluna];
						
						//Mostrar toda matriz
						
						showResult+= numeros[linha][coluna]+" ";
						
						
						
				}
							showResult+="\n";
			
			}
		
					showResult+="Soma quarta linha: "+somaLinha+"\n";
					showResult+="Soma segunda coluna: "+somaColuna+"\n";
					showResult+="Soma diagonal principal: "+somaDiagpri+"\n";
					showResult+="Soma diagonal secundaria: "+somaDiagsec+"\n";
					showResult+="Soma matriz: "+somaMatriz;

		

		JOptionPane.showMessageDialog(null, showResult);

	}
}
