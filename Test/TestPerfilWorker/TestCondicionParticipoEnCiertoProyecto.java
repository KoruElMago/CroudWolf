package TestPerfilWorker;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;

import PerfilWorker.CondicionParticipoEnCiertoProyecto;
import Proyecto.Proyecto;
import Worker.Worker;


 public class TestCondicionParticipoEnCiertoProyecto{
	 
	 //variables
	 CondicionParticipoEnCiertoProyecto condicion;
	 Worker mockWorker;
	 Proyecto mockProyecto;
	 
	 @Before
	 public void setUp() {
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
		 verify(mockWorker).participoEn(mockProyecto);
	 }
 }
		 
