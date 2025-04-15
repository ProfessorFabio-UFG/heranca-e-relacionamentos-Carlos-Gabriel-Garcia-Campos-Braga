package Clientes;

public class Endereco {
	public String Rua;
	public int Numero;
	public String Complemento;
	public String CEP;
	public String Bairro;
	public String Cidade;
	public String Estado;
	
	public Endereco(String rua, int numero, String complemento, String cep, String bairro, String cidade, String estado) {
		super();
		Rua = rua;
		Numero = numero;
		Complemento = complemento;
		CEP = cep;
		Bairro = bairro;
		Cidade = cidade;
		Estado = estado;
	}
	
@Override
	
	public String toString()
	{
		return "Rua " + Rua + ", " + Numero + ", " + Complemento + ", " + CEP + ", " + Bairro +
				", " + Cidade + "(" + Estado + ")";
	}
	
}
