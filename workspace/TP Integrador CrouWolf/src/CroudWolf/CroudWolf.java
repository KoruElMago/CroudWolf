package CroudWolf;

import java.util.ArrayList;
import java.util.List;

import Pago.Pago;
import Proyecto.Proyecto;
import Tarea.PaqueteDeTareas;
import Worker.Worker;

public class CroudWolf {

	
	//Colaboradores internos
	
	List<Proyecto> proyectos;
	List<Pago> pagos;
	List<Worker> workers;
	
	//Constructor
	public CroudWolf (){
		
		this.setProyectos(new ArrayList<Proyecto>());
		this.setPagos(new ArrayList<Pago>());
		this.setWorkers (new ArrayList<Worker>());
	}

	//getters y setters
	
	public List<Proyecto> getProyectos() {
		return proyectos;
	}


	public void setProyectos(List<Proyecto> proyectos) {
		this.proyectos = proyectos;
	}


	public List<Pago> getPagos() {
		return pagos;
	}


	public void setPagos(List<Pago> pagos) {
		this.pagos = pagos;
	}



	public List<Worker> getWorkers() {
		return workers;
	}


	public void setWorkers(List<Worker> workers) {
		this.workers = workers;
	}

	//Metodos
	
	public void agregarWorker(Worker w){

		this.getWorkers().add(w);
	}

	public void agregarProyecto(Proyecto p){
		
		this.getProyectos().add(p);
		this.notificarNuevoProyecto(p);
	}


	public void notificarNuevoProyecto(Proyecto p){
		
		for(TemaDeInteres i : p.getTemasDeInteres()){
			
			i.notificarWorkers(p);
		}
	}
	
	// Cuando un paquete de tareas se termina, tiene que pagarse.

	public void notificarPaqueteCompleto(PaqueteDeTareas paqueteDeTareas) {
		
		for(Worker w :paqueteDeTareas.getProyecto().getSubscriptos()){
			
			
			if(w.getPaqueteDeTareas().contains(paqueteDeTareas)){
				
				w.recibePago(paqueteDeTareas.getProyecto().getPago());
				return;
			}
		}
		
		
	}
	
	
	

}
