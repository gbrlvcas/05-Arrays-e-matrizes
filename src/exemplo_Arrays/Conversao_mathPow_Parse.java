package exemplo_Arrays;

public class Conversao_mathPow_Parse {

	public static void main(String[] args) {
		
		String[] dados = new String[2];
		
		dados[0] = "70";
		dados[1] = "1.80";
		
		System.out.println(Integer.parseInt(dados[0]) / Math.pow(Double.parseDouble(dados[1]),2));
		

	}

}
