package FeedBack;

public class RespuestasMChoice {

	boolean valor;
	String respuesta;

	
	public RespuestasMChoice (String respuesta, boolean valor){
		this.setRespuesta(respuesta);
		this.setValor(valor);
		
	}
	public boolean esCorrecta() {
		return  valor;
	}

	public void setValor(boolean valor) {
		this.valor = valor;
	}
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	
}
