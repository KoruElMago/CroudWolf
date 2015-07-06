package PerfilWorker;

import Worker.Worker;

public abstract class CondicionDelWorker {

	//Este es el mensaje abstracto que chequeara la condicion segun sea lo que tenga que chequearse del worker.
	public abstract boolean chequear(Worker w);
	
}

