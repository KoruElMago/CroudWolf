package CroudWolf;

import java.util.ArrayList;
import java.util.List;

import Proyecto.Proyecto;
import Worker.Worker;

public class TemaDeInteres {
	
	private List<Worker> workers;
	private String tema;


	//constructor
	public TemaDeInteres(String t){	
		this.setWorkers(new ArrayList<Worker>());
		this.setTema(t);
	}
	
	public void notificarWorkers(Proyecto p) {
		for (Worker w: this.getWorkers()){
			w.getPosiblesProyectos().add(p);
		}
	}

	public void agregarWorker(Worker w){
		this.getWorkers().add(w);
	}
	
	//getters y setters
	
	private List<Worker> getWorkers() {
		return workers;
	}
	
	private void setWorkers(List<Worker> ws){
		workers = ws;
	}

	private void setTema(String t) {
		tema = t;
	}


	
	

}
