package Pago;

import Tarea.Tarea;
import Worker.Worker;

public abstract class CondicionYMontoDePago {

 //Atributos.
 float valorPorCondicion;

//Constructor.
public CondicionYMontoDePago(Float valor) {
	this.setValorPorCondicion(valor);
}

//Calcula el monto que debe recibir un worker por sus tareas completadas.
public float calcularMonto(Worker worker) {
	
	float res = 0;
	for(Tarea t : worker.getTareas()){
		if(this.chequearCondicion(t)){
			res += this.getValorPorCondicion();
		}
	}
	return res ;

}

//Mensaje abstracto que devuelve un booleano al chequear la condicion.
public abstract boolean chequearCondicion(Tarea t);

//Getters y setters.
public float getValorPorCondicion() {
	return valorPorCondicion;
}

public void setValorPorCondicion(float valorPorCondicion) {
	this.valorPorCondicion = valorPorCondicion;
}
}
