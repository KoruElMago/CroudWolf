package Pago;

import Tarea.Tarea;

public class TareasRealizadas extends CondicionYMontoDePago {

	public TareasRealizadas(Float valor) {
		super(valor);
	}

	@Override
	public boolean chequearCondicion(Tarea t) {
		return t.estaCompleta();
	}

	


}
