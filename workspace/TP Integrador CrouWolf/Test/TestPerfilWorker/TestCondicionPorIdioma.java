<<<<<<< HEAD
package TestPerfilWorker;

import org.junit.Before;
import org.junit.Test;

import PerfilWorker.CondicionPorIdioma;
import Worker.Worker;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

=======
package TestPerfilWorker
>>>>>>> b11f049864ad2f3b9b69f7665ea0e7b5f2b04f86


 public class TestCondicionPorIdioma{
	 
	 //variables
	CondicionPorIdioma condicion;
	String idioma;
<<<<<<< HEAD
	Worker mockWorker;
		 
	 @Before
	 public void setUp() {
		mockWorker = mock(Worker.class);
		idioma = "Español";
		condicion = new CondicionPorIdioma("Español");	 
=======
	 
	 @before
	 public void setUp() throws exeption{
		mockWorker = mock(Worker.class);
		idioma = "Español";
		condicion = new TestCondicionPorIdioma(mockProyecto);	 
>>>>>>> b11f049864ad2f3b9b69f7665ea0e7b5f2b04f86
	 }
	 
	 
	 @Test
	 public void testCreador(){
<<<<<<< HEAD
		 assertTrue(condicion.getIdiomas().contains("Español"));
=======
		 assertEquals(condicion.getIdioma(), "Español");
>>>>>>> b11f049864ad2f3b9b69f7665ea0e7b5f2b04f86
	 }
	 
	 @Test
	 public void testChequear(){
		 condicion.chequear(mockWorker);
<<<<<<< HEAD
		 verify(mockWorker).getIdiomas();
=======
		 verify(mockWorker).getIdioma();
>>>>>>> b11f049864ad2f3b9b69f7665ea0e7b5f2b04f86
	 }
 }
	 
