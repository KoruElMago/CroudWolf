package FeedBack;

import java.util.ArrayList;
import java.util.List;

public abstract class TipoChoice {
	
	protected List<RespuestaCompletable> respuestasDadas;

	public TipoChoice(){
		this.setRespuestasDadas(new ArrayList<RespuestaCompletable>());
	}
	public void validar(FeedBack feedBack){
		boolean res = false;
		for(RespuestaCompletable r : this.getRespuestasDadas()){
			res = res || r.esCorrecta();
		}
	feedBack.setEstaCorrecta(res);
	feedBack.setEstaValidada(true);
	}

	public abstract void elegirRespuesta(RespuestaCompletable respuesta) ;

	public List<RespuestaCompletable> getRespuestasDadas() {
		return respuestasDadas;
	}

	protected void setRespuestasDadas(List<RespuestaCompletable> respuestasDadas) {
		this.respuestasDadas = respuestasDadas;
	}

	
}
