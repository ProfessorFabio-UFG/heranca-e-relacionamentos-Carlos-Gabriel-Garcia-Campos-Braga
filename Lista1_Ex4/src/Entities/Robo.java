package Entities;

public class Robo {
	private int X;
	private int Y;
	private int ID;
	private int Po;
	private int LimitePo;
	private boolean Status;
	private String StatusDescricao;
	
	public Robo(int iD, int limitePo) {
		X = 0;
		Y = 0;
		ID = iD;
		Po = 0;
		LimitePo = limitePo;
		Status = false;
		StatusDescricao = "Desligado";
	}
	
	public void LigarRobo()
	{
		Status = true;
		StatusDescricao = "Parado";
	}
	
	public void DesligarRobo()
	{
		Status = false;
		StatusDescricao = "Desligado";
	}
	
	private boolean isLigado()
	{
		return Status;
	}
	
	public void Andar(int X, int Y)
	{
		
		if(!isLigado())
		{
            throw new IllegalStateException("O robô está desligado!");
		}
		
		this.X += X;
		this.Y += Y;
		
		StatusDescricao = "Andando";
	}
	
	public void Aspirar(int quantidadePo)
	{
		if(!isLigado())
		{
            throw new IllegalStateException("O robô está desligado!");
		}
		
		if(Po + quantidadePo > LimitePo)
		{
			DesligarRobo();
            throw new IllegalStateException("Limite de po atingido!");
		}
			
			Po += quantidadePo;
			StatusDescricao = "Aspirando";
	}
	
	public void Parar()
	{
		if (!isLigado()) {
            throw new IllegalStateException("O robô está desligado!");
        }
        StatusDescricao = "Parado";
	}
	
	@Override
	
	public String toString()
	{
		return "Robo " + ID +
			   "\nX: " + X +
			   "\nY: " + Y +
			   "\nPo aspirado: " + Po +
			   "\nLimite de Po: " + LimitePo +
			   "\nStatus: " + StatusDescricao;
	}
}
