package Pago;

import Tarea.Tarea;

public class TareasRealizadasCorrectamente extends CondicionYMontoDePago {

	//Constructor.
	public TareasRealizadasCorrectamente(Float valor) {
		super(valor);
	}

	@Override
	//Implementa el mensaje abstracto retornando si esta correcta o no con un boolean.
	public boolean chequearCondicion(Tarea t) {
		return t.estaCorrecta();
	}
}
