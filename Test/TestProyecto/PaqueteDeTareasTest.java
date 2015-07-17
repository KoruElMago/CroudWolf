package TestProyecto;
import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import Proyecto.PaqueteDeTareas;
import Tarea.Tarea;
import Proyecto.Proyecto;


public class PaqueteDeTareasTest {
	PaqueteDeTareas paquete1;
	List<Tarea> tareas1;
	Tarea tarea1;
	Proyecto proyecto1;
	
	
	
	@Before
	public void setUp() throws Exception {
		tarea1 = mock(Tarea.class);
		tareas1 = new ArrayList<Tarea>();
		proyecto1 = mock(Proyecto.class);
		paquete1 = new PaqueteDeTareas(proyecto1, tareas1);
		
		
	}

	@Test
	public void testCreador() {
		assertEquals(paquete1.getTareas().size(),0);
		assertNotNull(paquete1.getProyecto());
		
	}

	@Test
	public void testEstaCompleto(){
		tareas1.add(tarea1);
		paquete1 = new PaqueteDeTareas(proyecto1,tareas1);
		when(tarea1.estaCompleta()).thenReturn(true);
		assertTrue(paquete1.estaCompleto());
	}
	
	
	
	@Test
	public void testPerteneceAProyecto(){
		
		assertTrue(paquete1.pertenceAProyecto(proyecto1));
		
		}

	@Test
	public void testSeCompletoElPaquete(){
		tareas1.add(tarea1);
		paquete1 = new PaqueteDeTareas(proyecto1,tareas1);
		when(tarea1.estaCompleta()).thenReturn(true);
		paquete1.seCompletoElPaquete();
		
		verify(proyecto1).notificarPaqueteCompleto(paquete1);
		
		
	}
	

}
