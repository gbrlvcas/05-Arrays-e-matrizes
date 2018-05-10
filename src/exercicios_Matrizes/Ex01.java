package exercicios_Matrizes;

import javax.swing.JOptionPane;

public class Ex01 {

	public static void main(String[] args) {
		
		//Variavel de numeros inteiros
		
		int[][] numeros = new int [5][6];
		int contaNumeros = 1;
		int numerosPares = 0;
		int numerosImpares = 0;
		int somaMedia = 0;
		int media = 0;
		int mediaMaiorigual = 0;
		String painel;
		
		
		for(int linha = 0 ; linha < 5 ; linha++){
			for(int coluna = 0; coluna <6 ; coluna++){
				
				numeros[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Digite uma sequencia de numeros inteiros "+contaNumeros+" de 30"));
					contaNumeros++;
					
					// Parte de calculos
					
						//Numeros pares e impares
					
						if(numeros[linha][coluna] % 2 == 0){
							numerosPares++;
						}else{
							numerosImpares++;
						}
					
						//Media dos numeros digitados
						
						somaMedia = somaMedia + numeros[linha][coluna];
						
						media = somaMedia / 30;
						
								
			}
			
		}
				
						//Inicio do painel de visualização
					
						painel = "**** Resultado dos numeros digitados ****\n\n";
						painel+= "Numeros pares: "+numerosPares+"\n";
						painel+= "Numeros impares: "+numerosImpares+"\n";
						painel+= "Media dos números: "+media+"\n";
		
		
						//Numeros maiores ou iguais a media - tem seu proprio vetor pois precisa comparar com a media com todos numeros somados
		
						for(int linhaM = 0 ; linhaM < 5 ; linhaM++){
							for(int colunaM = 0 ; colunaM < 6 ; colunaM++){
								if(numeros[linhaM][colunaM] > media){
									mediaMaiorigual++;
								}
								
							}
							
						}
				
						painel+="Maiores ou Iguais a média: "+mediaMaiorigual+"\n";
						
						
						// Mostrar a matriz de números
						
						for(int linhaM2 = 0 ; linhaM2 < 5 ; linhaM2++){
							for(int colunaM = 0 ; colunaM < 6 ; colunaM++){
											
								painel+=numeros[linhaM2][colunaM]+" ";
							}
							painel+="\n";
						}

						
						JOptionPane.showMessageDialog(null, painel);
						
	}

}
