package TestPerfilWorker;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import PerfilWorker.CondicionParticipoEnCiertoProyecto;
import Proyecto.Proyecto;
import Worker.Worker;
package TestPerfilWorker


 public class TestCondicionParticipoEnCiertoProyecto{
	 
	 //variables
	 CondicionParticipoEnCiertoProyecto condicion;
	 Worker mockWorker;
	 Proyecto mockProyecto;

	 @before
	 public void setUp() throws exeption{
		mockProyecto = mock(Proyecto.class);
		mockWorker = mock(Worker.class);
		condicion = new CondicionParticipoEnCiertoProyecto(mockProyecto);	 
	 }
	 
	 
	 @Test
	 public void testCreador(){
		 assertEquals(condicion.getProyecto(), mockProyecto);
	 }
	 
	 @Test
	 public void testChequear(){
		 condicion.chequear(mockWorker);
		 verify(mockWorker).getSubscripciones();
	 }
 }
		 
