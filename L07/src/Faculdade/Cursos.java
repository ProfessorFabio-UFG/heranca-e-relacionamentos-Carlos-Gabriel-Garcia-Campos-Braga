package Faculdade;

public class Cursos {
	public String Nome;
	public String Sigla;
	public Departamento Departamento;
	public Cursos(String nome, String sigla, Departamento departamento) {
		super();
		Nome = nome;
		Sigla = sigla;
		Departamento = departamento;
	}
	
	@Override
	
	public String toString()
	{
		return "Curso: " + Nome + "(" + Sigla + ")" +
			   "\nDepartamento: " + Departamento.toString();
	}
}
