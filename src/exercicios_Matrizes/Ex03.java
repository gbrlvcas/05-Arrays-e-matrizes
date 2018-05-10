package exercicios_Matrizes;


import javax.swing.JOptionPane;

public class Ex03 {

	public static void main(String[] args) {
		
		//Variaveis inicias
		
		int[][] numeros = new int [2][3];
		int contador = 1;
		String showResult = "**** Resultado dos numeros digitados ****\n\n";
	
		
		
		//Solicitando números ao cliente
		
		for(int linha = 0 ; linha < 2 ; linha++){
			for(int coluna = 0 ; coluna < 3 ; coluna++){
				
				numeros[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Digite uma sequencia de 6 números: "+contador+" de 6"));
					contador++;
					
					showResult+= numeros[linha][coluna]+" ";
					
				
			}
			
			showResult+="\n";
			
		}
		
		showResult+="\n----------------\n";
		
		
		//Invertendo os numeros digitados pelo cliente
		
		for(int coluna = 0 ; coluna < 3 ; coluna++){
			for(int linha = 0 ; linha < 2 ; linha++){
				
				showResult+= numeros[linha][coluna]+" ";
			
				
			}
				showResult+="\n";
		}
			
		JOptionPane.showMessageDialog(null, showResult);
		

	}

}
