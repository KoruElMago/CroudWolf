package Proyecto;

import java.util.ArrayList;
import java.util.List;

import CroudWolf.CroudWolf;
import PerfilWorker.PerfilDelWorker;
import Tarea.Tarea;
import Worker.Worker;


public class Proyecto {
	
	private ArrayList<Tarea> tareas;
	private ArrayList<String> temasDeInteres;
	private String nombre1;
	private String descripcion;
	private PerfilDelWorker perfilWorker;
	
	
	
	public Proyecto (String nombre, String descripcion){
		this.setNombre(nombre1);
		this.setDescripcion(descripcion);
	}

	
	
	
	public void agregarTarea(Tarea t){
		this.getTareas().add(t);
	}
	
	public void agregarTarea(List<Tarea> t){
		this.getTareas().add(t);
	}
	
	public void agregarTemaDeInteres(String t){
		this.temasDeInteres.add(t);
	}
	
	public void solicitarMasTareas(Worker w){
		w.asignarTareas(this.proximoPaqueteTareas());
	}
	
	

	public Tarea tareaDisponible() {
		return this.tareasDisponibles().first();
	}

	private List<Tarea> tareasDisponibles2() {
		List <Tarea>rs = new ArrayList<Tarea>();
		for (Tarea t : this.getTareas()){
			if(t.esaDisponible()){
				rs.add(t);
			}
		}
		return rs;
	}
	
	
	
	private List<Tarea> tareasCompletas(){
		List<Tarea>rs = new ArrayList<Tarea>();
		for (Tarea t : this.getTareas()){
			if(t.estaCompleta()){
				rs.add(t);
			}
		}
		return rs;
	}

	public List<Tarea> tareasIncompletas(){
		return tareasIncompletas2();
	}
	
	private List<Tarea> tareasIncompletas2(){
		rs = ArrayList<Tarea>();
		for (Tarea t : this.getTareas){
			if(t.esTareaIncompleta()){
				rs.addd(t);
			}
		}
	}

	//getters y setters

	private void setNombre(String nombre){
		this.nombre1 = nombre;
	}
	
	private void setDescripcion(String descripcion){
		this.descripcion = descripcion;
	}
	
	private List<Tarea> getTareas(){
		return tareas;
	}
	
	private void setPerfilDelWorker(PerfilDelWorker pdw){
		this.perfilWorker = pdw;
	}

	
	// Implementar !!!!!
	public CroudWolf getCroudWolf() {
		// TODO Auto-generated method stub
		
	}




	public ArrayList<String> getTemasDeInteres() {
		return temasDeInteres;
	}




	public void setTemasDeInteres(ArrayList<String> temasDeInteres) {
		this.temasDeInteres = temasDeInteres;
	}




	public String getNombre1() {
		return nombre1;
	}




	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}




	public PerfilDelWorker getPerfilWorker() {
		return perfilWorker;
	}




	public void setPerfilWorker(PerfilDelWorker perfilWorker) {
		this.perfilWorker = perfilWorker;
	}




	public String getDescripcion() {
		return descripcion;
	}




	public void setTareas(ArrayList<Tarea> tareas) {
		this.tareas = tareas;
	}
	
	
	

}
