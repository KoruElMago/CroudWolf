package Pago;

import Tarea.Tarea;
import Worker.Worker;

public abstract class CondicionYMontoDePago {

 float valorPorCondicion;

 
public CondicionYMontoDePago(Float valor) {
	this.setValorPorCondicion(valor);
}
public float getValorPorCondicion() {
	return valorPorCondicion;
}

public void setValorPorCondicion(float valorPorCondicion) {
	this.valorPorCondicion = valorPorCondicion;
}

public float calcularMonto(Worker worker) {
	
	float res = 0;
	for(Tarea t : worker.getTareas()){
		if(this.chequearCondicion(t)){
			res += this.getValorPorCondicion();
		}
	}
	return res ;

}

public abstract boolean chequearCondicion(Tarea t);
}
