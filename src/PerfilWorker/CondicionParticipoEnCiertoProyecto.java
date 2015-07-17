package PerfilWorker;

import Proyecto.Proyecto;
import Worker.Worker;

public class CondicionParticipoEnCiertoProyecto extends CondicionDelWorker{
	
	//Atributos.
	private Proyecto proyectoEnElQueTieneQueHaberParticipado;
	
	//Constructor
	public CondicionParticipoEnCiertoProyecto(Proyecto p){
		this.setProyecto(p);
	}
	
	//Retorna un booleano dependiendo del resultado de chequear la condicion por haber partidipado en cierto proyecto.
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
