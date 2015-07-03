package Worker;

import java.util.ArrayList;
import java.util.List;

import Pago.Pago;
import Proyecto.Proyecto;
import Tarea.PaqueteDeTareas;
import Tarea.Tarea;


public class Worker {

	//Atributos
	
	private String nombre;
	private List<String> idiomas;
	private int edad;
	private List<PaqueteDeTareas> tareas;
	private List<Proyecto> posiblesProyectos;
	private List<Proyecto> subscripciones;
	private List<Pago> pagos;
	
	
	
	
	//Constructor
	public Worker (String nombre, int edad){
		
		this.setNombre(nombre);
		this.setTareas(new ArrayList<PaqueteDeTareas>());
		this.setIdiomas(new ArrayList<String>());
		this.setEdad(edad);
		this.setPosiblesProyectos(new ArrayList<Proyecto>());
		this.setSubscripciones(new ArrayList<Proyecto>());
	
		
	}

	//Getters and Setters
	public List<String> getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(List<String> idiomas) {
		this.idiomas = idiomas;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	
	
	public List<Pago> getPagos() {
		return pagos;
	}

	public void setPagos(List<Pago> pagos) {
		this.pagos = pagos;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Tarea> getTareas() {
		
		List<Tarea> ts= new ArrayList<Tarea>();
		for(PaqueteDeTareas t : tareas){
			ts.addAll(t.getTareas());
		}
		
		return ts;
	}

	public void setTareas(List<PaqueteDeTareas> tareas) {
		this.tareas = tareas;
	}
	
	
	
	
	public List<Proyecto> getPosiblesProyectos() {
		return posiblesProyectos;
	}

	public void setPosiblesProyectos(List<Proyecto> posiblesProyectos) {
		this.posiblesProyectos = posiblesProyectos;
	}

	public List<Proyecto> getSubscripciones() {
		return subscripciones;
	}

	public void setSubscripciones(List<Proyecto> subscripciones) {
		this.subscripciones = subscripciones;
	}

	//Metodos
	
	public void notificarProyecto(Proyecto p){
		this.getPosiblesProyectos().add(p);
	}

	public void asignarPaqueteDeTareas(PaqueteDeTareas proximoPaqueteDeTareas) {
		for(PaqueteDeTareas t: this.select(tareas, proximoPaqueteDeTareas.getProyecto())){
			if(!t.estaCompleto()){
				return;
			}
		}
		tareas.add(proximoPaqueteDeTareas);
		
	}

	private List<PaqueteDeTareas> select(List<PaqueteDeTareas> tareas2, Proyecto proyecto) {
		List<PaqueteDeTareas> ls = new ArrayList<PaqueteDeTareas>();
		for (PaqueteDeTareas p: tareas2){
			if(p.getProyecto().equals(p)){
				ls.add(p);
			}		
		}
		return ls;
	}

	public List<PaqueteDeTareas> getPaqueteDeTareas() {
		
		return tareas;
	}

	public void recibePago(Pago pago) {
		
		this.getPagos().add(pago);
	}
	
	

	
	

	

}
