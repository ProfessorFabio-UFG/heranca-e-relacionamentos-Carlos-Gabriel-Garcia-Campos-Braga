package Entities;

import java.time.LocalDateTime;

public class Morador {
	private static int proximoCodigo = 1;
	private int codigoSequencial;
	
	private String Nome;
	private String Cpf;
	private String celular;
	private LocalDateTime dataNascimento;
	private char sexo;
	private int bloco;
	private int apto;
	private String codigoAcesso;
	
	public Morador(String nome, String cpf, String celular, LocalDateTime dataNascimento, char sexo, int bloco,
			int apto, String codigoAcesso) {
		super();
		Nome = nome;
		Cpf = cpf;
		this.celular = celular;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.bloco = bloco;
		this.apto = apto;
		this.codigoAcesso = codigoAcesso;
		this.codigoSequencial = proximoCodigo++;
	}
	
	public String getNome()
	{
		return Nome;
	}
	
	@Override
	
	public String toString()
	{
		return Nome + ": " + codigoSequencial;
	}
}
