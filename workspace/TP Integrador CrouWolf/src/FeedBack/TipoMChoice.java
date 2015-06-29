package FeedBack;

import java.util.List;

public abstract class TipoMChoice {
	
	protected List<RespuestasMChoice> respuestasDadas;

	public void validar(FeedBack feedBack){
		boolean res = false;
		for(RespuestasMChoice r : this.getRespuestasDadas()){
			res = res || r.esCorrecta();
		}
		if(res) {
			feedBack.setEstado(new EstFeedBackCorrecto());
		}
		else{
			feedBack.setEstado(new EstFeedBackIncorrecto());
		}
	}

	public abstract void elegirRespuesta(RespuestasMChoice respuesta) ;

	public List<RespuestasMChoice> getRespuestasDadas() {
		return respuestasDadas;
	}

	protected void setRespuestasDadas(List<RespuestasMChoice> respuestasDadas) {
		this.respuestasDadas = respuestasDadas;
	}

	
}
