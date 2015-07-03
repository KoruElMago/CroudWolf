package TestCroudWolf;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;

import CroudWolf.CroudWolf;
import Pago.Pago;
import Proyecto.Proyecto;
import Tarea.PaqueteDeTareas;
import Worker.Worker;
public class CroudWolfTest {

	
	CroudWolf croudWolf1 ;
	Proyecto  proyecto1;
	Pago 	pago1; 
	Worker worker1;
	PaqueteDeTareas paquete1;
	
	
	@Before
	public void setUp() throws Exception {
		croudWolf1 = new CroudWolf();
		croudWolf1.agregarWorker(worker1);
		croudWolf1.agregarProyecto(proyecto1);
		croudWolf1.notificarPaqueteCompleto(paquete1);
		proyecto1 = mock(Proyecto.class);
		pago1 = mock(Pago.class);
		worker1 = mock (Worker.class);
		paquete1 = mock (PaqueteDeTareas.class);
 
 
 	

	}

	@Test
	public void testCreador() {
		assertNotNull(croudWolf1.getWorkers());
		assertNotNull(croudWolf1.getProyectos());
	}
	
	@Test
	public void test() {
		verify(croudWolf1).notificarNuevoProyecto(proyecto1);
		verify(paquete1).getProyecto();
	}

}