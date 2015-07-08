package Pago;

import java.util.List;

import Proyecto.Proyecto;

public class PagoPorProyecto extends Pago {

	
	private Proyecto pagador;
	
	public PagoPorProyecto(Proyecto pagador,List<CondicionYMontoDePago> condiciones) {
			
		this.setCondiciones(condiciones);
		this.setPagador(pagador);
		
	}

	public Proyecto getPagador() {
		return pagador;
	}

	public void setPagador(Proyecto pagador) {
		this.pagador = pagador;
	}

	
}
