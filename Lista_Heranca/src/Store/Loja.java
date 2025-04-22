package Store;


import java.util.ArrayList;
import Entities.*;

public class Loja {
	public ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
	public ArrayList<Funcionario> listaFuncionario = new ArrayList<Funcionario>();
	public ArrayList<Fornecedor> listaFornecedor = new ArrayList<Fornecedor>();
	
	public Loja()
	{
		
	}
	
	public void ContratarFuncionario(Funcionario Func)
	{
		if(Func == null)
		{
			throw new IllegalArgumentException("O funcionário não pode ser nulo!");
		}
		
		listaFuncionario.add(Func);
	}
	
	public void DemitirFuncionario(Funcionario Func)
	{
		if(Func != null)
		{
			listaFuncionario.removeIf(F -> F.getMatricula() == Func.getMatricula());
		}
		else
		{
			throw new IllegalArgumentException("Este funcionário não existe!");
		}
	}
	
	public void CadastrarCliente(Cliente Cl)
	{
		if(Cl == null)
		{
			throw new IllegalArgumentException("O cliente não existe!");
		}
		
		listaClientes.add(Cl);
	}
	
	public void CadastrarFornecedor(Fornecedor For)
	{
		if(For == null)
		{
			throw new IllegalArgumentException("O fornecedor não existe!");
		}
		
		listaFornecedor.add(For);
	}
	
	public void MostrarClientes()
	{
		for(Cliente c : listaClientes)
		{
			System.out.println(c);
			System.out.println("================");
		}
	}
	
	public void MostrarFuncionarios()
	{
		for(Funcionario f : listaFuncionario)
		{
			System.out.println(f);
			System.out.println("================");
		}
	}
	
	public void MostrarForncedor()
	{
		for(Fornecedor f : listaFornecedor)
		{
			System.out.println(f);
			System.out.println("================");
		}
	}
}
