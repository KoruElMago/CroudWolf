package FeedBack;

public class RespuestaCompletable  {

	
	boolean valor;
	String respuesta;

	
	public RespuestaCompletable (boolean valor){
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
	public void responder(String respuesta) {
		this.respuesta = respuesta;
	}
}