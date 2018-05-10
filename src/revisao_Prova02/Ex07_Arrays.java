package revisao_Prova02;

import javax.swing.JOptionPane;

public class Ex07_Arrays {

	public static void main(String[] args) {
		
		//Variaveis
		
		int analisaNum;
		int contador = 0;
		int[] numeros = new int [7];
		boolean numRepetido = false;
		String resultado = "**** Resultado ****\n\n"
		
;		for(int num = 0 ; num < 7 ; num++) {
			numeros[num] = -999;
		}
		
		//Solicitando numeros para verificar se o mesmo ja existe no vetor
		do {
				numRepetido = false;
		analisaNum = Integer.parseInt(JOptionPane.showInputDialog("Digite uma sequencia de 7 numeros "+(contador+1)+" de 7"));
		
			for(int analisa = 0 ; analisa < 7 ; analisa++) {
				if(analisaNum == numeros[analisa]) {
					JOptionPane.showMessageDialog(null, "Você ja digitou esse número\ndigite um número diferente");
					numRepetido = true;
					break;
				}
			}
			
			if(numRepetido == false) {
			for(int add = 0 ; add < 7 ; add++) {
				if(numeros[add] == -999) {
				numeros[add] = analisaNum;
				contador++;
				
				
				if(contador == 7) {
					resultado+=numeros[add]+".";
				}else {
					resultado+=numeros[add]+", ";
				}
				break;
				}
			}
			
			}
			
		}while(contador < 7);
				
			JOptionPane.showMessageDialog(null, resultado);
		
	}
	
}


