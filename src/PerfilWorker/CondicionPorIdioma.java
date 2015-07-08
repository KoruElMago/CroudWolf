package PerfilWorker;

import Worker.Worker;

public class CondicionPorIdioma extends CondicionDelWorker{
	
	private String idioma;
	
	//constructor
	public CondicionPorIdioma(String idioma){
		this.setIdioma(idioma);
	}

	//Retorna un booleano dependiendo del resultado de chequear la condicion por idioma.
	public boolean chequear(Worker w) {
		return w.getIdiomas().contains(idioma);
	}
	
	// getters y setters
	public void setIdioma(String idioma1){
		idioma = idioma1;
	}
	
	public String getIdiomas(){
		return idioma;
	}
}
