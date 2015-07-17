package PerfilWorker;

import java.util.List;

import Worker.Worker;
import Tarea.Tarea;

public class CondicionConTasaDeCorreccion extends CondicionDelWorker{
	
	//Atributos.
	private int tasaDeCorrecion;
	//Es un numero que indica el porcentaje que debe de tener un worker en su tasa de correccion.
	
	
	//Constructor
	public CondicionConTasaDeCorreccion(int i){
		this.setTasaDeCorrecion(i);
	}
	
	//Retorna un booleano dependiendo del resultado de chequear la condicion por tasa de correccion.
	public boolean chequear(Worker w){
		return this.fijarseTasaDeCorrecion(w.getTareas());
	}
	
	public boolean fijarseTasaDeCorrecion(List<Tarea> t){
		int tareasCorrectas = 0;
		for(Tarea t1 : t){
			if(t1.estaCorrecta()){
				tareasCorrectas ++;
			}
		}
		return (((tareasCorrectas/t.size())*100) > this.getTasaDeCorrecion());
	}
	
	// getters y setters
	
	public void setTasaDeCorrecion(int i){
		tasaDeCorrecion = i;
	}
	
	public int getTasaDeCorrecion(){
		return tasaDeCorrecion;
	}
}
