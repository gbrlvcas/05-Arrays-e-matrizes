package exercicios_Arrays;

import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {
		
		//Variaveis
		
		int[] numeros = new int [10];
		
		//Perguntando ao cliente
		for(int i = 0 ; i < numeros.length ; i++){
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um sequencia de numeros "+(i+1)+" de 10"));
		}

			String numerosInvert = "";
		
		//Mostrando os numeros ao contrario
		for(int i = numeros.length - 1; i >= 0; i--){
			numerosInvert+= numeros[i]+"\n";
		}
		
		JOptionPane.showMessageDialog(null, numerosInvert);
	}

}
