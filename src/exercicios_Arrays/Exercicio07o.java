package exercicios_Arrays;

import javax.swing.JOptionPane;

public class Exercicio07o {

	public static void main(String[] args) {
		
		
		//Variaveis
		
		int[] numeros = new int [7];
		int obterNumero = 0;
		int validaNumeros = 0;
		String mostraNumeros = "";
		boolean numRepet = false;
		String texto = "";
		
		
		//Laço principal
		do{
			
			//Obter número
			obterNumero = Integer.parseInt(JOptionPane.showInputDialog((validaNumeros+1)+"º número"));
			
			//Verficar se número existe no vetor
			numRepet = false;
			for (int i = 0 ; i < numeros.length ; i++){
				if(numeros[i] == obterNumero){
					JOptionPane.showMessageDialog(null, "Digite um número diferente do que ja foi digitado");
					numRepet = true;
					break;
				}
			}
			
			
			//Adicionar ao vetor
			if(numRepet == false){
			
			for (int i2 = 0; i2 < numeros.length ; i2++){
				if(numeros[i2] == 0){
					numeros[i2] = obterNumero;
					validaNumeros++;
					if(i2 == 6){
						mostraNumeros += obterNumero+".";
					}else{
						mostraNumeros += obterNumero+", ";
					}
					break;
					
				}
			}
			
			
			
			
			}
			
		}while(validaNumeros < 7);
		
		JOptionPane.showMessageDialog(null, mostraNumeros);
		
		
		
		
		
		

	}
}
