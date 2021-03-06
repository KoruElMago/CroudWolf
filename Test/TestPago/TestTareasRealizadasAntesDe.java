package TestPago;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;

import Pago.TareasRealizadasAntesDe;
import Tarea.Tarea;

public class TestTareasRealizadasAntesDe {

	TareasRealizadasAntesDe condicionTest;
	DateTime fecha;
	Tarea mockTarea;
	
	
	@Before
	public void setUp(){
		new DateTime();
		fecha = DateTime.now();
		condicionTest = new TareasRealizadasAntesDe((float) 0.3, fecha);
		mockTarea = mock(Tarea.class);
	}
	
	@Test
	public void testCreador() {
		assertNotNull(condicionTest.getFecha());
		assertEquals(condicionTest.getFecha(),fecha);
	}

	@Test
	public void testChequearCondicion(){
		DateTime fecha2 = fecha.minusHours(3);
		when(mockTarea.getFecha()).thenReturn(fecha2);
		assertFalse(condicionTest.chequearCondicion(mockTarea));
	}
}
