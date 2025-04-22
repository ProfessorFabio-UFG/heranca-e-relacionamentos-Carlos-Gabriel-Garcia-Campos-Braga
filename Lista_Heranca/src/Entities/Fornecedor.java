package Entities;

public class Fornecedor extends PessoaJuridica{
	private String Produtos;

	public Fornecedor(String nome, String endereco, String telefone, String cnpj, String razaoSocial, String produtos) {
		super(nome, endereco, telefone, cnpj, razaoSocial);
		Produtos = produtos;
	}
	
	@Override
	
	public String toString()
	{
		return super.toString() + 
			   "\nProdutos: " + Produtos;
	}
}
