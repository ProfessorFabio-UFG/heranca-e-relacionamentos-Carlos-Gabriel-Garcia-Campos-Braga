package Empresa;

import Clientes.Endereco;

public class Empregado {
	public String Nome;
	public int Matricula;
	public Empresa Empresa;
	public Endereco Endereco;
	
	public Empregado(String nome, int matricula, Empresa empresa, Clientes.Endereco endereco) {
		super();
		Nome = nome;
		Matricula = matricula;
		Empresa = empresa;
		Endereco = endereco;
	}
	
	@Override
	
	public String toString()
	{
		return "Nome: " + Nome +
				"\nMatricula: " + Matricula + 
				"\nEndereco pessoal: " + Endereco +
				"\nEmpresa que opera: " + Empresa.toString();
	}
}
