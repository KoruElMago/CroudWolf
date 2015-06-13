package TestPago;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import CroudWolf.CroudWolf;
import Pago.CondicionYMontoDePago;
import Pago.PagoPorBonus;
import Worker.Worker;


public class PagoPorBonusTest {

	PagoPorBonus pagoTest;
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
		
		condiciones.add(mockCondicion1);
		condiciones.add(mockCondicion2);
		
		pagoTest = new PagoPorBonus(mockCroudWolf,condiciones);
		
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
