import java.util.Scanner;

public class Exercicio02 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int codigo = 0;
		double carga = 0;

		System.out.print("Digite o codigo do caminhão:");
		codigo = sc.nextInt();

		System.out.print("Carga do caminhão em toneladas:");
		carga = sc.nextDouble();

		// chamada
		double vlCarga = calcularPreco(carga);
		System.out.println("Valor da Carga:" + vlCarga);

		// chamada
		double imposto = calcularImposto(vlCarga);
		System.out.println("Valor do Imposto:" + imposto);
		
		//VALOR TOTAL
		System.out.println("Valor total:"+ (vlCarga + imposto));
		
		
	}

	public static double calcularPreco(double carga) {

		int codigoCarga = 0;
		double pesoQuilos = 0, vlCarga = 0;

		System.out.print("Digite o código da carga:");
		codigoCarga = sc.nextInt();

		// validacao código
		while (codigoCarga < 1 || codigoCarga > 30) {
			System.out.println("Digite o código da carga corretamente:");
			codigoCarga = sc.nextInt();
		}

		pesoQuilos = carga * 1000;
		
		if (codigoCarga <= 10) {
			vlCarga = pesoQuilos * 120;
		} else if (codigoCarga <= 20) {
			vlCarga = pesoQuilos * 200;
		} else {
			vlCarga = pesoQuilos * 280;
		}

		return vlCarga;

	}

	public static double calcularImposto(double vlCarga) {

		int codEstado = 0;
		double imposto = 0;

		System.out.print("Código do Estado:");
		codEstado = sc.nextInt();

		switch (codEstado) {

		case 1:
			imposto = vlCarga * 0.25;
			break;
		case 2:
			imposto = vlCarga * 0.20;
			break;
		case 3:
			imposto = vlCarga * 0.15;
			break;
		case 4:
			imposto = 0;
		}

		return  imposto;
	}
}
