import java.text.DecimalFormat;
import java.util.Scanner;

//Luan RM87153 1SIF

public class Exercicio06 {
	
	static Scanner sc = new Scanner(System.in);
	
	//global= pode acessar quando precisar 
	static DecimalFormat fPorc = new DecimalFormat("#,##0.00%");
	static String[] revistas = new String[] {"Veja","QuatroRodas","VC s/a"};
	static String[] estados = new String[] {"São Paulo", "Minas Gerais","Rio de Janeiro"," Espírito Santo"};

	static int totalMatriz=0;
	
	
	public static void main(String[] args) {
		
	
		int matriz[][] = carregamento();
		
		//a)
		letraA(matriz);
		
		//b)
		int somaEstado [] =letraB(matriz);
		
		exibirB(somaEstado);
		
		//c)
		letraC(matriz);
		
		
		//d)
		double [] valorEstados =letraD(matriz);
		
		System.out.println("");
		System.out.println("Letra D");
		for(int i=0;i<4;i++) {
			System.out.println(estados[i]+" : "+valorEstados[i]);
			
		}
	
	}//main
	
	public static int [][] carregamento(){
		
		int matriz[][] = new int [4][3];
		
		for(int e=0;e<4;e++) {
			System.out.println("");
			System.out.println("Estado : "+ estados[e]);
			System.out.println("");
			for(int r=0;r<3;r++) {
				System.out.println("Quantidade de Vendas da Revista "+ revistas[r]+": ");
				matriz[e][r]=sc.nextInt();
				totalMatriz+=matriz[e][r];
			}}
		return matriz;
		
		
		
		
		
	}

	//nao tem retorno
	public static void letraA(int matriz[][]) {
		
		int somaRevista=0;
		double perc=0;
		
		System.out.println("Letra A");
		System.out.println("Porcentagem");
		
		
		for(int r=0;r<3;r++) {//fixa
			
			somaRevista=0;
			for(int e=0;e<4;e++) {//movimenta
				somaRevista+=matriz[e][r];
				
				
			}
			
			
			perc=(double)somaRevista/totalMatriz;
			
			
			System.out.println(revistas[r]+" : "+fPorc.format(perc));
			
		}
		
	}


	
	public static int [] letraB(int matriz[][]) {
		
		
		int somaEstado [] = new int [4];
		
		for(int e=0;e<4;e++) {
			for(int r=0;r<3;r++) {
				somaEstado[e]+=matriz[e][r];
						
			}
		}
		
		return somaEstado;
		
		
	}
	
	//ta na criaçao do metodo ele é formal
	public static void exibirB(int somaEstado []) {
		
		int indMaior=0;
		int indMenor=0;
		int maior=0,menor=0;
		
		for(int i=0;i<4;i++) {
			
			if(i==0) {
				menor=somaEstado[i];
				indMenor=i;
			}else {
				
			
			
			if(somaEstado[i]>maior) {
				maior=somaEstado[i];
				indMaior=i;
			}
			if(somaEstado[i]<menor) {
				menor=somaEstado[i];
				indMenor=i;
			}
		}}
		
		System.out.println("");
		System.out.println("Letra B");
		System.out.println("Estado com melhor venda: "+ estados[indMaior]);
		System.out.println("Estado com pior venda: "+estados[indMenor]);
	}
	
	
	public static void letraC(int matriz[][]) {
		
		int maior=0, indMaior=0;
		
		System.out.println("");
		System.out.println("Letra C");
		
		for(int e=0;e<4;e++) {
			
			maior=0;
			
			for(int r=0;r<3;r++) {
				
				if(matriz[e][r]>maior) {
					maior=matriz[e][r];
					indMaior=r;
				}
				
			}
			System.out.println(estados[e]+" : "+ revistas[indMaior]);
		}
		
	}
	
	
	public static double [] letraD(int matriz [][]) {
		
		
		double [] valorEstados =  new double [4]; 
		double [] preco = new double [] {10,14,12};
		
		for(int e=0;e<4;e++) {
			for(int r=0;r<3;r++) {
				valorEstados[e]+=matriz[e][r]*preco[r];
			}
		}
		
		
		
		
		return valorEstados;
		
			
		
	}
	
	
	
	
	
	


}
























