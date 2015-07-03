package PerfilWorker;

import Worker.Worker;

public class CondicionConTasaDeCorrecion extends CondicionDelWorker{
	
	private Int tasaDeCorrecion;
	
	
	//Constructor
	public CondicionConTasaDeCorrecion(Int i){
		this.setTasaDeCorrecion(i);
	}
	
	
	public boolean chequear(Worker w){
		return this.fijarseTasaDeCorrecion(w.getTareas());
	}
	
	private boolean fijarseTasaDeCorrecion(List<Tarea> t){
		int totalDeElementos;
		totalDeElementos = t.size();
		int tareasCorrectas = 0;
		for(Tarea t1 : t){
			if(t1.estaCorrecta()){
				tareasCorrectas ++
			}
		}
		return (((totalDeElementos * 100) / totalDeElementos) > this.getTasaDeCorrecion());
	}
	
	// getters y setters
	
	public void setTasaDeCorrecion(Int i){
		tasaDeCorrecion = i;
	}
	
	public Int getTasaDeCorrecion(){
		return tasaDeCorrecion;
	}
		
