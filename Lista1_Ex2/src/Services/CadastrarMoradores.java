package Services;

import java.util.ArrayList;
import java.util.HashMap;

import Entities.Morador;

public class CadastrarMoradores {
	private ArrayList<Morador> MoradoresCadastrados = new ArrayList<Morador>();
	private HashMap<Integer, Morador> moradoresMap = new HashMap<>();
	
	public void addMorador(Morador NovoMorador)
	{
		verificarCodigoAcesso(NovoMorador.getCodigoAcesso());
		MoradoresCadastrados.add(NovoMorador);
		moradoresMap.put(NovoMorador.getCodigoAcesso(), NovoMorador);
	}
	
	public Morador procurarMorador(int CodigoAcesso)
	{
		return moradoresMap.get(CodigoAcesso);
	}
	
	public boolean removerMorador(int CodigoAcesso) {
        Morador moradorRemovido = moradoresMap.remove(CodigoAcesso);
        
        if (moradorRemovido == null) 
        {
            return false; 
        }
        
        MoradoresCadastrados.remove(moradorRemovido);
        return true; 
    }
	
	public ArrayList<Morador> mostrarMoradores()
	{
		return MoradoresCadastrados;
	}
	
	public void verificarCodigoAcesso(int CodigoAcesso)
	{
		for(Morador m : MoradoresCadastrados)
		{
			if(m.getCodigoAcesso() == CodigoAcesso)
			{
				throw new IllegalArgumentException("Nao pode haver codigos de acesso iguais");
			}
		}
	}
}
