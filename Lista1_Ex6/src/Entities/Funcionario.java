package Entities;

public class Funcionario extends Pessoa{
	private int Matricula;
	private double Salario;
	
	public Funcionario(String nome, String telefone, int matricula, double salario) {
		super(nome, telefone);
		Matricula = matricula;
		Salario = salario;
	}
	public void setSalario(double novoSalario)
	{
		this.Salario = novoSalario;
	}
	
	public double getSalario()
	{
		return Salario;
	}
	
	public int getMatricula()
	{
		return Matricula;
	}
	
	public void AumentoSalario(double Percentual)
	{
		Salario += (Salario * Percentual);
	}
	
	public double RecebimentoAnual()
	{
		return Salario * 12;
	}
}
