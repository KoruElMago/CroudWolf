package PerfilWorker;

import Proyecto.Proyecto;
import Worker.Worker;

public class CondicionNoParticipoEnCiertoProyecto extends CondicionDelWorker{
	
	//Atributos.
	private Proyecto proyectoEnElNoQueTieneQueHaberParticipado;
	
	//Constructor
	public CondicionNoParticipoEnCiertoProyecto(Proyecto p){
		this.setProyecto(p);
	}
	
	//Retorna un booleano dependiendo del resultado de chequear la condicion por no haber participado en un proyecto.
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
