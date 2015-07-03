package PerfilWorker;

import Proyecto.Proyecto;
import Worker.Worker;

public class CondicionNoParticipoEnCiertoProyecto extends CondicionDelWorker{
	
	private Proyecto proyectoEnElNoQueTieneQueHaberParticipado;
	
	public CondicionNoParticipoEnCiertoProyecto(Proyecto p){
		this.setProyecto(p);
	}
	
	public boolean chequear(Worker w){
		return !(w.getSubscripciones().contains(this.getProyecto()));
	}
	
	
	// getters y setters
	
	public void setProyecto(Proyecto p){
		proyectoEnElNoQueTieneQueHaberParticipado = p;
	}
	
	public Proyecto getProyecto(){
		return proyectoEnElNoQueTieneQueHaberParticipado;
	}
}
