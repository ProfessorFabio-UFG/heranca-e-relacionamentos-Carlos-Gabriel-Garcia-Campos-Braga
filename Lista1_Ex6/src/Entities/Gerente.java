package Entities;

public class Gerente extends Funcionario{
	
	private double Bonificacao;
	private String Tipo;
	
	public Gerente(String nome, String telefone, int matricula, double salario, double bonificacao, String tipo) {
		super(nome, telefone, matricula, salario);
		Bonificacao = bonificacao;
		Tipo = tipo;
	}
	
	@Override
	
	public double RecebimentoAnual()
	{
		return (getSalario() + (getSalario() * Bonificacao)) * 12;
	}
	
	public void AumentoSalario(double Percentual)
	{
		
		double salarioBonificacao = getSalario() + (getSalario() * Bonificacao);
		double salarioFinal = salarioBonificacao + (salarioBonificacao * Percentual);
		setSalario(salarioFinal);
	}
	
	
	public String toString() {
	    return "Gerente:" +
	           "\nNome: " + getNome() +
	           "\nTelefone: " + getTelefone() +
	           "\nMatrícula: " + getMatricula() +
	           "\nSalário mensal: R$" + String.format("%.2f", getSalario()) +
	           "\nBonificação: " + (Bonificacao * 100) + "%" +
	           "\nTipo: " + Tipo +
	           "\nRecebimento anual: R$" + String.format("%.2f", RecebimentoAnual());
	}
	
	
}
