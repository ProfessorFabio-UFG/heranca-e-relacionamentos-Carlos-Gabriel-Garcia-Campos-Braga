package Faculdade;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Alunos {
	public String Nome;
	public int Matricula;
	public LocalDateTime Ano;
	public Cursos Curso;
	
	public Alunos(String nome, int matricula, LocalDateTime ano, Cursos curso) {
		super();
		Nome = nome;
		Matricula = matricula;
		Ano = ano;
		Curso = curso;
	}
	
	@Override
	
	public String toString()
	{
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		return "Nome: " + Nome +
				"\nMatricula: " + Matricula +
				"\nAno de ingresso: " + Ano.format(formato) +
				"\n" + Curso.toString();
	}
}
