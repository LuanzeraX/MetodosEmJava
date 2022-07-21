import java.util.Scanner;

public class Exemplo01 {
	
	//static= pode ser usado por outras subrotinas
	static 	Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	//chamada procedimento
		verificar();
	
	
	
	
	}//Fecha Main
	
	
	//Procedimento = nao tem retorno
	public static void verificar() {
		
		int numero =0;
		
		System.out.println("Digite um número: ");		
		numero= entrada.nextInt();
		
		if(numero %2 ==1) {
			System.out.println("Ímpar");
			
		}else {
			System.out.println("Par");
		}
		
		
		
	}
	
	
	

}
