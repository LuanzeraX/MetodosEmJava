import java.util.Scanner;

public class Exemplo05 {
	
	
	static 	Scanner entrada = new Scanner(System.in);

	static String nome;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//função com retorno de double
	  double salario=funcionario();
	  
	  //procedimento ele não tem retorno
	  verifica(salario);
	
	}
	
	
	
	public static double funcionario() {
		
	
		double valorHora=0, salario=0;
		int horasTrab=0;
		
		System.out.println("Digite o nome: ");
		nome=entrada.next();
		System.out.println("Digite o valor hora: ");
		valorHora=entrada.nextDouble();
		System.out.println("Digite horas trabalhadas: ");
		horasTrab=entrada.nextInt();
		
		
		salario = valorHora* horasTrab;
		
		return salario;
	}
	
	
	//procedimento
	public static void verifica(double salario) {
		
		String msg;
		
		if(salario>1000) {
			msg="Não tem direito";
		}else {
			msg="Tem direito";
		}
		
		System.out.println("Funcionario "+nome+"- Salário "+salario+ " - "+msg);
		
	}
	

}
