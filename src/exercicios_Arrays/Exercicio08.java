package exercicios_Arrays;


import javax.swing.JOptionPane;

public class Exercicio08 {

	public static void main(String[] args) {
			
		
		//Variaveis
		
		String[] usuario = {"admin","peg","teste"};
		String[] senha = {"admin","1996","123"};
		String pedirUsuario, pedirSenha;
		boolean validaLogin = false;
		
		do{
			
			
			
			pedirUsuario = JOptionPane.showInputDialog("Digite o seu usuario");
			pedirSenha = JOptionPane.showInputDialog("Digite a sua senha");
			
			validaLogin = false;
			
			for(int i = 0; i < 3 ; i++){
			if((pedirUsuario.equals(usuario[i])) && pedirSenha.equals(senha[i])){
				validaLogin = false;
				break;
				
				
				
			}else{
				JOptionPane.showMessageDialog(null, "Usuario ou senha incorretos");
				validaLogin = true;
				break;
				
			}
			
			
			}
			
		}while(validaLogin == true);
	
		
		JOptionPane.showMessageDialog(null, "Usuario Logado com sucesso");
       
		
		
		
		
		

		
	}
	
}


