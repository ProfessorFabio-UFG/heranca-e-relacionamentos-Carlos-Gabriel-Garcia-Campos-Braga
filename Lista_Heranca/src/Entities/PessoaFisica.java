package Entities;

public class PessoaFisica extends Pessoa{
	private String cpf;
	private char sexo;
	private String estadoCivil;
	
	public PessoaFisica(String nome, String endereco, String telefone, String cpf, char sexo, String estadoCivil)
	{
		super(nome, endereco, telefone);
		this.cpf = cpf;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
	}
	
	@Override
	
	public String toString()
	{
		return super.toString() + 
			   "\nCPF: " + cpf +
			   "\nSexo: " + sexo +
			   "\nEstado Civil: " + estadoCivil;
	}
}
