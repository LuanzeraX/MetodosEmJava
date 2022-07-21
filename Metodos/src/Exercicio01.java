import java.util.Scanner;

public class Exercicio01 {

	static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
                
        String nome;
        Integer tipo, diarias;
        
        System.out.println("Digite o nome:");
        nome = sc.next();
        
        System.out.println("Digite o tipo da acomodação:");
        tipo = sc.nextInt();
        
        System.out.println("Digite quantos dias: ");
        diarias = sc.nextInt();
        
      //Chamada função calculo estadia
        Double valorFinal = calculo(diarias, tipo);
        System.out.println("Valor com Estadia: " + valorFinal);

 
        //Chamada Procedimento Forma pagamento / Desconto
        pagamento(valorFinal);
        
    }
 
    public static Double calculo(int diarias, Integer tipo) {
        
        String pagamento;
        double valor=0;
        
        switch (tipo) {
        case 1: 
            valor = (double) (380*diarias);
            break;
        case 2: 
            valor = (double)(450*diarias);
            break;
        case 3: 
            valor = (double) (560*diarias);
            break;
        }
        
        return valor;
    }
    
    public static void pagamento(double valorFinal) {
        
        String pagamento;
        Double desconto = 0.90;

        
        System.out.println("Digite o método de pagamento: ");
        pagamento = sc.next();
        
        if (pagamento.equalsIgnoreCase("V")) {
            valorFinal = valorFinal * desconto;
        }
        System.out.println("Valor Final com desconto: " + valorFinal);
        sc.close();
        
    }
    
}
