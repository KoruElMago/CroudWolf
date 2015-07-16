package FeedBack;

public class FeedBackAbierto extends FeedBack {
	
	//HardCoded by Koru the Wizard
	//Este Tipo de FeedBack tiene la particularidad de que no puede ser validada automaticamente
	//y su validacion debe de hacerla alguien de por fuera 
	
	//Atributos.
	private String respuesta;
	
	public FeedBackAbierto(String pregunta){
		this.setPregunta(pregunta);
		this.setEstaValidada(false);
		this.setEstaCorrecta(false);
		
	}

	@Override
	public void validarse() {
		//este FeedBack debe ser validado manualmente comprobando si el texto dado es validado
		//con lo cual este metodo no hace nada
	}


	//Permite poner una respuesta en el feedBack
	public void responder(String respuesta) {
		this.respuesta = respuesta;
	}
	
	public void validacionManual(boolean  estado){
		//Esta es la manera mediante la cual se valida este tipo de FeedBack
		//se pasa por parametro el estado que indica si la validacion fue correcta o incorrecta
		
		this.setEstaCorrecta(estado);
		this.setEstaValidada(true);
		
	}
	
	
	// getters & setters //
	public String getRespuesta() {
		return respuesta;
	}
}
