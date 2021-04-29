
public class Pessoa { //CLASSE ABSTRATA PESSOA
	
	//ATRIBUTOS
	private int NConta;
	private String Nome;
	private double Saldo;
	
	//GETTERS E SETTERS
	
	public int getNConta() {
		return NConta;
	}
	public void setNConta(int nConta) {
		NConta = nConta;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public double getSaldo() {
		return Saldo;
	}
	public void setSaldo(double saldo) {
		Saldo = saldo;
	}
	
	//--------------------//
	
	@Override
	public String toString() { //TO STRING DAS INFOS
		return "Número da Conta: " + NConta + "\nNome: " + Nome + "\nsaldo: R$" + Saldo;
	}
	
	


}

	
	
