package Entities;

public class Produto {
	public int Cod_Sequencial;
	public String Nome;
	public int Quantidade;
	public String Tipo;
	public double Valor;
	
	
	public Produto(int cod_Sequencial, String nome, int quantidade, String tipo, double valor) {
		this.Cod_Sequencial = cod_Sequencial;
        this.Nome = nome;
        this.Quantidade = quantidade;
        this.Tipo = tipo;
        this.Valor = valor;
	}


	public Produto(int cod_Sequencial) {
		Cod_Sequencial = cod_Sequencial;
		this.Nome = "Desconhecido";
        this.Quantidade = 0;
        this.Tipo = "Desconhecido";
        this.Valor = 0.0;
	}


	public Produto(int cod_Sequencial, String nome, int quantidade) {
		Cod_Sequencial = cod_Sequencial;
		Nome = nome;
		Quantidade = quantidade;
        this.Tipo = "Desconhecido";
        this.Valor = 0.0;
	}
	
	
	public double Vender(int quantidadeVendida)
	{
		if(quantidadeVendida > Quantidade)
		{
			throw new IllegalArgumentException("A quantidade desejada é maior do que a quantidade em estoque");
		}
		
		Quantidade -= quantidadeVendida;
		
		return quantidadeVendida * Valor;
	}
	
	public void Comprar(int quantidadeComprada, double novoValor)
	{
		this.Quantidade += quantidadeComprada;
		this.Valor = novoValor;
	}
	
	public void Comprar(int quantidadeComprada)
	{
		this.Quantidade += quantidadeComprada;
	}
	
	public void Inserir(String nomeProduto, int quantidadeProduto, String tipoProduto, double valorProduto)
	{
		this.Nome = nomeProduto;
		this.Quantidade = quantidadeProduto;
		this.Tipo = tipoProduto;
		this.Valor = valorProduto;
	}
	
	public boolean Igual(Produto Produto)
	{
		return this.Nome.equals(Produto.Nome) && this.Tipo.equals(Produto.Tipo);
	}
	
	@Override
	
	public String toString()
	{
		return "Código: " + Cod_Sequencial + "\n" +
	               "Nome: " + Nome + "\n" +
	               "Quantidade: " + Quantidade + "\n" +
	               "Tipo: " + Tipo + "\n" +
	               "Valor: R$" + String.format("%.2f", Valor) +
	               "\n================";
	}
	
}


