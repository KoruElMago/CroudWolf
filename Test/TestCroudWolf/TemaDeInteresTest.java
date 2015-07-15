package TestCroudWolf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;

import CroudWolf.TemaDeInteres;
import Proyecto.Proyecto;
import Worker.Worker;

public class TemaDeInteresTest {
	
	Proyecto proyecto1;
	Worker worker1;
	TemaDeInteres tema1;
	
	
	
		
	@Before
	public void setUp() throws Exception {
		proyecto1 = mock(Proyecto.class);
		worker1 = mock(Worker.class);
		tema1 = new TemaDeInteres("Futbol");
		
	}

	
	@Test
	public void testCreador() {
		
		assertEquals(tema1.getWorkers().size(), 0);
		assertEquals(tema1.getTema(), "Futbol");
		
	}

	
	@Test
	public void testAgregarWorker() {
		tema1.agregarWorker(worker1);
		assertEquals(tema1.getWorkers().size(), 1);
		assertTrue(tema1.getWorkers().contains(worker1));
	}
	
	
	@Test
	public void testNotificarWorker() {
		
		tema1.agregarWorker(worker1);
		tema1.notificarWorkers(proyecto1);
		verify(worker1).notificarProyecto(proyecto1);
		
	}

}