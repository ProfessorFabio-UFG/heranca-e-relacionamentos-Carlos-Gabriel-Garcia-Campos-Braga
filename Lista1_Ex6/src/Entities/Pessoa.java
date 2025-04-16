package Entities;

public class Pessoa {
	private String Nome;
	private String Telefone;
	
	public Pessoa(String nome, String telefone) {
		Nome = nome;
		Telefone = telefone;
	}
	
	public String getNome()
	{
		return Nome;
	}
	
	public String getTelefone()
	{
		return Telefone;
	}
}
