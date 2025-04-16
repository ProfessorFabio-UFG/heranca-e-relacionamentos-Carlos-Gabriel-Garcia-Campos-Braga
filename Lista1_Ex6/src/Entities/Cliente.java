package Entities;

public class Cliente extends Pessoa{
	private int Idade;
	private String CPF;
	private String Status;
	
	public Cliente(String Nome, String Telefone, int idade, String cpf)
	{
		super(Nome, Telefone);
		Idade = idade;
		CPF = cpf;
		Status = "A";
	}
	
	public void AtivarStatus()
	{
		this.Status = "A";
	}
	
	public void InativarStatus()
	{
		if(Status == "A")
		{
			this.Status = "I";
		}
	}
	
	@Override
	
	public String toString()
	{
		return "Nome: " + getNome() +
			   "\nTelefone: " + getTelefone() +
			   "\nIdade: " + Idade +
			   "\nCPF: " + CPF +
			   "\nStatus:" + Status;
	}
}
