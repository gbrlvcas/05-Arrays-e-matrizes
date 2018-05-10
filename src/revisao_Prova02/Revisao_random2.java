package revisao_Prova02;

import java.util.Random;

import javax.swing.JOptionPane;

public class Revisao_random2 {

	public static void main(String[] args) {
		
		//Variaveis
		
		String[][] nomeIdade = {{"Jagunço","23"},
								{"Martiria","50"},
								{"Mascoco","10"},
								{"Lidjalma","30"},
								{"Marambina","57"},
								{"Lorombrin","18"},
								{"Bundacio","35"},
								{"Martereno","40"},
								{"Gambrina","30"},
								{"Jacolomeu","78"}};
		
		int random;
		Random posicao = new Random();
		int[] guardaRandom = new int[3];
		boolean repetido = false;
		int contador = 0;
		
		//Formula anti-cabelo
		for(int altera = 0 ; altera < 3 ; altera++){
			guardaRandom[altera] = -999;
		}
		
		//Gerando random
		do{
			repetido = false;
		
		random = posicao.nextInt(10);
		
			//Analisando random para ver se não esta repetindo
		for(int analisa = 0; analisa < 3 ; analisa++){
			if(random == guardaRandom[analisa]){
				repetido = true;
				break;
				
			}
		}
								
		if(repetido == false){
			guardaRandom[contador] = random;
			contador++;
		}
		
		}while(contador < 3);
		
		//Exibindo os nomes
		
		String resultado = "**** Pessoas escolhidas ****\n\n";
			
			for(int mostra = 0 ; mostra < 3 ; mostra++){
				resultado+= (mostra+1)+") "+nomeIdade[guardaRandom[mostra]][0]+" "+nomeIdade[guardaRandom[mostra]][1]+"\n";
			}
		
		JOptionPane.showMessageDialog(null, resultado);
		
		

	}

}
