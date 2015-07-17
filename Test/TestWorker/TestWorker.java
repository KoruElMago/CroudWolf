package TestWorker;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import Pago.Pago;
import Proyecto.PaqueteDeTareas;
import Proyecto.Proyecto;
import Worker.Worker;
import static org.mockito.Mockito.*;

import java.util.List;

public class TestWorker {

	List<PaqueteDeTareas> paq;
	Pago pago1;
	Worker worker1;
	PaqueteDeTareas paquete1;
	PaqueteDeTareas paquete2;
	Proyecto 	proyecto1;
	List<String> idiomas;

	
	
	
	
	
	@Before
	public void setUp() throws Exception {
	
		idiomas = new ArrayList<String>();
		idiomas.add("Español");
		worker1 = new Worker("Mago",55 ,idiomas);
		proyecto1 = mock(Proyecto.class);
		paquete1 = mock(PaqueteDeTareas.class);
		paquete2 = mock(PaqueteDeTareas.class);
		pago1 = mock(Pago.class);
		paq = new ArrayList<PaqueteDeTareas>();
		paq.add(paquete1);
		
	}
	

	
	
	@Test
	public void testCreador() {
		assertNotNull(worker1.getIdiomas());
		assertEquals(worker1.getIdiomas().size(), 1);
		assertNotNull(worker1.getPosiblesProyectos());
		assertEquals(worker1.getPosiblesProyectos().size(),0);
		assertNotNull(worker1.getSubscripciones());
		assertEquals(worker1.getSubscripciones().size(),0);
		assertEquals(worker1.getNombre(), "Mago");
		assertNotNull(worker1.getPaqueteDeTareas());
		assertEquals(worker1.getPaqueteDeTareas().size(), 0);
		assertEquals(worker1.getEdad(), 55);
		assertNotNull(worker1.getPagos());
		assertEquals(worker1.getPagos().size(), 0);
		
	}
	
	
	@Test 
	public void testRecibePago(){
		
		worker1.recibePago(pago1);
		assertTrue(worker1.getPagos().contains(pago1));
		assertEquals(worker1.getPagos().size(),1);
		
	}
	
	
	@Test
	public void testGetTarea(){
		worker1.getPaqueteDeTareas().add(paquete1);
		worker1.getTareas();
		verify(paquete1).getTareas();
	}
	
	@Test
	public void testAgregarIdioma(){
		worker1.agregarIdioma("Polaco");
		assertTrue(worker1.getIdiomas().contains("Polaco"));
		assertEquals(worker1.getIdiomas().size(), 2);
	}
	
	@Test 
	public void testAsignarPaqueteTareas(){
		when(paquete1.estaCompleto()).thenReturn(false);
		
		when(paquete2.getProyecto()).thenReturn(proyecto1);
		
		when(paquete1.pertenceAProyecto(proyecto1)).thenReturn(true);
		
		worker1.asignarPaqueteDeTareas(paquete1);
		
		worker1.asignarPaqueteDeTareas(paquete2);
		
	}
	
	@Test
	public void testNotificarProyecto(){
		worker1.notificarProyecto(proyecto1);
		assertTrue(worker1.getPosiblesProyectos().contains(proyecto1));;
		assertEquals(worker1.getPosiblesProyectos().size(),1);
	}
	
	@Test
	public void testTienePaquete(){
		worker1.asignarPaqueteDeTareas(paquete1);
		assertTrue(worker1.tienePaquete(paquete1));
	}
	
}