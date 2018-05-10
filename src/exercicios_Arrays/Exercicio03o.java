package exercicios_Arrays;

import javax.swing.JOptionPane;

public class Exercicio03o{

	public static void main(String[] args) {
		
		//Variaveis
		
		int[] numeros = new int [5];
		int num10 = 10;
		
		
		//Solicitando numeros ao cliente
		for (int i = 0 ; i < numeros.length ; i++){
			
			numeros [i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um sequencia de numeros "+(i+1)+" de 5"));
				
			}
		
		//Variavel boolean - usado para se caso o valor do for nao seja o encontrado
			//avisar que não tem, sem a mesma mensagem ser repetida
		boolean existe10 = false;
		
		//Texto
		String texto = "";
		
		for(int i = 0 ; i < 5; i++){
			if(numeros[i] == num10){
				texto+= "Existe um 10 na "+(i+1)+"º posição\n";
				existe10 = true;
				
			}
			
			}
		

			if(existe10 == true){
				JOptionPane.showMessageDialog(null, texto);
			}else{
				JOptionPane.showMessageDialog(null, "O numero 10 não existe");
			}
		}
		
		
		
		
		
		
		
		
	}
