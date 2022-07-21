import java.util.Scanner;

public class Exercicio03 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String [] nomes = new String [4];
		double[] salarios = new double [4];
		int [] tempo = new int [4];
		
		
		for(int i=0;i<4;i++) {
			
			System.out.println("Digite o nome: ");
			nomes[i]= sc.next();
			System.out.println("Digite o salário: ");
			salarios[i]= sc.nextDouble();
			System.out.println("Digite o tempo: ");
			tempo[i]=sc.nextInt();
			
		}
		
		String [] situacao = verifica(salarios, tempo);
		
		relatorio(nomes, situacao);
		

	}//main
	
	
	public static String [] verifica(double salarios[],int [] tempo) {
		
		
		String [] situacao = new String [4];
		
		for(int i=0; i<4; i++) {
			if(salarios[i]<700 || tempo[i]>3) {
				
			}
		}
		
		
		
		
		return situacao;
	}
	
	
	public static void relatorio(String [] nomes, String [] situacao) {
		
		for(int i=0;i<4;i++) {
			System.out.println("Funcionário "+nomes[i]+"-");
		}
		
	}
	
	

}
