package Pago;

import Tarea.Tarea;

import org.joda.time.*;


public class TareasRealizadasAntesDe extends CondicionYMontoDePago{

	//Atributos.	
	DateTime fecha;
	
	//Constructor.
	public TareasRealizadasAntesDe(Float valor, DateTime fecha) {
		super(valor);
		this.setFecha(fecha);
	}
	
	
	@Override
	//Implementa el mensaje abstracto chequeando si esta en dondicion en base a la fecha.
	public boolean chequearCondicion(Tarea t) {
		return this.getFecha().isBefore(t.getFecha());
	}
		
	//Getters y setters.
	public DateTime getFecha() {
		return fecha;
	}

	public void setFecha(DateTime fecha) {
		this.fecha = fecha;
	}
}
