package Pago;

import java.util.List;

import Worker.Worker;

public abstract class Pago {

	List<CondicionYMontoDePago> condiciones;

	public List<CondicionYMontoDePago> getCondiciones() {
		return condiciones;
	}

	public void setCondiciones(List<CondicionYMontoDePago> condiciones) {
		this.condiciones = condiciones;
	}
	
	public float calcularMonto(Worker worker) {
		
		float monto=0;
		
		for (CondicionYMontoDePago c : this.getCondiciones()) {
			
			monto += this.calcularMonto(worker,c);
			
			
		}
		
		return monto;
	}
	
	public abstract float calcularMonto(Worker worker,CondicionYMontoDePago c);
	
}
