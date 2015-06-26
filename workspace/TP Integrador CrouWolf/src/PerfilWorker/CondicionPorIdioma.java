package PerfilWorker;

import Worker.Worker;

public class CondicionPorIdioma extends CondicionDelWorker{
	
	String idioma;
	
	public CondicionPorIdioma(String idioma){
		this.idioma= idioma;
	}

	public boolean chequear(Worker w) {
		return w.getIdiomas().contains(idioma);
	}
}
