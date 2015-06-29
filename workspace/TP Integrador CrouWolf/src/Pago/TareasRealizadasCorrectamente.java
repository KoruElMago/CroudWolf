package Pago;

import Tarea.Tarea;

public class TareasRealizadasCorrectamente extends CondicionYMontoDePago {

	
	public TareasRealizadasCorrectamente(Float valor) {
		super(valor);
	}

	@Override
	public boolean chequearCondicion(Tarea t) {
		return t.estaCorrecta();
	}



}
