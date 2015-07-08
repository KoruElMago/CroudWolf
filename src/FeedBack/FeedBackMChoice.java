package FeedBack;

import java.util.List;

public class FeedBackMChoice extends FeedBack{
	
	//Harcodeado by Koru el Mago
	
	private List<RespuestasMChoice> respuestas; 
	//respuestas validas para esta pregunta
	
	private TipoChoice tipo;
	//Es el tipo de Multiple choice que es la diferencia entre ellos es 
	//basicamente la cantidad de respuestas puede tomar y como chequea si es correcta 
	
	public FeedBackMChoice(String pregunta, List<RespuestasMChoice> respuestas, TipoChoice tipo){
	
		this.setEstaCorrecta(false);
		this.setEstaValidada(false);
		this.setPregunta(pregunta);
		this.setRespuestas(respuestas);
		this.setTipo(tipo);
	}



	@Override
	public void validarse() {
		// le pasa al tipo que es que chequee la validacion
		this.getTipo().validar(this);
	}
	
	public void elegirRespuesta(RespuestasMChoice respuesta){
		//Prec: la respuesta pasada por parametro debe de ser de las respuestas que se 
		//encuentren el la lista de respuestas validas
		
		this.getTipo().elegirRespuesta(respuesta);
	}

	// getters & setters //
	public List<RespuestasMChoice> getRespuestas() {
		return respuestas;
	}

	public void setRespuestas(List<RespuestasMChoice> respuestas) {
		this.respuestas = respuestas;
	}

	public TipoChoice getTipo() {
		return tipo;
	}

	public void setTipo(TipoChoice tipo) {
		this.tipo = tipo;
	}
	
}
