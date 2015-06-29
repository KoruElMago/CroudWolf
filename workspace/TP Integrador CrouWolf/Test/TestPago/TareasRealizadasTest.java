package TestPago;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Pago.TareasRealizadas;
import Worker.Worker;
import static org.mockito.Mockito.*;

public class TareasRealizadasTest {

	
	TareasRealizadas condicionTest;
	Float f = (float) 0.3;
	Worker mockWorker;
	
	
	@Before
	public void setUp() throws Exception {

		condicionTest = new TareasRealizadas(f);
		mockWorker = mock(Worker.class);
	}

	@Test
	public void testCreador() {
		assertEquals(condicionTest.getValorPorCondicion() , 0.3 ,0);
	}

	
}
