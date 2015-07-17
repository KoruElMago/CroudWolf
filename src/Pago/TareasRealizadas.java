package Pago;

import Tarea.Tarea;

public class TareasRealizadas extends CondicionYMontoDePago {

	//Constructor.
	public TareasRealizadas(Float valor) {
		super(valor);
	}

	@Override
	//Implementa el mensaje abstracto y retorna si la tarea esta completa o no(con un boolean).
	public boolean chequearCondicion(Tarea t) {
		return t.estaCompleta();
	}
}
