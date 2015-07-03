package Tarea;


public class Tarea {
	
	String instruccion;
	boolean disponible;
	Feedback feedback;


	public Tarea (String instruccion, Feedback feedback){
		
	this.setDisponible(true);
	this.setInstruccion(instruccion);
	this.setFeedback(feedback);
	
	}
	
	
	
	
	public String getInstruccion() {
		return instruccion;
	}



	public void setInstruccion(String instruccion) {
		this.instruccion = instruccion;
	}



	
	}



	public void setDisponible(boolean disponible) {
		Disponible = disponible;
	}



	public boolean estaCompleta() {
		this.getFeedback().getEstado();
		return false;
	}

	

	public boolean estaCorrecta() {
		
		return this.getFeedback().estaCorrecta;
	}

	public boolean esTareaCompleta() {
		
		
		return this.getFeedback().estaCompleta();
	}

	public boolean estaDisponible() {
		
		return disponible;
	}

}
