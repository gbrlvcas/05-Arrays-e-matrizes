package revisao_Prova02;

import javax.swing.JOptionPane;

public class Ex03_Arrays {
	public static void main(String[] args) {
		
		//Variaveis
		int[] numeros = new int [5];
		String analise = "**** Analisando numeros ****\n\n";
		boolean existe10 = false;
		
		
		
		//Solicitando a sequencia de numeros ao cliente
		for(int contador = 0 ; contador < 5 ; contador++){
			numeros[contador] = Integer.parseInt(JOptionPane.showInputDialog("Digite uma sequencia de 5 numeros: "+(contador+1)+" de 5"));
				
				if(numeros[contador] == 10) {
					analise+= numeros[contador]+" <== esta na "+(contador+1)+"ª posicao do vetor";
					analise+="\n";
				}else{
					analise+= numeros[contador];
					analise+="\n";
				}
		}
		
		//Analisando para ver se existe o numero 10
		for(int analisa = 0 ; analisa < 5 ; analisa++) {
			if(numeros[analisa] == 10){
				existe10 = true;
				
			}else{
				existe10 = false;
			}
		}
			

		// Mostrando mensagem ao cliente
		if (existe10 == true) {
			JOptionPane.showMessageDialog(null, analise);
		} else {
			JOptionPane.showMessageDialog(null, analise + "\n\nNão existe número 10 nesta lista");
		}

	}
}
