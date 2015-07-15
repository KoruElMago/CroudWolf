package TestPago;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import Pago.TareasRealizadas;
import Tarea.Tarea;
import Worker.Worker;

public class TareasRealizadasTest {

	
	TareasRealizadas condicionTest;
	Tarea mockTarea;
	Worker mockWorker;
	
	
	@Before
	public void setUp() throws Exception {

		condicionTest = new TareasRealizadas((float)0.3);
		mockTarea = mock(Tarea.class);
		mockWorker = mock(Worker.class);
		when(mockTarea.estaCompleta()).thenReturn(true);
		
	}

	@Test
	public void testCreador() {
		assertEquals(condicionTest.getValorPorCondicion() , 0.3 , 0.0001);
	}

	@Test
	public void testChequearCondicion(){
		
		assertTrue(condicionTest.chequearCondicion(mockTarea));
		verify(mockTarea).estaCompleta();
	}
	
	@Test
	public void testCalcularMonto(){
		List<Tarea> ls = new ArrayList<Tarea>();
		ls.add(mockTarea);
		when(mockWorker.getTareas()).thenReturn(ls);
		assertEquals(condicionTest.calcularMonto(mockWorker), (float) 0.3 , (float) 0.1);
	}
}
