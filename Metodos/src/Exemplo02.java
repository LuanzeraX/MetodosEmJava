import java.util.Scanner;

public class Exemplo02 {

	static 	Scanner entrada = new Scanner(System.in);
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao=0;
		
		
		while(opcao != 5) {
			
		
		
		
		
		 System.out.println("[1] - Adi��o");
		 System.out.println("[2] - Subtra��o");
		 System.out.println("[3] - Multiplica��o");
		 System.out.println("[4] - Divis�o");
		 System.out.println("[5] - Sair");
		 System.out.println("Digite a op��o:");
		 opcao=entrada.nextInt();
		 
		 switch(opcao) {
		 case 1: adicao();
		 break;
		 case 2: subtracao();
		 break;
		 case 3: multiplicacao();
		 break;
		 case 4: divisao();
		 break;
		 case 5: System.exit(0);
		 break;
		 default: System.out.println("Op��o inv�lida - Tente novamente");
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 }
		 
		}//fecha while

	}//fecha main
	
	public static void adicao() {
		int a1=0, b1=0, r1=0;
		System.out.println("rotina adi��o");
		System.out.println("Digite o primeiro valor: ");
		a1=entrada.nextInt();
		System.out.println("Digite o segundo valor: ");
		b1= entrada.nextInt();
		
		r1=a1+b1;
		System.out.println("resultado da adi��o: "+r1);
	}
	
	public static void subtracao() {
		int a1=0, b1=0, r1=0;
		System.out.println("rotina subtra��o");
		System.out.println("Digite o primeiro valor: ");
		a1=entrada.nextInt();
		System.out.println("Digite o segundo valor: ");
		b1= entrada.nextInt();
		
		r1=a1-b1;
		System.out.println("resultado da subtra��o: "+r1);
		
		
		
		
	}
	
	public static void multiplicacao() {
		int a1=0, b1=0, r1=0;
		System.out.println("rotina  multiplica��o");
		System.out.println("Digite o primeiro valor: ");
		a1=entrada.nextInt();
		System.out.println("Digite o segundo valor: ");
		b1= entrada.nextInt();
		
		r1=a1*b1;
		System.out.println("resultado da  multiplica��o: "+r1);
		
		
	}
	
	public static void divisao() {
		int a1=0, b1=0, r1=0;
		System.out.println("rotina divis�o");
		System.out.println("Digite o primeiro valor: ");
		a1=entrada.nextInt();
		System.out.println("Digite o segundo valor: ");
		b1= entrada.nextInt();
		
		
		if(b1!=0) {
		
		r1=a1/b1;
		System.out.println("resultado da divis�o: "+r1);
		}else {
			System.out.println("Resultado: 0");
		}
		
		
	}
}
