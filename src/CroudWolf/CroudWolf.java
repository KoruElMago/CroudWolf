package CroudWolf;

import java.util.ArrayList;
import java.util.List;

import Pago.Pago;
import Proyecto.PaqueteDeTareas;
import Proyecto.Proyecto;
import Worker.Worker;

public class CroudWolf {

	
	//Colaboradores internos
	
	List<Proyecto> proyectos;
	List<Pago> pagos;
	List<Worker> workers;
	List<TemaDeInteres> temasDeInteres;
	//Constructor
	public CroudWolf (){
		
		this.setProyectos(new ArrayList<Proyecto>());
		this.setPagos(new ArrayList<Pago>());
		this.setWorkers (new ArrayList<Worker>());
		this.setTemasDeInteres(new ArrayList<TemaDeInteres>());
	}

	//getters y setters
	
	
	public void setTemasDeInteres(List<TemaDeInteres> temas){
		
		this.temasDeInteres = temas;
	}
	
	public List<TemaDeInteres> getTemasDeInteres(){
		
		return this.temasDeInteres;
	}
	
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
	
	
	
	public void agregarWorker(Worker w){ //Agrega un Worker a la lista

		this.getWorkers().add(w);
	}

	public void agregarProyecto(Proyecto p){ //Agrega un proyecto a la lista y notifica un nuevo proyecto
		
		this.getProyectos().add(p);
		this.notificarNuevoProyecto(p);
	}
	
	public void agregarTemaDeInteres(TemaDeInteres t){ //Agrega un TemaDeInteres a la lista
		this.getTemasDeInteres().add(t);
	}

	public void notificarNuevoProyecto(Proyecto p){ //Le pide a los temas de interes del proyecto que notifiquen a sus workers subscriptos
		
		for(TemaDeInteres i : p.getTemasDeInteres()){
			
			i.notificarWorkers(p);
		}
	}
	


	
	
	

}
