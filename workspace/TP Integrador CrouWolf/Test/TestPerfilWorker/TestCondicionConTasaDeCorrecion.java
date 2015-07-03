package TestPerfilWorker;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import PerfilWorker.CondicionConTasaDeCorreccion;
import Tarea.Tarea;
import Worker.Worker;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
package TestPerfilWorker


 public class TestCondicionConTasaDeCorrecion{
	 
	 //variables
	 CondicionConTasaDeCorreccion condicion;
	 List<Tarea> tareas;
	 Worker mockWorker;
	 Tarea mockTarea2;
	 Tarea mockTarea1;
	 
	 @Before
	 public void setUp() {
	 CondicionConTasaDeCorrecion condicion;
	 ArrayList<Tarea> tareas;
	 
	 @before
	 public void setUp() throws exeption{
		 mockWorker = mock(Worker.class);
		 mockTarea1 = mock(Tarea.class);
		 mockTarea2 = mock(Tarea.class);
		 tareas.add(mockTarea1); tareas.add(mockTarea2);
		 condicion = new CondicionConTasaDeCorreccion(75);
		 condicion = new CondicionConTasaDeCorrecion(75);

		 
	 }
	 
	 
	 @Test
	 public void testCreador(){
		 assertEquals(condicion.getTasaDeCorrecion(), 75);
	 }
	 
	 @Test
	 public void testChequear(){
		 condicion.chequear(mockWorker);
		 verify(mockWorker).getTareas();
	 }
	 
	 @Test
	 public void testFijarseTasaDeCorrecion(){
		when(mockTarea1.estaCorrecta()).thenReturn(true);
		when(mockTarea2.estaCorrecta()).thenReturn(true);
		assertTrue(condicion.fijarseTasaDeCorrecion(tareas));
	 }
 }
		 