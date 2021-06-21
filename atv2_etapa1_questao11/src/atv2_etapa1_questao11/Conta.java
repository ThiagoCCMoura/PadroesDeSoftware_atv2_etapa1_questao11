package atv2_etapa1_questao11;

public class Conta {
	
	String nomeTitular;
	int agencia;
	int numeroDaConta;
	double saldo;
	
	public Conta(String nomeTitular, int agencia, int numeroConta, double saldo) {
		this.nomeTitular = nomeTitular;
		this.agencia = agencia;
		this.numeroDaConta = numeroConta;
		this.saldo = saldo;
	}

	
	
	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
}
