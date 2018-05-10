package exemplos_Arrays;

import javax.swing.JOptionPane;

public class limiteArray {
	
		public static void main(String[] args) {
			
			//Vetor
			int[] idades = new int[3];
			
			//Obter dados
			for(int indice = 0; indice < idades.length; indice++) {
				idades [indice] = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
						
			}
			
			//Exibir o número
			for(int indice : idades) {
				//System.out.println(indice);
				
				System.out.println(indice >= 18 ? "Aprovado" : "Reprovado");
				
			}
			
			
			
			
		}

}
