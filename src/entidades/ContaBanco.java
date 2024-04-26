package entidades;

public class ContaBanco {
	private int conta;
	private String agencia;
	private String nome;
	private Double saldo;
	
	public ContaBanco(int conta, String agencia, String nome, Double depositoInicial) {
		this.conta = conta;
		this.agencia = agencia;
		this.nome = nome;
		saldo = depositoInicial;
	}

	public int getConta() {
		return conta;
	}

	public String getAgencia() {
		return agencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	@Override
	public String toString() {
	return "Olá " + nome +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta " + conta + " e seu saldo R$" +String.format("%.2f",saldo)+ " já está disponível para saque.";
	}
}
