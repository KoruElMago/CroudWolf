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
	
	public List<Worker> getWorkers() {
		return workers;
	}
	
	public void setWorkers(List<Worker> ws){
		workers = ws;
	}

	public void setTema(String t) {
		this.tema=t;
	}
	
	public String getTema(){
		return tema;
	}

}
