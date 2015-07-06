package Proyecto;

import java.util.ArrayList;
import java.util.List;

import CroudWolf.CroudWolf;
import CroudWolf.TemaDeInteres;
import Pago.Pago;
import PerfilWorker.PerfilDelWorker;
import Tarea.PaqueteDeTareas;
import Tarea.Tarea;
import Worker.Worker;


public class Proyecto {
	
	private List<Tarea> tareas;
	private List<TemaDeInteres> temasDeInteres;
	private String nombre1;
	private String descripcion;
	private PerfilDelWorker perfilWorker;
	private CroudWolf croudWolf;
	private Integer tamanhoPaquetes;
	private List<Worker> subscriptos;
	private Pago pago;
	
	

	//constructor.
	public Proyecto (String nombre, String descripcion, CroudWolf cw, PerfilDelWorker pdw){
		this.setNombre(nombre);
		this.setDescripcion(descripcion);
		this.setTamanhoPaquetes(1); //por defecto sera uno, se podra cambiar en todo caso.
		this.setCroudWolf(cw);
		this.setTareas(new ArrayList<Tarea>());
		this.setTemasDeInteres(new ArrayList<TemaDeInteres>());
		this.setPerfilDelWorker(pdw);
		this.setSubscriptos(new ArrayList<Worker>());
	}

	
	
	//Agrega una tarea a la lista de tareas del proyecto.	
	public void agregarTarea(Tarea t){
		this.getTareas().add(t);
	}
	
	//Agrega una lista de tareas a la lista del proyecto.
	public void agregarTarea(List<Tarea> t){
		this.getTareas().addAll(t);
	}
	
	//Agrega un tema de interes al proyecto.
	public void agregarTemaDeInteres(TemaDeInteres t){
		this.temasDeInteres.add(t);
	}

	//Retorna el proximo parquete de tareas.
	private PaqueteDeTareas proximoPaqueteDeTareas(){
		return (new PaqueteDeTareas(this));
	}
	
	//Da a un worker el proximo paquete de tareas que debe resolver.
	//Asumo que el worker esta dentro del proyecto.
	public void solicitarNuevoPaqueteDeTareas(Worker w){
		w.asignarPaqueteDeTareas(this.proximoPaqueteDeTareas());
	}

	//Retorna una lista de tareas disponible que posee el proyecto.
	public List<Tarea> tareasDisponibles() {
		List <Tarea>rs = new ArrayList<Tarea>();
		for (Tarea t : this.getTareas()){
			if(t.estaDisponible()){
				rs.add(t);
			}
		}
		return rs;
	}
	
	//Retorna una lista de tareas completas que posee el proyecto.
	public List<Tarea> tareasCompletas(){
		List<Tarea>rs = new ArrayList<Tarea>();
		for (Tarea t : this.getTareas()){
			if(t.estaCompleta()){
				rs.add(t);
			}
		}
		return rs;
	}
	
	//Retorna una lista de tareas incompletas que posee el proyecto.
	public List<Tarea> tareasIncompletas(){
		List<Tarea> rs = new ArrayList<Tarea>();
		for (Tarea t : this.getTareas()){
			if(!t.estaCompleta()){
				rs.add(t);
			}
		}
		return rs;
	}
	
	//Agrega un subcripto al proyecto(que son workers).
	public void agregarSubscripto(Worker w){
		this.getSubscriptos().add(w);
	}

	//getters y setters

	private void setNombre(String nombre){
		this.nombre1 = nombre;
	}
	
	private void setDescripcion(String descripcion){
		this.descripcion = descripcion;
	}
	
	public List<Tarea> getTareas(){
		return tareas;
	}
	
	public void setPerfilDelWorker(PerfilDelWorker pdw){
		this.perfilWorker = pdw;
	}

	public List<TemaDeInteres> getTemasDeInteres() {
		return temasDeInteres;
	}

	public void setTemasDeInteres(List<TemaDeInteres> temasDeInteres) {
		this.temasDeInteres = temasDeInteres;
	}

	public String getNombre1() {
		return nombre1;
	}

	public PerfilDelWorker getPerfilWorker() {
		return perfilWorker;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	public Pago getPago() {
		return pago;
	}

	public void setPago(Pago pago) {
		this.pago = pago;
	}

	public void setTareas(ArrayList<Tarea> tareas) {
		this.tareas = tareas;
	}
	
	public int getTamanhoPaquetes(){
		return tamanhoPaquetes;
	}
	
	public void setTamanhoPaquetes(Integer i){
		tamanhoPaquetes = i;
	}

	public List<Worker> getSubscriptos() {
		return subscriptos;
	}

	public void setSubscriptos(List<Worker> subscriptos) {
		this.subscriptos = subscriptos;
	}
	
	public CroudWolf getCroudWolf() {
		return croudWolf;		
	}

	public void setCroudWolf(CroudWolf cw){
		croudWolf = cw;
	}
	
}
