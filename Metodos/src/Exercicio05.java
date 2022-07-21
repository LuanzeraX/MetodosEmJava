import java.util.Scanner;

public class Exercicio05 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		//chamando a função
		double[] vetorA = carregamentoVetor();
		
		ordenarNumeros(vetorA);
		for(int i=0;i<5;i++) {
		System.out.println("Números ordenados:"+vetorA[i]+"\t");
		}
		
	}//main

	
	//carregar o vetor
	public static double[] carregamentoVetor(){
		
		double[] vetorA = new double[5];
		
		
		System.out.println("Digite os Números");
		for(int i=0;i<5;i++) {
		System.out.println((i+1)+"º Número: ");
		vetorA[i]=sc.nextDouble();
		}
		return vetorA;
		
	}
	
	public static double[] ordenarNumeros(double[] vetorA) {
		double aux=0;
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<4;j++) {
				
				if(vetorA[j]>vetorA[j+1]) {
					aux= vetorA[j];
					vetorA[j] = vetorA[j+1];
					vetorA[j+1]=aux;
					
				}
			}
		}
		return vetorA;
		
	}
	
	
	
	
}
