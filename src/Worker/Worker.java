package Worker;

import java.util.ArrayList;
import java.util.List;

import Pago.Pago;
import Proyecto.PaqueteDeTareas;
import Proyecto.Proyecto;
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
	public Worker (String nombre, int edad, List<String> idiomas){
		
		this.setNombre(nombre);
		this.setTareas(new ArrayList<PaqueteDeTareas>());
		this.setIdiomas(idiomas);
		this.setEdad(edad);
		this.setPosiblesProyectos(new ArrayList<Proyecto>());
		this.setSubscripciones(new ArrayList<Proyecto>());
		this.setPagos(new ArrayList<Pago>());
	
		
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
	
	//Agrega un idioma al worker.
	public void agregarIdioma(String s){
		this.getIdiomas().add(s);
	}
	
	//Recibe una notificacion de un proyecto dado por parametro.
	public void notificarProyecto(Proyecto p){
		this.getPosiblesProyectos().add(p);
	}

	//Se le asigna al worker el proximo paquete de tareas si esque puede recibirlo.
	public void asignarPaqueteDeTareas(PaqueteDeTareas proximoPaqueteDeTareas) {
		for(PaqueteDeTareas t: this.getPaqueteDeTareas()){
			if(t.pertenceAProyecto(proximoPaqueteDeTareas.getProyecto())){
				if(!t.estaCompleto()){
					return;
				}
			}
		}
		tareas.add(proximoPaqueteDeTareas);
	}

	


	public List<PaqueteDeTareas> getPaqueteDeTareas() {
		
		return tareas;
	}

	//El worker recibe un pago.
	public void recibePago(Pago pago) {
		
		if(!this.getPagos().contains(pago)){
			
			this.getPagos().add(pago);
		
		}
	}
	
	//Retorna un boolean dependiendo si el worker tiene el paquete de tareas dado por parametro.
	public boolean tienePaquete(PaqueteDeTareas paqueteDeTareas) {
		
		return this.getPaqueteDeTareas().contains(paqueteDeTareas);
<<<<<<< HEAD
	}

	//Retorna un boolean indicando si el worker participo en el proyecto dado por parametro.
	public boolean participoEn(Proyecto proyecto) {
		return this.getSubscripciones().contains(proyecto);
	}

	//Retorna un boolean indicando si el worker sabe el idioma dado por parametro.
	public boolean sabeIdioma(String idioma) {
		return this.getIdiomas().contains(idioma);
=======
>>>>>>> origin/master
	}
	
	

	
	

	

}
