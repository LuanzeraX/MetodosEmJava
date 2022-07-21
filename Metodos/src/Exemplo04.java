import java.util.Scanner;

public class Exemplo04 {

	
	static 	Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double nota1=0, nota2=0, media=0;
		String situacao;
		
		System.out.println("Digite nota 1: ");
		nota1=entrada.nextDouble();
		System.out.println("Digite nota 2: ");
		nota2=entrada.nextDouble();

		media = calculaMedia(nota1, nota2);
		
		System.out.println("Média: "+ media);
		
		situacao= verificaSituacao(media);
		System.out.println("Situação: "+situacao);
		
	}
	
	//Função Média
	
	
	
	
	
	public static double calculaMedia(double nota1, double nota2) {
		double media=0;
		
		media = (nota1+nota2) /2;
		return media;
	}
	
	
	public static String verificaSituacao(double media) {
		
		String verifica;
		
		if(media >=6) {
			verifica ="aprovado";
		}else {
			verifica="reprovado";
		}
		return verifica;
	}

}
