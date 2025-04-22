package Entities;

public class Funcionario extends PessoaFisica{
	private int matricula;
	private double salario;
	private String cargo;
	
	public Funcionario(String nome, String endereco, String telefone, String cpf, char sexo, String estadoCivil,
			int matricula, double salario, String cargo) {
		super(nome, endereco, telefone, cpf, sexo, estadoCivil);
		this.matricula = matricula;
		this.salario = salario;
		this.cargo = cargo;
	}

	public int getMatricula()
	{
		return matricula;
	}
	@Override
	
	public String toString()
	{
		return super.toString() + 
			   "\nMatricula: " + matricula +
			   "\nSalario: " + salario +
			   "\nCargo: " + cargo;
	}
}
