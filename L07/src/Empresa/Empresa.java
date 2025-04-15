package Empresa;

import Clientes.Endereco;

public class Empresa {
	public String CNPJ;
	public String Razao;
	public Endereco EnderecoEmpresa;
	
	public Empresa(String cNPJ, String razao, Endereco enderecoEmpresa) {
		super();
		CNPJ = cNPJ;
		Razao = razao;
		EnderecoEmpresa = enderecoEmpresa;
	}
	
	@Override
	
	public String toString()
	{
		return "CNPJ: " + CNPJ +
				"\nRazao Social: " + Razao + 
				"\nEndereco: " + EnderecoEmpresa.toString();
	}
}
