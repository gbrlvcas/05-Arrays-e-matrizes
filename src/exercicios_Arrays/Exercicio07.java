package exercicios_Arrays;

import javax.swing.JOptionPane;

public class Exercicio07 {

	public static void main(String[] args) {
		
		//Variaveis
		
		int[] numeros = new int [7];
		int confirmaNum;
		int contador = 0;	
		boolean validaRepet = false;
		String mostraNumero = "";
		
		
		
		//Solicitar numeros ao cliente
		
		do {
		
		confirmaNum = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"+(contador+1)+" de 7"));
		
				for (int i = 0 ; i < 7 ; i++) {
					validaRepet = false;
					if(confirmaNum == numeros[i]) {
						JOptionPane.showMessageDialog(null, "Digite um número diferente do que ja foi digitado");
						validaRepet = true;
						break;
					}
				}
				
				if(validaRepet == false) {
				for(int i2 = 0 ; i2 < 7 ; i2++) {
					
					if(numeros[i2] == 0) {
						numeros[i2] = confirmaNum;
						contador++;
						if(i2 == 6) {
							mostraNumero += confirmaNum+".";
						}else{
							mostraNumero += confirmaNum+",";
						}
						break;
					}
				}
				
				
				
				}
				
		}while(contador < 7);
		
		JOptionPane.showMessageDialog(null, mostraNumero);
		

		}
	}


