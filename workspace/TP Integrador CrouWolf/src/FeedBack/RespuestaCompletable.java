package FeedBack;

public class RespuestaCompletable extends RespuestasMChoice {

	
	public RespuestaCompletable(boolean valor) {
		super(null, valor);
	}
	
	public void responder(String respuesta){
		this.setRespuesta(respuesta);
	}
}
