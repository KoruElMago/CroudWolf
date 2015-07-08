package Pago;

import Tarea.Tarea;

import org.joda.time.*;


public class TareasRealizadasAntesDe extends CondicionYMontoDePago{

	
	DateTime fecha;
	
	public TareasRealizadasAntesDe(Float valor, DateTime fecha) {
		super(valor);
		this.setFecha((new DateTime()).toDateTime());
	}
	
	
	
	
	public DateTime getFecha() {
		return fecha;
	}




	public void setFecha(DateTime fecha) {
		this.fecha = fecha;
	}




	@Override
	public boolean chequearCondicion(Tarea t) {
		return this.getFecha().isAfter(t.getFecha());
	}
	
	
	
	
	
	

}
