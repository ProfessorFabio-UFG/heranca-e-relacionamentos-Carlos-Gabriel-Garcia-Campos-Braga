package Program;

import Entities.Cliente;
import Entities.Fornecedor;
import Entities.Funcionario;
import Store.Loja;

public class Main {

	public static void main(String[] args) {
		
		Cliente C1 = new Cliente(
								 "Carlos",
								 "Rua 1",
								 "(62)99259-1792",
								 "030.244.301-05",
								 'M',
								 "Solteiro",
								 1518.00,
								 "Eletrônicos",
								 "Desenvolvedor .NET C#"
								 );
		

		
		Fornecedor F1 = new Fornecedor(
										"Leo", 
										"Rua 2", 
										"(62)91291-4121", 
										"91829400.12919", 
										"Software de Gestão", 
										"Periféricos"
										);
		

		
		Funcionario Fun1 = new Funcionario(
										"Murilo",
										"Rua 3",
										"(62)29912-1294",
										"123.456.789-10",
										'M',
										"Casado",
										2012034,
										2500.00,
										"Atendente"
										);
		
		Funcionario Fun2 = new Funcionario(
				"Jotinha",
				"Rua 4",
				"(62)51922-1294",
				"143.416.789-10",
				'M',
				"Casado",
				2012036,
				2500.00,
				"Balconista"
				);
		
		
		Loja Renner = new Loja();
		
		Renner.CadastrarCliente(C1);
		Renner.CadastrarFornecedor(F1);
		Renner.ContratarFuncionario(Fun1);
		Renner.ContratarFuncionario(Fun2);
		
		
		System.out.println("===Clientes===");
		Renner.MostrarClientes();
		
		System.out.println("===Funcionarios===");
		Renner.MostrarFuncionarios();
		
		System.out.println("===Fornecedores===");
		Renner.MostrarForncedor();
			
		
		Renner.DemitirFuncionario(Fun1);
		
		System.out.println("===Funcionarios atualizado===");
		Renner.MostrarFuncionarios();
		
	}

}
