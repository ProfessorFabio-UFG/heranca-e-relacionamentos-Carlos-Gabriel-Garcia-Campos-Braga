package Musica;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Musicas {
	public String Nome;
	public LocalDateTime Ano;
	public String Tipo;
	public ArrayList<Compositores> Compositores = new ArrayList<Compositores>();
	
	public Musicas(String nome, LocalDateTime ano, String tipo, Compositores Compositor) {
		super();
		Nome = nome;
		Ano = ano;
		Tipo = tipo;
		Compositores.add(Compositor);
	}
	
	public Musicas(String nome, LocalDateTime ano, String tipo, ArrayList<Compositores> Compositor) {
		super();
		Nome = nome;
		Ano = ano;
		Tipo = tipo;
		Compositores.addAll(Compositor);
	}
	
	@Override
	
	public String toString()
	{
		String compositores = "";
		for(Compositores c : Compositores)
		{
			compositores += c.Nome + "(" + c.Nacionalidade + ")" + ", ";
		}
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		return "Nome: " + Nome + "\nAno: " + Ano.format(formato) + "\nTipo: " + Tipo + "\nCompositores: " + compositores;
	}
}
