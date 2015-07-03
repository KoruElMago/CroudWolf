package PerfilWorker;

import Worker.Worker;

public class CondicionParticipoEnCiertoProyecto extends CondicionDelWorker{
	
	private Proyecto proyectoEnElQueTieneQueHaberParticipado;
	
	public CondicionParticipoEnCiertoProyecto(Proyecto p){
		this.setProyecto(p);
	}
	
	public boolean chequear(Worker w){
		return (w.getSubscripciones().contains(this.getProyecto()));
	}
	
	
	// getters y setters
	
	public void setProyecto(Proyecto p){
		proyectoEnElQueTieneQueHaberParticipado = p;
	}
	
	public Proyecto getProyecto(){
		return proyectoEnElQueTieneQueHaberParticipado;
	}
}
