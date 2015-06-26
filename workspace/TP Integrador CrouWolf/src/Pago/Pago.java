package Pago;

import java.util.List;

import CroudWolf.CroudWolf;
import Worker.Worker;

public abstract class Pago {

	List<CondicionYMontoDePago> condiciones;
	CroudWolf pagador;
	public List<CondicionYMontoDePago> getCondiciones() {
		return condiciones;
	}

	public void setCondiciones(List<CondicionYMontoDePago> condiciones) {
		this.condiciones = condiciones;
	}
	
	public float calcularMonto(Worker worker) {
		
		float monto=0;
		
		for (CondicionYMontoDePago c : this.getCondiciones()) {
			
			monto += c.calcularMonto(worker,this.getPagador());
			
			
		}
		
		return monto;
	}

	private CroudWolf getPagador() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void setPagador(CroudWolf pagador){
		this.pagador = pagador;
	}
	
	
}
