package Pago;

import CroudWolf.CroudWolf;
import Worker.Worker;

public abstract class CondicionYMontoDePago {

	public abstract float calcularMonto(Worker worker);

	public abstract float calcularMonto(Worker worker, CroudWolf pagador) ;
	


}
