package Proyecto;

import java.util.List;

import CroudWolf.CroudWolf;
import Tarea.Tarea;

public class PaqueteDeTareas {
	
	List<Tarea> tareas;
	Proyecto proyecto;
	

	public PaqueteDeTareas(Proyecto p, List<Tarea> tareas){
		this.setProyecto(p);
		this.setTareas(tareas);
	}
	
	public void completarTarea(){

		for(Tarea t  : this.getTareas()){
			if (! t.estaCompleta()){
				return;
			}
		}
			this.getProyecto().getCroudWolf().notificarPaqueteCompleto(this);
	}

	public List<Tarea> getTareas() {
		return tareas;
	}

	public void setTareas(List<Tarea> tareas) {
		this.tareas = tareas;
	}

	public Proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

	public boolean estaCompleto() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
}
