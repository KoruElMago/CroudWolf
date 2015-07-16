package Pago;

import java.util.List;

import CroudWolf.CroudWolf;
import Worker.Worker;

public class Pago {
	
	//Atributos.
	List<CondicionYMontoDePago> condiciones;
	CroudWolf pagador;
	
	//Constructor.
	public Pago (CroudWolf croudwolf, List<CondicionYMontoDePago> condiciones){
		this.setPagador(croudwolf);
		this.setCondiciones(condiciones);
	}
	
	//Calcula el monto que se le debe pagar a un worker.
	public float calcularMonto(Worker worker) {
		
		float monto=0;
		
		for (CondicionYMontoDePago c : this.getCondiciones()) {
			
			monto += c.calcularMonto(worker);
			
			
		}
		
		return monto;
	}
	
	//Getters y setters
	public List<CondicionYMontoDePago> getCondiciones() {
		return condiciones;
	}

	public void setCondiciones(List<CondicionYMontoDePago> condiciones) {
		this.condiciones = condiciones;
	}

	public CroudWolf getPagador() {
		return pagador;
	}
	
	public void setPagador(CroudWolf pagador){
		this.pagador = pagador;
	}
	
	
}
