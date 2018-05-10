package exercicios_Arrays;

import javax.swing.JOptionPane;

public class Exercicio03{

	public static void main(String[] args) {
		
		//Variaveis
		
		int[] numeros = new int [5];
		int num10 = 10;
		
		
		//Solicitando numeros ao cliente
		for (int i = 0 ; i < numeros.length ; i++){
			
			numeros [i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um sequencia de numeros "+(i+1)+" de 5"));
				
			}
			
		String texto = "";
		
		for(int i = 0 ; i < 5; i++){
			if(numeros[i] == num10){
				texto+= "Existe um 10 na "+(i+1)+"º posição\n";
			}
			
			}
		
		for(int i = 0; i == 0; i++){	
		if(numeros[i] != num10){
			texto+="Não existe numero 10";
		}
		}
		
		JOptionPane.showMessageDialog(null, texto);
		
		
		
		
		
	}
}