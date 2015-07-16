package Tarea;
import org.joda.time.DateTime;

import FeedBack.FeedBack;
public class Tarea {
	
	//Atributos.
	
	String instruccion;
	boolean disponible;
	FeedBack feedback;
	DateTime fecha;
	
	//Constructor
	
	public Tarea (String instruccion, FeedBack feedback){
		
	this.setDisponible(true);
	this.setInstruccion(instruccion);
	this.setFeedback(feedback);
	this.setFecha(new DateTime());
	}
	
	
	//Metodos


	public boolean estaCompleta() {  //Pregunta al feedback si se encuentra completo
		return this.getFeedback().estaCompleta();
	}

	

	public boolean estaCorrecta() { //Pregunta al feedback si se encuentra Correcto
		
		return this.getFeedback().estaCorrecta();
	}

	

	public boolean estaDisponible() { //Pregunta si es una tarea Disponible
		
		return disponible;
	}

	
	// Setters y Getters
	
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


	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}


	public DateTime getFecha() {
		return fecha;
	}




	public void setFecha(DateTime fecha) {
		this.fecha = fecha;
	}


	


}
