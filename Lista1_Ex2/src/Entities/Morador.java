package Entities;

import java.time.LocalDate;
import java.time.Period;

public class Morador {
	public String Nome;
	public String Sexo;
	private String CPF;
	private LocalDate DataNascimento;
	private Integer CodigoAcesso;
	
	public Morador() {
}

	public Morador(String nome, String cpf, LocalDate dataNascimento, String sexo, Integer codigoAcesso) {
		Nome = nome;
		setCPF(cpf);
		setDataNascimento(dataNascimento);
		Sexo = sexo;
		CodigoAcesso = codigoAcesso;
	}
	
	public void setCPF(String CPF)
	{
		if(CPF.isEmpty() || CPF.length() != 11 || !CPF.matches("\\d+"))
		{
			throw new IllegalArgumentException("O CPF nao pode ser vazio e deve conter 11 digitos");
		}
		
		this.CPF = CPF;
	}
	
	
	public void setDataNascimento(LocalDate DataNascimento)
	{
		LocalDate anoAtual = LocalDate.now();
		Period idadeMorador = Period.between(DataNascimento, anoAtual);
		if(idadeMorador.getYears() < 16)
		{
			throw new IllegalArgumentException("Nao e possivel fazer o cadastro sendo menor de 16 anos");
		}
		
		this.DataNascimento = DataNascimento;
	}
	
	public void setCodigoAcesso(int CodigoAcesso)
	{
		int quantidadeDigitos = String.valueOf(CodigoAcesso).length();
		
		if(quantidadeDigitos != 5)
		{
			throw new IllegalArgumentException("O codigo deve ter 5 numeros");
		}
		
		this.CodigoAcesso = CodigoAcesso;
	}
	
	public int getCodigoAcesso()
	{
		return CodigoAcesso;
	}
	
	@Override
	public String toString() {
	    return "Nome: " + Nome + 
	           "\nCPF: " + CPF + 
	           "\nData de Nascimento: " + DataNascimento + 
	           "\nSexo: " + Sexo + 
	           "\nCódigo de Acesso: " + CodigoAcesso;
	}
}
