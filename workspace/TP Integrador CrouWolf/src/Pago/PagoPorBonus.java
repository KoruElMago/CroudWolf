package Pago;

import java.util.List;

import Worker.Worker;

import CroudWolf.CroudWolf;

public class PagoPorBonus extends Pago {

	private CroudWolf pagador;
	
	public PagoPorBonus(CroudWolf mockCroudWolf,
			List<CondicionYMontoDePago> condiciones) {
	
		this.setCondiciones(condiciones);
		this.setPagador(pagador);
	
	}

	public CroudWolf getPagador() {
		return pagador;
	}

	public void setPagador(CroudWolf pagador) {
		this.pagador = pagador;
	}

	public float calcularMonto(Worker worker) {
		
		float monto=0;
		
		for (CondicionYMontoDePago c : this.getCondiciones()) {
			
			monto += c.calcularMonto(worker);
			
			
		}
		
		return monto;
	}

	
	
	
}
