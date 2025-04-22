package Entities;

public class PessoaJuridica extends Pessoa{
	private String cnpj;
	private String razaoSocial;
	
	public PessoaJuridica(String nome, String endereco, String telefone, String cnpj, String razaoSocial) {
		super(nome, endereco, telefone);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}
	
	@Override
	
	public String toString()
	{
		return super.toString() + 
			   "\nCNPJ: " + cnpj +
			   "\nRazão Social: " + razaoSocial;
	}
}
