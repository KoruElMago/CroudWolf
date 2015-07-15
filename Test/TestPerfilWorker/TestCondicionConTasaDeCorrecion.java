package TestPerfilWorker;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import PerfilWorker.CondicionConTasaDeCorreccion;
import Tarea.Tarea;
import Worker.Worker;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


 public class TestCondicionConTasaDeCorrecion{
	 
	 //variables
	 CondicionConTasaDeCorreccion condicion;
	 List<Tarea> tareas;
	 List<Tarea> tareas2;
	 Worker mockWorker;
	 Worker mockWorker2;
	 Tarea mockTarea2;
	 Tarea mockTarea1;
	 Tarea mockTarea4;
	 Tarea mockTarea3;
	 
	 @Before
	 public void setUp() {
		 mockWorker = mock(Worker.class);
		 mockWorker2 = mock(Worker.class);
		 mockTarea1 = mock(Tarea.class);
		 mockTarea2 = mock(Tarea.class);
		 mockTarea3 = mock(Tarea.class);
		 mockTarea4 = mock(Tarea.class);
		 condicion = new CondicionConTasaDeCorreccion(75);
		 tareas = new ArrayList<Tarea>();
		 tareas.add(mockTarea1); 
		 tareas.add(mockTarea2);
		 tareas2 = new ArrayList<Tarea>();
		 tareas2.add(mockTarea3); 
		 tareas2.add(mockTarea4);
		 
		 when(mockTarea1.estaCorrecta()).thenReturn(true);
		 when(mockTarea2.estaCorrecta()).thenReturn(true);
		 when(mockTarea3.estaCorrecta()).thenReturn(false);
		 when(mockTarea4.estaCorrecta()).thenReturn(false);
		 
	 }
	 
	 
	 @Test
	 public void testCreador(){
		 assertEquals(condicion.getTasaDeCorrecion(), 75);
	 }
	 
	 @Test
	 public void testChequear(){
		
		 
		 when(mockWorker.getTareas()).thenReturn(tareas);
		 when(mockWorker2.getTareas()).thenReturn(tareas2);
		 
		 assertTrue(condicion.chequear(mockWorker));
		 assertFalse(condicion.chequear(mockWorker2));
		 
		 verify(mockWorker).getTareas();
		 verify(mockWorker2).getTareas();
	 }
	 
	 @Test
	 public void testFijarseTasaDeCorrecion(){
		
		assertTrue(condicion.fijarseTasaDeCorrecion(tareas));
		assertFalse(condicion.fijarseTasaDeCorrecion(tareas2));
	 }
 }
