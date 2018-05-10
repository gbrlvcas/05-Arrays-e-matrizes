package exercicios_Arrays;

import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {
		
		
		
		
		//Variaveis
		int[] solicitaNum = new int [15];
		int soma = 0, media = 0, medIM = 0, numMaior = 0, numPar = 0, numImpar = 0;
		
			//Variaveis para numeros negativos/neutros/posivitos
			int numNeg = 0, numNeu = 0, numPos = 0;
		
		
		
		//Solicitando para o usuario digitar os numeros
		
		for(int i = 0 ; i < 15 ; i++){
		
		solicitaNum[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite uma sequencia de números "+(i+1)+" de 15"));
		
		
		}
		
		
		
		
		//Soma dos valores
		for(int calc = 0 ; calc < 15 ; calc++){
			
			soma = soma + solicitaNum[calc];
					
		}
		
		//Média dos numeros
		media = soma / solicitaNum.length;
		
		//Numeros maiores ou iguais a media
		for(int calc2 = 0; calc2 < solicitaNum.length ; calc2++){
			
			if(solicitaNum[calc2] >= media){
				medIM++;
		}
			
		}
		
		//Quantidade de números negativos/neutros/positivos
		
		for(int calc3 = 0; calc3 < solicitaNum.length ; calc3++){
			
			if(solicitaNum[calc3] < 0){
				numNeg++;
				
			}else if(solicitaNum[calc3] == 0){
				numNeu++;
				
			}else if(solicitaNum[calc3] > 0 ){
				numPos++;
			}
			
			
		}
		
		//Maior número
		for(int calc4 = 0 ; calc4 < solicitaNum.length ; calc4++){
			if(solicitaNum[calc4] > numMaior){
				numMaior = solicitaNum[calc4];
			}
			
			
		}
		
		
		//Variavel do numero menor
		int numMenor = numMaior;
		
		//Menor nuúmero
		for (int calc5 = 0 ; calc5 < solicitaNum.length ; calc5++){
			if(numMenor > solicitaNum[calc5]){
				numMenor = solicitaNum[calc5];
			}
			
		}
		
		//Numeros pares e impares
		for(int calc6 = 0 ; calc6 < solicitaNum.length ; calc6++) {
			if(solicitaNum[calc6] % 2 == 0 ){
				numPar++;
		}else {
			numImpar++;
			}
		}
		
		
		JOptionPane.showMessageDialog(null,"A soma dos números digitados é: "+soma);
		JOptionPane.showMessageDialog(null,"A média dos números digitados é: "+media);
		JOptionPane.showMessageDialog(null,"A numeros iguais/maiors que a média é: "+medIM);
		JOptionPane.showMessageDialog(null, "Negativos: "+numNeg+"\nNeutros: "+numNeu+"\nPositivos: "+numPos);
		JOptionPane.showMessageDialog(null, "O maior número digitado é: "+numMaior);
		JOptionPane.showMessageDialog(null, "O menor número digitado é: "+numMenor);
		JOptionPane.showMessageDialog(null, "Numeros Pares: "+numPar+"\nNumeros Impares: "+numImpar);
		
		
		
		
		
	

}
	
}
