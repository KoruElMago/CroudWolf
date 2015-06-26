package TestPago;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import Pago.CondicionYMontoDePago;
import Pago.PagoPorProyecto;
import Proyecto.Proyecto;
import Worker.Worker;

public class PagoPorProyectoTest {

	PagoPorProyecto pagoTest;
	CondicionYMontoDePago mockCondicion1;
	CondicionYMontoDePago mockCondicion2;
	Proyecto mockProyecto;
	List<CondicionYMontoDePago> condiciones;
	Worker mockWorker;
	
	@Before
	public void setUp() throws Exception {
		
		mockCondicion1 = mock(CondicionYMontoDePago.class);
		mockCondicion2 = mock(CondicionYMontoDePago.class);
		mockProyecto = mock(Proyecto.class);
		mockWorker = mock(Worker.class);
		
		condiciones = new ArrayList<CondicionYMontoDePago>();
		condiciones.add(mockCondicion1);
		condiciones.add(mockCondicion2);
		
		pagoTest = new PagoPorProyecto(mockProyecto,condiciones);
		
	}

	@Test
	public void testCreador() {
		assertNotNull(pagoTest.getCondiciones());
		assertNotNull(pagoTest.getPagador());
	}
	
}
