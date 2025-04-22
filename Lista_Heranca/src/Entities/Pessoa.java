package Entities;

public class Pessoa {
	private String Nome;
	private String Endereco;
	private String Telefone;
	
	public Pessoa(String nome, String endereco, String telefone) 
	{
		super();
		Nome = nome;
		Endereco = endereco;
		Telefone = telefone;
	}
	
	@Override
	
	public String toString()
	{
		return "Nome: " + Nome +
			   "\nEndereco: " + Endereco +
			   "\nTelefone: " + Telefone;
	}
}
