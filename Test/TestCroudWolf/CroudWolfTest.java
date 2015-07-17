package TestCroudWolf;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import CroudWolf.CroudWolf;
import CroudWolf.TemaDeInteres;
import Pago.Pago;
import Proyecto.PaqueteDeTareas;
import Proyecto.Proyecto;
import Worker.Worker;

public class CroudWolfTest {

	TemaDeInteres tema1;
	CroudWolf croudWolf1 ;
	Proyecto  proyecto1;
	Pago 	pago1; 
	Worker worker1;
	PaqueteDeTareas paquete1;
	
	
	@Before
	public void setUp() throws Exception {
		croudWolf1 = new CroudWolf();
		proyecto1 = mock(Proyecto.class);
		pago1 = mock(Pago.class);
		worker1 = mock (Worker.class);
		paquete1 = mock (PaqueteDeTareas.class);
 		tema1 = mock (TemaDeInteres.class);
 
 	

	}

	@Test
	public void testCreador() {
		assertNotNull(croudWolf1.getWorkers());
		assertNotNull(croudWolf1.getProyectos());
		assertEquals(croudWolf1.getTemasDeInteres().size(),0);
		assertNotNull(croudWolf1.getPagos());
		assertEquals(croudWolf1.getPagos().size(),0);
	}
	
	@Test
	public void testAgregarWorker(){
		croudWolf1.agregarWorker(worker1);
		assertEquals(croudWolf1.getWorkers().size(), 1);
		assertTrue(croudWolf1.getWorkers().contains(worker1));
	}
	
	
	@Test
	public void testAgregarTemas() {
		croudWolf1.agregarTemaDeInteres(tema1);
		assertEquals(croudWolf1.getTemasDeInteres().size(),1);
		assertTrue(croudWolf1.getTemasDeInteres().contains(tema1));
	}
	
	@Test
	public void testAgregarProyecto() {
		
		croudWolf1.agregarProyecto(proyecto1);
		assertEquals(croudWolf1.getProyectos().size(),1);
		assertTrue(croudWolf1.getProyectos().contains(proyecto1));
	}

	@Test
	public void testNotificarNuevoProyecto(){
		List<TemaDeInteres> ls = new ArrayList<TemaDeInteres>();
		ls.add(tema1);
		when(proyecto1.getTemasDeInteres()).thenReturn(ls);
		croudWolf1.notificarNuevoProyecto(proyecto1);
		verify(tema1).notificarWorkers(proyecto1);
	}
	

}