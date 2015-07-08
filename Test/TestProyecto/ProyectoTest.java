package TestProyecto;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.matchers.Any;

import static org.mockito.Mockito.*;
import CroudWolf.CroudWolf;
import CroudWolf.TemaDeInteres;
import PerfilWorker.PerfilDelWorker;
import Proyecto.Proyecto;
import Tarea.PaqueteDeTareas;
import Tarea.Tarea;
import Worker.Worker;

public class ProyectoTest {

	Proyecto proyectoT;
	CroudWolf mockCroud;
	PerfilDelWorker mockPerfil;
	Tarea mockTarea;
	Tarea mockTarea2;
	Tarea mockTarea3;
	List<Tarea> listMockTarea;
	TemaDeInteres mockTemaDeInteres;
	Worker mockWorker;
	
	@Before
	public void setUp() throws Exception {
		mockCroud = mock(CroudWolf.class);
		mockPerfil = mock(PerfilDelWorker.class);
		mockTarea = mock(Tarea.class);
		mockTarea2 = mock(Tarea.class);
		mockTarea3 = mock(Tarea.class);
		listMockTarea = new ArrayList<Tarea>();
		listMockTarea.add(mockTarea);
		mockTemaDeInteres = mock(TemaDeInteres.class);
		mockWorker = mock(Worker.class);
		proyectoT = new Proyecto("nombre que te guste", "alguna estupides", mockCroud, mockPerfil);
	}

	@Test
	public void testCreador() {
		assertNotNull(proyectoT.getPerfilWorker());
		assertEquals(proyectoT.getNombre1(), "nombre que te guste");
		assertEquals(proyectoT.getDescripcion(), "alguna estupides");
		assertEquals(proyectoT.getTamanhoPaquetes(), 1);
		assertNotNull(proyectoT.getCroudWolf());
		assertEquals(proyectoT.getTareas().size(), 0);
		assertEquals(proyectoT.getTemasDeInteres().size(), 0);
		assertEquals(proyectoT.getSubscriptos().size(), 0);
	}
	
	@Test
	public void testAgregarTarea(){
		proyectoT.agregarTarea(mockTarea);
		assertTrue(proyectoT.getTareas().contains(mockTarea));
		assertEquals(proyectoT.getTareas().size(), 1);
	}
	
	@Test
	//Este metodo se diferencia del anterior porque recibe una LISTA de tarea.
	public void testAgregarTarea2(){
		proyectoT.agregarTarea(listMockTarea);
		assertTrue(proyectoT.getTareas().contains(mockTarea));
		assertEquals(proyectoT.getTareas().size(), 1);
	}

	@Test
	public void testAgregarTemasDeInteres(){
		proyectoT.agregarTemaDeInteres(mockTemaDeInteres);
		assertTrue(proyectoT.getTemasDeInteres().contains(mockTemaDeInteres));
	}
	
	@Test
	public void testSolicitarNuevoPaqueteDeTareas(){
		proyectoT.solicitarNuevoPaqueteDeTareas(mockWorker);
		verify(mockWorker, times(1)).asignarPaqueteDeTareas(any(PaqueteDeTareas.class));
	}

	@Test
	public void testTareasDisponibles(){
		proyectoT.agregarTarea(mockTarea);
		proyectoT.agregarTarea(mockTarea2);
		proyectoT.agregarTarea(mockTarea3);
		when(mockTarea.estaDisponible()).thenReturn(true);
		when(mockTarea2.estaDisponible()).thenReturn(false);
		when(mockTarea3.estaDisponible()).thenReturn(true);
		assertEquals(proyectoT.tareasDisponibles().size(), 2);
		assertTrue(proyectoT.tareasDisponibles().contains(mockTarea));
		assertFalse(proyectoT.tareasDisponibles().contains(mockTarea2));
		assertTrue(proyectoT.tareasDisponibles().contains(mockTarea3));
	}
	
	@Test
	public void testTareasCompletas(){
		proyectoT.agregarTarea(mockTarea);
		proyectoT.agregarTarea(mockTarea2);
		proyectoT.agregarTarea(mockTarea3);
		when(mockTarea.estaCompleta()).thenReturn(true);
		when(mockTarea2.estaCompleta()).thenReturn(false);
		when(mockTarea3.estaCompleta()).thenReturn(true);
		assertEquals(proyectoT.tareasCompletas().size(), 2);
		assertTrue(proyectoT.tareasCompletas().contains(mockTarea));
		assertFalse(proyectoT.tareasCompletas().contains(mockTarea2));
		assertTrue(proyectoT.tareasCompletas().contains(mockTarea3));
	}
	
	@Test
	public void testTareasIncompletas(){
		proyectoT.agregarTarea(mockTarea);
		proyectoT.agregarTarea(mockTarea2);
		proyectoT.agregarTarea(mockTarea3);
		when(mockTarea.estaCompleta()).thenReturn(false);
		when(mockTarea2.estaCompleta()).thenReturn(true);
		when(mockTarea3.estaCompleta()).thenReturn(false);
		assertEquals(proyectoT.tareasIncompletas().size(), 2);
		assertTrue(proyectoT.tareasIncompletas().contains(mockTarea));
		assertFalse(proyectoT.tareasIncompletas().contains(mockTarea2));
		assertTrue(proyectoT.tareasIncompletas().contains(mockTarea3));
	}
	
	@Test
	public void testAgregarSubscripto(){
		proyectoT.agregarSubscripto(mockWorker);
		assertTrue(proyectoT.getSubscriptos().contains(mockWorker));
	}
}
