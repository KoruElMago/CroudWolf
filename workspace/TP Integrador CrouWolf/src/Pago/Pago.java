package Pago;

import java.util.ArrayList;
import java.util.List;

import CroudWolf.CroudWolf;
import Worker.Worker;

public class Pago {

	List<CondicionYMontoDePago> condiciones;
	CroudWolf pagador;
	
	
	public Pago (CroudWolf croudwolf){
		this.setPagador(croudwolf);
		this.setCondiciones(new ArrayList<CondicionYMontoDePago>());
	}
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
		return pagador;
	}
	
	public void setPagador(CroudWolf pagador){
		this.pagador = pagador;
	}
	
	
}
