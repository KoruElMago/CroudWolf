package Proyecto;

import java.util.List;

import Tarea.Tarea;

public class PaqueteDeTareas {
	
	//Atributos.
	List<Tarea> tareas;
	Proyecto proyecto;

	//Constructor.
	public PaqueteDeTareas(Proyecto p, List<Tarea> tareas){
		this.setProyecto(p);
		this.setTareas(tareas);
	}
	
	//Getters y setters.
	
	

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

	//Metodos.
	
	//Retorna un boolean si el paquete de tareas esta completo.
	public boolean estaCompleto() {
		for(Tarea t: this.getTareas()){
			if(!t.estaCompleta()){
				return false;
			}
		}
		return true;
	}

	//Retorna un boolean indicando si el paquete de tareas pertenece al proyecto dado por parametro.
	public boolean pertenceAProyecto(Proyecto proyecto2) {
		
		return proyecto2.equals(this.getProyecto());
		
	}
	
	
	//Si el paquete esta completo, notifica al proyecto
	public void seCompletoElPaquete(){

		
		if (this.estaCompleto()){
			
		
		this.getProyecto().notificarPaqueteCompleto(this);
			}
	}
	
	
	
}
