package PerfilWorker;

import java.util.List;

import Worker.Worker;

public class PerfilDelWorker {
	
	private List<CondicionDelWorker> condiciones;
	

	//ver si crearla vacia o ya con una list de condiciones dadas
	public PerfilDelWorker (List<CondicionDelWorker> ls){
		this.setCondiciones(ls);
	}
	
	//Verifica todas las condiciones del worker
	public Boolean chequearWorker(Worker w){
		for(CondicionDelWorker c : this.getCondiciones()){
			if (!c.chequear(w)){
				return false;
			}
		}
		return true;
	}
	
	// getters y setters,
	
	public void setCondiciones(List<CondicionDelWorker> ls){
		condiciones = ls;
	}

	public List<CondicionDelWorker> getCondiciones(){
		return condiciones;
	}
}
