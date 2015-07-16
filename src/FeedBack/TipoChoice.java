package FeedBack;

import java.util.ArrayList;
import java.util.List;

public abstract class TipoChoice {
	
	protected List<RespuestaCompletable> respuestasDadas;

	//Constructor
	public TipoChoice(){
		this.setRespuestasDadas(new ArrayList<RespuestaCompletable>());
	}
	
	//Valida el feedback.
	public void validar(FeedBack feedBack){
		boolean res = false;
		for(RespuestaCompletable r : this.getRespuestasDadas()){
			res = res || r.esCorrecta();
		}
	feedBack.setEstaCorrecta(res);
	feedBack.setEstaValidada(true);
	}

	//Toma una respuesta que eligio el usuario como parametro, de ahi se verá como se implementara.
	public abstract void elegirRespuesta(RespuestaCompletable respuesta) ;

	//Getters y setters.
	public List<RespuestaCompletable> getRespuestasDadas() {
		return respuestasDadas;
	}

	protected void setRespuestasDadas(List<RespuestaCompletable> respuestasDadas) {
		this.respuestasDadas = respuestasDadas;
	}

	
}
