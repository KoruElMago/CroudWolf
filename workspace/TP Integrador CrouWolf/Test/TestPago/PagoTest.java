package TestPago;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import CroudWolf.CroudWolf;
import Pago.CondicionYMontoDePago;
import Pago.Pago;
import Worker.Worker;


public class PagoTest {

	Pago pagoTest;
	CondicionYMontoDePago mockCondicion1;
	CondicionYMontoDePago mockCondicion2;
	CroudWolf mockCroudWolf;
	List<CondicionYMontoDePago> condiciones;
	Worker mockWorker;
	
	@Before
	public void setUp() throws Exception {
		
		mockCondicion1 = mock(CondicionYMontoDePago.class);
		mockCondicion2 = mock(CondicionYMontoDePago.class);
		mockCroudWolf = mock(CroudWolf.class);
		mockWorker = mock(Worker.class);
		
		condiciones = new ArrayList<CondicionYMontoDePago>();
		condiciones.add(mockCondicion1);
		condiciones.add(mockCondicion2);
		
		pagoTest = new Pago(mockCroudWolf,condiciones);
		
	}

	@Test
	public void testCreador() {
		assertNotNull(pagoTest.getCondiciones());
		assertNotNull(pagoTest.getPagador());
	}
	
	@Test
	public void testCalcularMonto(){
		
		pagoTest.calcularMonto(mockWorker);
	
		verify(mockCondicion1).calcularMonto(mockWorker);
		verify(mockCondicion2).calcularMonto(mockWorker);
	}

}