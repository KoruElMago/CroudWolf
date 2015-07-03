package FeedBack;

public abstract class FeedBack {

	//Harcodeado by Koru el Mago
	
	private String pregunta;
	private boolean estaValidada;
	private boolean estaCorrecta;
	
	//Este estado es como guarda el FeedBack si fue validada y en caso de serlo si fue validado correcta o incorrectamente
	
	public abstract void validarse();
	//Este metodo es aquel que se envia para chequear la validacion del sistema 
	
	public boolean estaValidada() {
		//le pregunta al estado si esta validada
		return estaValidada;
	}
	
	public boolean estaCorrecta(){
		return estaCorrecta;
	}
	// setters & getters //
	
	
	public String getPregunta() {
		return pregunta;
	}

	protected void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public void setEstaValidada(boolean estaValidada) {
		this.estaValidada = estaValidada;
	}

	public void setEstaCorrecta(boolean estaCorrecta) {
		this.estaCorrecta = estaCorrecta;
	}

	
	
	
	
}
