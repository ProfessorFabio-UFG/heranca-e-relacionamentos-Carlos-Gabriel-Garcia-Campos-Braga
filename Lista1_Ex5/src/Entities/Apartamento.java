package Entities;

import java.util.ArrayList;

public class Apartamento {
	private int numero;
	private int andar;
	private double metragem;
	private String situacao;
	private ArrayList<Morador> listaMoradores = new ArrayList<>();

	public Apartamento(int numero, int andar, double metragem, String situacao) {
		this.numero = numero;
		this.andar = andar;
		this.metragem = metragem;
		this.situacao = situacao;
	}

	public void addMorador(Morador novoMorador) {
		if (novoMorador != null) {
			listaMoradores.add(novoMorador);
		}
	}

	public String listarMoradores() {
		if (listaMoradores.isEmpty()) {
			return "Nenhum morador cadastrado.";
		}

		StringBuilder sb = new StringBuilder();
		for (Morador m : listaMoradores) {
			sb.append(m.toString()).append("\n");
		}
		return sb.toString();
	}

	@Override
	public String toString() {
		return "Apartamento número " + numero + 
				"\nAndar: " + andar +
				"\nMetragem: " + metragem +
				"\nSituação: " + situacao + 
				"\nMoradores:\n" + listarMoradores();
	}
}
