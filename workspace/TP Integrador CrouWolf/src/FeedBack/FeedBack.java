package FeedBack;

public abstract class FeedBack {

	//Harcodeado by Koru el Mago
	
	private String pregunta;
	
	private EstadoFeedBack estado;
	//Este estado es como guarda el FeedBack si fue validada y en caso de serlo si fue validado correcta o incorrectamente
	
	public abstract void validarse();
	//Este metodo es aquel que se envia para chequear la validacion del sistema 
	
	public boolean estaValidada() {
		//le pregunta al estado si esta validada
		return this.getEstado().estaValidada();
	}
	
	// setters & getters //
	
	
	public String getPregunta() {
		return pregunta;
	}

	protected void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public EstadoFeedBack getEstado() {
		return estado;
	}

	public void setEstado(EstadoFeedBack estado) {
		this.estado = estado;
	}
	
	
	
}
