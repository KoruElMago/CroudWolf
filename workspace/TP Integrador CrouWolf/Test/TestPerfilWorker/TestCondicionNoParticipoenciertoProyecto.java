<<<<<<< HEAD
package TestPerfilWorker;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import PerfilWorker.CondicionNoParticipoEnCiertoProyecto;
import Proyecto.Proyecto;
import Worker.Worker;
=======
package TestPerfilWorker
>>>>>>> b11f049864ad2f3b9b69f7665ea0e7b5f2b04f86


 public class TestCondicionNoParticipoenciertoProyecto{
	 
	 //variables
	 CondicionNoParticipoEnCiertoProyecto condicion;
<<<<<<< HEAD
	 Proyecto mockProyecto;
	 Worker mockWorker;
	 
	 @Before
	 public void setUp(){
=======
	 
	 @before
	 public void setUp() throws exeption{
>>>>>>> b11f049864ad2f3b9b69f7665ea0e7b5f2b04f86
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
		 verify(mockWorker).getSubscripciones();
	 }
 }
		 
