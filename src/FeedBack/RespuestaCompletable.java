package FeedBack;

public class RespuestaCompletable  {

	
	boolean valor;
	String respuesta;

	//Constructor.
	public RespuestaCompletable (boolean valor){
		this.setValor(valor);
		
	}
	
	//Getters y setters (Algunos cambiados de nombre).
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
