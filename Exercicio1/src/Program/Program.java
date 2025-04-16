package Program;

import java.util.ArrayList;
import java.util.Scanner;

import Curso.Cursos;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Cursos> CursosUFG = new ArrayList<Cursos>();
		
		System.out.println("Quantos cursos? ");
		int quantidadeCursos = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < quantidadeCursos; i++)
		{
			System.out.println("Curso: ");
			String Name = sc.nextLine();
			
			System.out.println("Tempo para acabar: ");
			double TempoParaAcabar = sc.nextDouble();
			sc.nextLine();
			
			System.out.println("Departamento: ");
			String Departamento = sc.nextLine();
			
			System.out.println("Coordenador: ");
			String Coordenador = sc.nextLine();
			
			CursosUFG.add(new Cursos(Name, TempoParaAcabar, Departamento, Coordenador));
		}
		
		for(Cursos c : CursosUFG)
		{
			System.out.println(c);
			System.out.println("=============");
		}

	}

}