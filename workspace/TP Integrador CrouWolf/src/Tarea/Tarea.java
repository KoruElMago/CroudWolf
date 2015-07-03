package Tarea;
import org.joda.time.DateTime;

import FeedBack.FeedBack;
public class Tarea {
	
	
	String instruccion;
	boolean disponible;
	FeedBack feedback;
	DateTime fecha;

	public Tarea (String instruccion, FeedBack feedback){
		
	this.setDisponible(true);
	this.setInstruccion(instruccion);
	this.setFeedback(feedback);
	this.setFecha(new DateTime());
	}
	
	
	
	
	public String getInstruccion() {
		return instruccion;
	}



	public void setInstruccion(String instruccion) {
		this.instruccion = instruccion;
	}




	public FeedBack getFeedback() {
		return feedback;
	}




	public void setFeedback(FeedBack feedback) {
		this.feedback = feedback;
	}




	public boolean isDisponible() {
		return disponible;
	}




	public DateTime getFecha() {
		return fecha;
	}




	public void setFecha(DateTime fecha) {
		this.fecha = fecha;
	}




	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}



	public boolean estaCompleta() {
		return this.getFeedback().estaCompleta();
	}

	

	public boolean estaCorrecta() {
		
		return this.getFeedback().estaCorrecta();
	}

	public boolean esTareaCompleta() {
		
		
		return this.getFeedback().estaCompleta();
	}

	public boolean estaDisponible() {
		
		return disponible;
	}

}
