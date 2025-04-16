package Entities;

import java.time.LocalDateTime;

public class CaixaBanco extends Funcionario{
	private LocalDateTime Horario;

	public CaixaBanco(String nome, String telefone, int matricula, double salario, LocalDateTime horario) {
		super(nome, telefone, matricula, salario);
		Horario = horario;
	}
	
	
	@Override
	public double RecebimentoAnual() 
	{
		return super.RecebimentoAnual();
	}
	
	@Override
	public String toString() {
	    return "Caixa de Banco:" +
	           "\nNome: " + getNome() +
	           "\nTelefone: " + getTelefone() +
	           "\nMatrícula: " + getMatricula() +
	           "\nSalário mensal: R$" + String.format("%.2f", getSalario()) +
	           "\nHorário de entrada: " + Horario +
	           "\nRecebimento anual: R$" + String.format("%.2f", RecebimentoAnual());
	}

}
