package Proyecto;

import java.util.List;

import Tarea.Tarea;

public class PaqueteDeTareas {
	
	List<Tarea> tareas;
	Proyecto proyecto;

	public PaqueteDeTareas(Proyecto p, List<Tarea> tareas){
		this.setProyecto(p);
		this.setTareas(tareas);
	}
	
	public void seCompletoElPaquete(){

		
		if (this.estaCompleto()){
			
		
		this.getProyecto().notificarPaqueteCompleto(this);
			}
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
		for(Tarea t: this.getTareas()){
			if(!t.estaCompleta()){
				return false;
			}
		}
		return true;
	}

	public boolean pertenceAProyecto(Proyecto proyecto2) {
		
		return proyecto2.equals(this.getProyecto());
		
	}
	
	
	
	
}
