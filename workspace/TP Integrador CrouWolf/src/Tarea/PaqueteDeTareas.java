package Tarea;

import java.util.List;

import CroudWolf.CroudWolf;
import Proyecto.Proyecto;

public class PaqueteDeTareas {
	
	List<Tarea> tareas;
	Proyecto proyecto;
	CroudWolf croudwolf;
	

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
			this.getCroudWolf().notificarPaqueteCompleto();
	}

	private CroudWolf getCroudWolf() {
		return (this.getProyecto().getCroudWolf());
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
	
	
	
	
}
