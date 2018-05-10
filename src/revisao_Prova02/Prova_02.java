package revisao_Prova02;

import java.util.Random;

import javax.swing.JOptionPane;

public class Prova_02 {

	public static void main(String[] args){
		
		//Variaveis de nome
		
		String validaNome;
		String[] nomes = new String [5];
		int contaNome = 0;
		boolean nomeRepete = false;
		
		//Variaveis de questoes
		
		String[][] questoes = new String[30][5];
		String mostraQuestao = "";
		String[] questaoCerta = new String [30];
		String[] resposta = new String [30];
		int contador = 0;
		int[] jogo = new int [30];
		int valide;
		Random selecione = new Random();
		boolean repetido = false;
		int[] acertos = new int[10];
		int[] erros = new int[10];
		int errou = 0;
		int acertou = 0;
		int contAe = 0;
		
		//Variaveis do jogo
		int continuaJogo;
		boolean sairJogo = false;
		
		//Variaveis de ranking
		int posicaoRank = 1;
		String guardaNome;
		int guardaNumero;
		
		
		questoes[0][0] = "Quem era o homem mais sedutor do mundo?";
		questoes[0][1] = "a)Dom Juan";
		questoes[0][2] = "b)Dom Ant�nio";
		questoes[0][3] = "c)Dom Marco";
		questoes[0][4] = "d)Dom Carlos";
		questaoCerta[0] = "a";

		questoes[1][0] = "De quantos anos � constitu�do um s�culo?";
		questoes[1][1] = "a)50";
		questoes[1][2] = "b)100";
		questoes[1][3] = "c)1000";
		questoes[1][4] = "d)1500";
		questaoCerta[1] = "b";

		questoes[2][0] = "Qual � o coletivo de c�es?";
		questoes[2][1] = "a)Matilha";
		questoes[2][2] = "b)Rebanho";
		questoes[2][3] = "c)Cardume";
		questoes[2][4] = "d)Manada";
		questaoCerta[2] = "a";

		questoes[3][0] = "Segundo a B�blia, em que rio Jesus foi batizado por Jo�o Batista?";
		questoes[3][1] = "a)Rio Nilo";
		questoes[3][2] = "b)Rio Sena";
		questoes[3][3] = "c)Rio Reno";
		questoes[3][4] = "d)Rio Jord�o";
		questaoCerta[3] = "d";

		questoes[4][0] = "Qual � a maior floresta do planeta?";
		questoes[4][1] = "a)Negra";
		questoes[4][2] = "b)Sherwood";
		questoes[4][3] = "c)Tijuca";
		questoes[4][4] = "d)Amaz�nica";
		questaoCerta[4] = "d";

		questoes[5][0] = "Qual � o naipe do baralho que tem o desenho de cora��o?";
		questoes[5][1] = "a)Ouros";
		questoes[5][2] = "b)Paus";
		questoes[5][3] = "c)Copas";
		questoes[5][4] = "d)Espadas";
		questaoCerta[5] = "c";
		
		questoes[6][0] = "Qual atriz estrelou no filme: 'A lagoa azul'?";
		questoes[6][1] = "a)Alicia Silverstone";
		questoes[6][2] = "b)Brooke Shields";
		questoes[6][3] = "c)Julia Roberts";
		questoes[6][4] = "d)Jessica Lange";
		questaoCerta[6] = "b";

		questoes[7][0] = "Qual casal foi expulso do Para�so?";
		questoes[7][1] = "a)Sans�o de Dalila";
		questoes[7][2] = "b)Jos� e Maria";
		questoes[7][3] = "c)Sara e Abra�o";
		questoes[7][4] = "d)Ad�o e Eva";
		questaoCerta[7] = "d";

		questoes[8][0] = "Segundo os contos, qual animal ao ser beijado se transforma em pr�ncipe?";
		questoes[8][1] = "a)Cavalo";
		questoes[8][2] = "b)C�o";
		questoes[8][3] = "c)Gato";
		questoes[8][4] = "d)Sapo";
		questaoCerta[8] = "d";

		questoes[9][0] = "Qual � o santo que s� acreditou vendo?";
		questoes[9][1] = "a)Santo Ant�nio";
		questoes[9][2] = "b)S�o Judas Tadeu";
		questoes[9][3] = "c)S�o Pedro";
		questoes[9][4] = "d)S�o Tom�";
		questaoCerta[9] = "d";

		questoes[10][0] = "Qual � o fruto conhecido no nordeste do Brasil como 'jerimum'?";
		questoes[10][1] = "a)Caju";
		questoes[10][2] = "b)Ab�bora";
		questoes[10][3] = "c)Chuchu";
		questoes[10][4] = "d)Coco";
		questaoCerta[10] = "b";

		questoes[11][0] = "Em qual parte do corpo humano s�o implantadas as 'pontes de safena'?";
		questoes[11][1] = "a)Est�mago";
		questoes[11][2] = "b)Intestino";
		questoes[11][3] = "c)Pulm�o";
		questoes[11][4] = "d)Cora��o";
		questaoCerta[11] = "d";

		questoes[12][0] = "Como � conhecido o jogador Edmundo?";
		questoes[12][1] = "a)Tigr�o";
		questoes[12][2] = "b)Gatinho";
		questoes[12][3] = "c)Animal";
		questoes[12][4] = "d)Cobra";
		questaoCerta[12] = "c";

		questoes[13][0] = "Na literatura, quem foi o criador da boneca Em�lia?";
		questoes[13][1] = "a)Monteiro Lobato";
		questoes[13][2] = "b)Maur�cio de Souza";
		questoes[13][3] = "c)Walt Disney";
		questoes[13][4] = "d)Jorge Amado";
		questaoCerta[13] = "a";

		questoes[14][0] = "Quem � o primeiro substituto do Presidente?";
		questoes[14][1] = "a)Veriador";
		questoes[14][2] = "b)Vice-presidente";
		questoes[14][3] = "c)Senador";
		questoes[14][4] = "d)Deputado";
		questaoCerta[14] = "b";

		questoes[15][0] = "Segundo o romance, que animal era 'Moby Dick'?";
		questoes[15][1] = "a)Tubar�o";
		questoes[15][2] = "b)Golfinho";
		questoes[15][3] = "c)Polvo";
		questoes[15][4] = "d)Baleia";
		questaoCerta[15] = "d";

		questoes[16][0] = "Que animal � o Pateta?";
		questoes[16][1] = "a)Cavalo";
		questoes[16][2] = "b)Burro";
		questoes[16][3] = "c)Cachorro";
		questoes[16][4] = "d)Raposa";
		questaoCerta[16] = "c";

		questoes[17][0] = "Em qual cidade est� o Cristo Redentor do Corcovado?";
		questoes[17][1] = "a)Rio de Janeiro";
		questoes[17][2] = "b)S�o Paulo";
		questoes[17][3] = "c)Curitiba";
		questoes[17][4] = "d)Belo Horizonte";
		questaoCerta[17]= "a";

		questoes[18][0] = "Quem � conhecido como o 'playboy brasileiro'?";
		questoes[18][1] = "a)Jo�ozinho Trinta";
		questoes[18][2] = "b)Zeca Pagodinho";
		questoes[18][3] = "c)Chiquinho Scarpa";
		questoes[18][4] = "d)Chico Buarque";
		questaoCerta[18] = "c";

		questoes[19][0] = "Quantos cent�metros equivalem a um metro?";
		questoes[19][1] = "a)10";
		questoes[19][2] = "b)100";
		questoes[19][3] = "c)1000";
		questoes[19][4] = "d)10000";
		questaoCerta[19] = "b";

		questoes[20][0] = "Qual � o nome do macho da abelha?";
		questoes[20][1] = "a)Zang�o";
		questoes[20][2] = "b)Abelh�o";
		questoes[20][3] = "c)Rufi�o";
		questoes[20][4] = "d)Pulg�o";
		questaoCerta[20] = "a";

		questoes[21][0] = "Qual � o inseto que transmite a doen�a de Chagas?";
		questoes[21][1] = "a)Abelha";
		questoes[21][2] = "b)Rato";
		questoes[21][3] = "c)Barbeiro";
		questoes[21][4] = "d)Pulga";
		questaoCerta[21] = "c";

		questoes[22][0] = "Qual � o nome do conjunto de dados sobre uma popula��o?";
		questoes[22][1] = "a)Censo";
		questoes[22][2] = "b)Montagem";
		questoes[22][3] = "c)Marca��o";
		questoes[22][4] = "d)Registro";
		questaoCerta[22] = "a";

		questoes[23][0] = "Qual ator imortalizou o personagem 'Z� Bonitinho'?";
		questoes[23][1] = "a)Roni C�cegas";
		questoes[23][2] = "b)Jorge Loredo";
		questoes[23][3] = "c)Davi Pinheiro";
		questoes[23][4] = "d)Arnaud Rodrigues";
		questaoCerta[23] = "b";

		questoes[24][0] = "Qual a cantora conhecida como 'A rainha dos caminhoneiros'?";
		questoes[24][1] = "a)Roberta Miranda";
		questoes[24][2] = "b)Maria Beth�nia";
		questoes[24][3] = "c)Sula Miranda";
		questoes[24][4] = "d)Rita Cadillac";
		questaoCerta[24] = "c";

		questoes[25][0] = "Qual � o nome da missa rezada no Natal?";
		questoes[25][1] = "a)Campal";
		questoes[25][2] = "b)Do Galo";
		questoes[25][3] = "c)Do Vaticano";
		questoes[25][4] = "d)Do S�timo Dia";
		questaoCerta[25] = "b";

		questoes[26][0] = "Qual � a orix� conhecida como 'A rainha do mar'?";
		questoes[26][1] = "a)Mam�e Oxum";
		questoes[26][2] = "b)Iemanj�";
		questoes[26][3] = "c)Ax�";
		questoes[26][4] = "d)Ians�";
		questaoCerta[26] = "b";

		questoes[27][0] = "No julgamento de Jesus, quem disse a frase: 'Eu lavo minhas m�os'?";
		questoes[27][1] = "a)Barrab�s";
		questoes[27][2] = "b)Tib�rio";
		questoes[27][3] = "c)P�ncio Pilatos";
		questoes[27][4] = "d)Judas";
		questaoCerta[27] = "c";

		questoes[28][0] = "O que est� no centro da Terra?";
		questoes[28][1] = "a)Manto";
		questoes[28][2] = "b)N�cleo";
		questoes[28][3] = "c)Hidrosfera";
		questoes[28][4] = "d)Litosfera";
		questaoCerta[28] = "b";

		questoes[29][0] = "Qual � o animal que representa o signo de �ries?";
		questoes[29][1] = "a)Touro";
		questoes[29][2] = "b)Le�o";
		questoes[29][3] = "c)Caneiro";
		questoes[29][4] = "d)Bode";
		questaoCerta[29] = "c";
		
		
		
//-----------------------------------------------------------------------------------------------------------------
		
		do{
		
		//Solicitando nome do jogador
		do{
			nomeRepete = false;
			
		validaNome = JOptionPane.showInputDialog("Digite o seu nome");
		
		//Analisar se o nome ja existe no vetor
		for(int analisa = 0 ; analisa < 5 ; analisa++){
			if(validaNome.equals(nomes[analisa])){
				JOptionPane.showMessageDialog(null, "Este nome ja existe\nPor favor, digite outro");
				nomeRepete = true;
				break;
			}
		}
		
		//Caso o nome n�o seja repetido
		if(nomeRepete == false){
			nomes[contaNome] = validaNome;
			
			
		}
		
	}while(nomeRepete == true);
		

//-----------------------------------------------------------------------------------------------------------------
		
		
		//Formula cabelo
		for(int i = 0 ; i < 30; i++){
			jogo[i] = -999;
		}
		
		//Gerando random
		do {
			repetido = false;

			valide = selecione.nextInt(30);

			// Analisando random para ver se n�o esta repetindo
			for (int analisa = 0; analisa < 30; analisa++) {
				if (valide == jogo[analisa]) {
					repetido = true;
					break;

				}
			}

			if (repetido == false) {
				jogo[contador] = valide;
				contador++;
			}

		} while (contador < 30);
		
		
		
		
		//Mostrando pergunta ao cliente

		
		for(int mostra = 0 ; mostra < 10 ; mostra++){
			
			resposta[mostra] = JOptionPane.showInputDialog(questoes[jogo[mostra]]);
			
		}
		
		//Analisando os acertos e erros
		contador = 0;
		
		for(int analisa = 0 ; analisa < 10 ; analisa++){
			
		if(resposta[analisa].equals(questaoCerta[analisa])){
			acertos[contAe]++;
			acertou++;
		}else{
			erros[contAe]++;
			errou++;
		}
		
		}
		
		
		//Mostrando o resultado ao jogador
		
		String resultado = "**** Resultado ****\n\n";
			resultado+="Ola,"+nomes[contaNome]+"\n";
			resultado+="Voc� acertou: "+acertou+" quest�es\n";
			resultado+="Voc� errou: "+errou+" quest�es";
		
			JOptionPane.showMessageDialog(null, resultado);
			
			
		
			continuaJogo = JOptionPane.showConfirmDialog(null, "Deseja continuar no jogo?","",0);
			
			if(continuaJogo == 0){
				sairJogo = true;
				contaNome++;
				contAe++;
				errou = 0;
				acertou = 0;
				
			}else{
				sairJogo = false;
			}
			
			if(contaNome == 5){
				JOptionPane.showMessageDialog(null, "Excedeu o limite de 5 jogadores");
				sairJogo = false;
			}
			
		
		}while(sairJogo == true);
		
		
		//M�todo bolha - Caso haja mais de um vencedor
		
		
		if(contaNome > 0) {
			for(int i1 = 0 ; i1 < 9 ; i1++) {
				for(int i2 = i1+1 ; i2 < 10 ; i2++) {
					if(acertos[i2] > acertos[i1]) {
						guardaNumero = acertos[i2];
						acertos[i2] = acertos[i1];
						acertos[i1] = guardaNumero;
						
						guardaNome = nomes[i2];
						nomes[i2] = nomes[i1];
						nomes[i1] = guardaNome;
					}
					
				}
			}
		}
		
		
		
		
		//Gerando o rank
		
		String rank = "**** Ranking de jogadores ****\n\n";
		
				if(contaNome == 0) {
					JOptionPane.showMessageDialog(null, "Houve apenas um participante");
				}else{
					for(int ranking = 0 ; ranking < 5 ; ranking++) {
						if(nomes[ranking] != null) {
							rank+= (posicaoRank)+"� Lugar: "+nomes[ranking]+" - "+acertos[ranking]+" acertos\n";
					posicaoRank++;

				}

			}
		}
				//Mostrando o ranking
				JOptionPane.showMessageDialog(null, rank);
	}
}
