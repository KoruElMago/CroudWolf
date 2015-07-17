package Tarea;
import org.joda.time.DateTime;

import FeedBack.FeedBack;
public class Tarea {
	
	//Atributos
	
	String instruccion;
	boolean disponible;
	FeedBack feedback;
	DateTime fecha;
	boolean esObligatoria;
	
	//Constructor
	
	public Tarea (String instruccion, FeedBack feedback){
		
	this.setDisponible(true);
	this.setInstruccion(instruccion);
	this.setFeedback(feedback);
	this.setFecha(new DateTime());
	this.setEsObligatoria(false);
	}
	
	
	// Setters y Getters
	
	public String getInstruccion() {
		return instruccion;
	}



	public void setInstruccion(String instruccion) {
		this.instruccion = instruccion;
	}



	

	public boolean esObligatoria() {
		return esObligatoria;
	}


	private void setEsObligatoria(boolean esObligatoria) {
		this.esObligatoria = esObligatoria;
	}


	public FeedBack getFeedback() {
		return feedback;
	}




	public void setFeedback(FeedBack feedback) {
		this.feedback = feedback;
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


	

	//Metodos


	public boolean estaCompleta() {  //Pregunta al feedback si la tarea se encuentra completa
		return this.getFeedback().estaCompleta();
	}

	

	public boolean estaCorrecta() { //Pregunta al feedback si la tarea se encuentra Correcta
		
		return this.getFeedback().estaCorrecta();
	}

	public void marcarComoObligatoria(){
		this.setEsObligatoria(true);
	}

	public boolean estaDisponible() { //Pregunta si es una tarea Disponible
		
		return disponible;
	}

}
