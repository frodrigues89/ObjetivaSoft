package model;

import java.util.List;

public class GrupoDeClientes {

	private List<Cliente> lista;

	public void addClienteGrupo(Cliente cliente) {
		lista.add(cliente);
	}

	public Boolean removeClienteGrupo(Cliente cliente) {
		if (lista.contains(cliente)){
			lista.remove(cliente);
			return true;
		}else{
			return false;
		}
	}

}
