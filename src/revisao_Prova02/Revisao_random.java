package revisao_Prova02;

import java.util.Random;

import javax.swing.JOptionPane;

public class Revisao_random {

	public static void main(String[] args) {
		
		
		//Variaveis
		Random gerarNumero = new Random();
		int confereNum = 0;
		int[] guardaNum = new int[5];
		int contador = 0;
		boolean numRepete = false;
		String mostraNum = "**** Menu de numeros ****\n";
		
		
		//Formula Anti-Cabelo 
		for (int i = 0; i < 5 ; i++) {
			guardaNum[i] = -999;
		}
		
		
		//Laço principal
		
		do{	
			numRepete = false;
			
		confereNum = gerarNumero.nextInt(21);
		
		for(int analisa = 0 ; analisa < 5 ; analisa++){
			if(guardaNum[analisa] == confereNum){
				numRepete = true;
				break;
				
			}
		}
		
		if(numRepete == false){
			guardaNum[contador] = confereNum;
			contador++;
		}
		
		
		
		}while(contador < 5);
		
		//Mostrar numeros
		for(int mostrar = 0 ; mostrar < 5 ; mostrar++){
			mostraNum+= guardaNum[mostrar]+"\n";
		}
		
		JOptionPane.showMessageDialog(null, mostraNum);
		
		
		
	}

}
