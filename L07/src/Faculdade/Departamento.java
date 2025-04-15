package Faculdade;

public class Departamento {
	public String Nome;
	public String Sigla;
	
	public Departamento(String nome, String sigla) {
		super();
		Nome = nome;
		Sigla = sigla;
	}
	
	@Override
	
	public String toString()
	{
		return Nome + "(" + Sigla + ")";
	}
}
