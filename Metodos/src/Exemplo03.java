import java.util.Scanner;

public class Exemplo03 {

	static 	Scanner entrada = new Scanner(System.in);
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao=0;
		
		int a1=0, b1=0;
		System.out.println("Digite o primeiro valor: ");
		a1=entrada.nextInt();
		System.out.println("Digite o segundo valor: ");
		b1= entrada.nextInt();
		
		
		
		
		while(opcao != 5) {
			
		
		
		
		
		 System.out.println("[1] - Adição");
		 System.out.println("[2] - Subtração");
		 System.out.println("[3] - Multiplicação");
		 System.out.println("[4] - Divisão");
		 System.out.println("[5] - Sair");
		 System.out.println("Digite a opção:");
		 opcao=entrada.nextInt();
		 
		 switch(opcao) {
		 case 1: adicao(a1,b1);
		 break;
		 case 2: subtracao(a1,b1);
		 break;
		 case 3: multiplicacao(a1,b1);
		 break;
		 case 4: divisao(a1,b1);
		 break;
		 case 5: System.exit(0);
		 break;
		 default: System.out.println("Opção inválida - Tente novamente");
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 }
		 
		}//fecha while

	}//fecha main
	
	public static void adicao(int a1, int b1) {
	int r1=0;
		System.out.println("rotina adição");
		
		
		r1=a1+b1;
		System.out.println("resultado da adição: "+r1);
	}
	
	public static void subtracao(int a1, int b1) {
		int r1=0;
		System.out.println("rotina subtração");
		
		
		r1=a1-b1;
		System.out.println("resultado da subtração: "+r1);
		
		
		
		
	}
	
	public static void multiplicacao(int a1, int b1) {
		int r1=0;
		System.out.println("rotina  multiplicação");
		
		r1=a1*b1;
		System.out.println("resultado da  multiplicação: "+r1);
		
		
	}
	
	public static void divisao(int a1, int b1) {
		int r1=0;
		System.out.println("rotina divisão");
		
		
		
		if(b1!=0) {
		
		r1=a1/b1;
		System.out.println("resultado da divisão: "+r1);
		}else {
			System.out.println("Resultado: 0");
		}
		
		
	}
}
