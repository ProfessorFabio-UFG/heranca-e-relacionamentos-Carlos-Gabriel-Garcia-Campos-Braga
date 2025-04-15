package Clientes;

public class Cliente {
	public String Nome;
	public String CPF;
	public Endereco Endereco;
	
	public Cliente(String nome, String cPF, Clientes.Endereco endereco) {
		super();
		Nome = nome;
		CPF = cPF;
		Endereco = endereco;
	}
	
	@Override
	
	public String toString()
	{
		return "Nome: " + Nome +
				"\nCPF: " + CPF + 
				"\n" + Endereco.toString();
	}
	
}
