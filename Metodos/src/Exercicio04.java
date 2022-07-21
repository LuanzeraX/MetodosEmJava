import java.util.Scanner;

public class Exercicio04 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		
		//a)
		int matriz[][] =chamados();
		//b) procedimento
		
		relatorioA(matriz);

		//c) função
		int [] contCriterio =	relatorioC(matriz);
		System.out.println("Relatorios de chamados por criterios: ");
		for(int i=0;i<4;i++) {
			System.out.println("Critério erro "+ (i+1)+" : "+contCriterio[i]);		
		}
		
	}
	
	
	//Metodos
	public static int [][] chamados(){
		
		int [][] matriz = new int [5][3];
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<3;j++) {
				
				
				System.out.println("Digite o id do funcionário: ");
				matriz[i][0]=sc.nextInt();
				
				
				System.out.println("dDigite código do erro: ");
				matriz[i][1]=sc.nextInt();
				
				while(matriz[i][1]<1 || matriz[i][1]>3) {
					System.out.println("Digite código do erro 1/2/3: ");
					matriz[i][1]=sc.nextInt();
				}
				
				
				
				
				
				
				
				
				System.out.println("Digite critério do erro: ");
				matriz[i][2]=sc.nextInt();
				
				
				while(matriz[i][2]<1|| matriz[i][2]>4) {
					System.out.println("Digite código do erro 1/2/3/4");
				}
				
			}
		}
		
		
		
		
		return matriz;
	}
	
	public static void relatorioA(int [][] matriz) {
		
		int [] erros = new int [3];
		
		for(int i=0; i<5;i++) {
			if(matriz[i][1]==1) {
				erros[0]++;
			}else if(matriz[i][1]==2) {
				erros[1]++;
			}else {
				erros[3]++;
			}
		}
		
		System.out.println("");
		System.out.println("Relatório de Erros");
		for(int i=0;i<3;i++) {
			System.out.println("Números chamados código 1:" + (i+1)+ erros[i]);
		}
		
	}
	
	
	public static int [] relatorioC(int [][] matriz) {
		int [] contCriterio = new int [4];
		
		
		for(int i=0;i<5;i++) {
			
		if(matriz[i][2]==1) {
			contCriterio[0]++;
			
		}else if(matriz[i][2]==2) {
			contCriterio[1]++;
		}else if(matriz[i][2]==3) {
			contCriterio[2]++;
		}else {
			contCriterio[3]++;
		}
		
		}
	
		return contCriterio;
		}
	}
	


