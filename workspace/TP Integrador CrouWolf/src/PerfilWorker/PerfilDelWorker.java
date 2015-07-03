package PerfilWorker;

public class PerfilDelWorker {
	
	private List<CondicionDelWorker> condiciones;
	

	//ver si crearla vacia o ya con una list de condiciones dadas
	public PerfilDelWorker (List<CondicionDelWorker>) ls){
		this.setCondiciones(ls);
	}
	
	//Verifica todas las condiciones del worker
	public Boolean chequearWorker(Worker w){
		for(CondicionDelWorker c : this.getCondiones()){
			c.chequar(w);
		}
	
	
	// getters y setters,
	
	public void setCondiciones(List<CondicionDelWorker> ls){
		condiciones = ls;
	}

	public List<CondicionDelWorker> getCondiones(){
		return condiciones;
	}
}
