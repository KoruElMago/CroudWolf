package TestPerfilWorker;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import PerfilWorker.CondicionNoParticipoEnCiertoProyecto;
import Proyecto.Proyecto;
import Worker.Worker;


 public class TestCondicionNoParticipoenciertoProyecto{
	 
	 //variables
	 CondicionNoParticipoEnCiertoProyecto condicion;
	 Proyecto mockProyecto;
	 Worker mockWorker;
	 
	 @Before
	 public void setUp(){
		mockProyecto = mock(Proyecto.class);
		mockWorker = mock(Worker.class);
		condicion = new CondicionNoParticipoEnCiertoProyecto(mockProyecto);	 
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
		 
