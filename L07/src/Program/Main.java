package Program;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import Clientes.Cliente;
import Clientes.Endereco;
import Empresa.Empregado;
import Empresa.Empresa;
import Faculdade.Alunos;
import Faculdade.Cursos;
import Faculdade.Departamento;
import Musica.Compositores;
import Musica.Musicas;

public class Main {
	public static void main(String[] args)
	{
		System.out.println("Exercicio 1");
		
		ArrayList<Compositores> CompositoresDieWithASmile = new ArrayList<>(
			List.of(
						new Compositores("Bruno Mars", "Americano"),
						new Compositores("Lady Gaga", "Americana")
					)
		);
		
		Musicas DieWithASmile = new Musicas("Die With A Smile", LocalDateTime.of(2024, Month.AUGUST, 16, 0, 0), "Pop", CompositoresDieWithASmile);
		
		Musicas NaoTenhoInimigos = new Musicas("Não tenho inimigos", LocalDateTime.of(2025, Month.MARCH, 1, 0, 0), "Rap", new Compositores("Daarui", "Brasileiro"));
		
		System.out.println(DieWithASmile);
		System.out.println("========================");
		System.out.println(NaoTenhoInimigos);
		
		System.out.println("========================");
		
		System.out.println("Exercicio 2");
		Departamento Departamento = new Departamento("Instituto de Informática", "INF");
		Cursos CienciaDaComputacao = new Cursos("Ciência da Computação", "CC", Departamento);
		Alunos Aluno_1 = new Alunos("Carlos", 202501050, LocalDateTime.of(2005, Month.JULY, 15, 0, 0), CienciaDaComputacao);
		
		System.out.println(Aluno_1);
		
		System.out.println("========================");
		
		System.out.println("Exercicio 3");
		Endereco endereco = new Endereco("Av. Pedro Ludovico", 123, "Apto 501", "12345-678", "Centro", "Goiânia", "GO");
        Cliente cliente = new Cliente("Ana Paula", "123.456.789-00", endereco);
        
        System.out.println(cliente);
        
        System.out.println("========================");
		
		System.out.println("Exercicio 4");
		
		Endereco EnderecoEmpresa = new Endereco("Av. Consolacao", 123, "Apto 101", "87654-321", "Cidade Jardim", "Goiânia", "GO");
		Endereco EnderecoEmpregado = new Endereco("Av. Milao", 123, "Apto 201", "84312-892", "Eldorado", "Goiânia", "GO");
		Empresa Empresa = new Empresa("12.345.678/0001-90", "Software de Gestao", EnderecoEmpresa);
		Empregado Empregado_1 = new Empregado("Juliano", 1234567, Empresa, EnderecoEmpregado);
		
		System.out.println(Empregado_1);

	}
}
