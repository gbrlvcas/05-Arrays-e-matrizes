package exercicios_Matrizes;

import javax.swing.JOptionPane;

public class Ex05 {

	public static void main(String[] args) {
		
		//Variaveis principais
		String[][] dados = new String [20][6];
		int contador = 0;
		int continuarIMC;
		boolean sairIMC = true;
		
			// 1) Variaveis de nome
			String nome = "";
			boolean erroNome = false;
		
			// 2) Variaveis de Sexo
		String mnSexo = "**** Menu de Sexo ****\n\n";
			mnSexo+="1) Masculino\n";
			mnSexo+="2) Feminino\n";
		int sexo = 3;
		double sexoMasc = 0;
		double sexoFemi = 0;
		boolean erroSexo = false;
		
			// 3) Variaveis de altura
			double altura = 0;
			boolean erroAltura = false;
			
			// 4) Variaveis de peso
			int peso = 0;
			boolean erroPeso = false;
			int p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0, p6 = 0, p7 = 0;
			
			// 5) Variaveis de IMC
			double numIMC;
			
//-------------------------------------------------------------------------------------------------------------------	
		
		//Inicio do laço
		do{
			
			sairIMC = false;

			// 1) Solicitando o nome do cliente
			
			do{
				erroNome = false;
				
				nome = JOptionPane.showInputDialog("Digite o seu nome");
				
					if(nome.equals("")){
						JOptionPane.showMessageDialog(null, "Não deixe esse campo em branco");
						erroNome = true;
					}
					
					if(erroNome == false) {
						dados[contador][0] = nome;
					}
					
			}while(erroNome == true);
			
			// 1) Fim da solicitação de nome do cliente
			
			
//-------------------------------------------------------------------------------------------------------------------
			
			
			// 2) Solicitando o sexo do cliente
			
			do{
				erroSexo = false;
				
				try{
			sexo = Integer.parseInt(JOptionPane.showInputDialog(mnSexo));
				}catch(Exception e){
					
					JOptionPane.showMessageDialog(null,"Digite apenas numeros");
					erroSexo = true;
					
				}
				
				if(erroSexo == false){
			if (sexo < 1 || sexo > 2) {
				JOptionPane.showMessageDialog(null, "Digite apenas 1 ou 2");
				erroSexo = true;
				
			}else if (sexo == 1) {
				dados[contador][1] = "Masculino";
				sexoFemi++;

			}else if (sexo == 2) {
				dados[contador][1] = "Feminino";
				sexoMasc++;
				
					}
				}
					
			}while(erroSexo == true);
			
			// 2) Fim da solicitação de sexo do cliente	
				
				
//-------------------------------------------------------------------------------------------------------------------		
			
			
			// 3) Solicitando a altura do cliente	
			do{
				erroAltura = false;
			
				try{
			altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura"));
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "Digite a altura no formato (0.00)\nE digite somente numeros");
					erroAltura = true;
				}
				
				if(erroAltura == false){
					dados[contador][2] = String.valueOf(altura);
				}
			
			}while(erroAltura == true);
			
			// 3) Fim a da solicitação de altura do cliente
			
			
//-------------------------------------------------------------------------------------------------------------------		
			
			
			// 4) Solicitando a altura do cliente
			do {
				erroPeso = false;
				
				try {
				peso = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu peso"));
				
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "Digite apenas números");
					erroPeso = true;
				}
				
				if(erroPeso == false);
				dados[contador][3] = String.valueOf(peso);
			
			}while(erroPeso == true);
			
			// 4) Fim da solicitação de peso do cliente
			
			
//-------------------------------------------------------------------------------------------------------------------			
		
			
			// 5) Calculo o IMC do cliente
			
			dados[contador][4] = String.valueOf(peso / Math.pow(altura, 2));
			
			// 5) Fim do calculo de IMC do cliente
			
			
//-------------------------------------------------------------------------------------------------------------------			
		
			
			// 6) Situação do cliente
			
			if(Double.parseDouble(dados[contador][4]) <= 17) {
				dados[contador][5] = "Muito abaixo do peso";
				p1++;
			}else if(Double.parseDouble(dados[contador][4]) <= 18.49) {
				dados[contador][5] = "Abaixo do peso";
				p2++;
			}else if(Double.parseDouble(dados[contador][4]) <= 24.99) {
				dados[contador][5] = "Peso normal";
				p3++;
			}else if(Double.parseDouble(dados[contador][4]) <= 29.99) {
				dados[contador][5] = "Acima do peso";
				p4++;
			}else if(Double.parseDouble(dados[contador][4]) <= 34.99) {
				dados[contador][5] = "Obesidade I";
				p5++;
			}else if(Double.parseDouble(dados[contador][4]) < 40.00) {
				dados[contador][5] = "Obesidade II (Severa)";
				p6++;
			}else if(Double.parseDouble(dados[contador][4]) >= 40.00) {
				dados[contador][5] = "Obesidade II (Mórbida)";
				p7++;
			}
			
			
			// 6) Fim da solicitação de peso do cliente
			
			
//-------------------------------------------------------------------------------------------------------------------			
			
			
			// 7) Verificando se existe mais alguem para cadastrar
			
			continuarIMC = JOptionPane.showConfirmDialog(null, "Existe outro cliente a cadastrar?","",0);
				if(continuarIMC == 0) {
					sairIMC = true;
				}
			
			// 7) Fim da verificação de cadastro
				
				contador++;
		}while(sairIMC == true);//Fim do laço
		
		
//-------------------------------------------------------------------------------------------------------------------			
		
		
		//8) Mostrando resultado final
		
		String resultado = "**** Calculadora de IMC ****\n\n";
				for(int rslt = 0 ; rslt < 20 ; rslt++) {
					if(dados[rslt][0] != null) {
						numIMC = Double.parseDouble(dados[rslt][4]);
					resultado+= "Nome: "+dados[rslt][0]+" - IMC: "+String.format("%.2f",numIMC)+" - Situação: "+dados[rslt][5];
					resultado+="\n";
					
					}		
			}
				
				resultado+="**** Quantidade e percentual por sexo****\n\n";
				resultado+= "Homem: "+String.format("%.2f",(sexoMasc))+" - "+String.format("%.2f",(sexoMasc / contador)*100)+"%\n";
				resultado+= "Mulher: "+String.format("%.2f",(sexoFemi))+" - "+String.format("%.2f",(sexoFemi / contador)*100)+"%\n\n";
				resultado+="**** Quantidade por situação ****\n\n";
					if(p1 != 0) {
						resultado+="Muito abaixo do peso: "+p1+" pessoas\n";
					}
					if(p2 != 0) {
						resultado+="Abaixo do peso: "+p2+" pessoas\n";
					}
					if(p3 != 0) {
						resultado+="Peso normal: "+p3+" pessoas\n";
					}
					if(p4 != 0) {
						resultado+="Acima do peso: "+p4+" pessoas\n";
					}
					if(p5 != 0) {
						resultado+="Obesidade I: "+p5+" pessoas\n";
					}
					if(p6 != 0) {
						resultado+="Obesidade II (Severa): "+p6+" pessoas\n";
					}
					if(p7 != 0) {
						resultado+="Obesidade III (Mórbida): "+p7+" pessoas\n";
					}
					
					
		JOptionPane.showMessageDialog(null, resultado);	
		
	}

}
