import java.util.Scanner;

public class Main {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Pessoa pessoa = new Pessoa();
		System.out.print("Insira o n�mero da conta: "); //DEFINE O NUMERO DA CONTA
		pessoa.setNConta(scan.nextInt());
		System.out.print("Insira o nome do titular da conta: ");//DEFINE O NOME DO TITULAR DA CONTA
		pessoa.setNome(scan.next());
		
		System.out.print("Haver� deposito inicial? (s/n) "); // PERGUNTA SE HAVER� DEPOSITO INICIAL
		char depositoInicial = scan.next().toLowerCase().charAt(0);
		
		
		if (depositoInicial == 's'){//FAZ O DEPOSITO E MOSTRA NUMERO DA CONTA, NOME E SALDO
			System.out.print("Insira o valor do seu deposito: R$");
			pessoa.setSaldo(scan.nextDouble());
			System.out.println("\n\n\n" + pessoa);
		}
		else{
			System.out.println("\n" + pessoa);//NN�O FAZ O DEPOSITO E MOSTRA NUMERO E CONTA E SALDO ZERADO
		}
		
		
		
	}

}
