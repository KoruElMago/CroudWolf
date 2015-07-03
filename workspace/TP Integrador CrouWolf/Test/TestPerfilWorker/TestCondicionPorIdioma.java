package TestPerfilWorker;

import org.junit.Before;
import org.junit.Test;

import PerfilWorker.CondicionPorIdioma;
import Worker.Worker;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

package TestPerfilWorker


 public class TestCondicionPorIdioma{
	 
	 //variables
	CondicionPorIdioma condicion;
	String idioma;
	Worker mockWorker;
		 
	 @Before
	 public void setUp() {
		mockWorker = mock(Worker.class);
		idioma = "Español";
		condicion = new CondicionPorIdioma("Español");	 

	 @before
	 public void setUp() throws exeption{
		mockWorker = mock(Worker.class);
		idioma = "Español";
		condicion = new TestCondicionPorIdioma(mockProyecto);	 
	 }
	 
	 
	 @Test
	 public void testCreador(){
		 assertTrue(condicion.getIdiomas().contains("Español"));
		 assertEquals(condicion.getIdioma(), "Español");
	 }
	 
	 @Test
	 public void testChequear(){
		 condicion.chequear(mockWorker);
		 verify(mockWorker).getIdiomas();
		 verify(mockWorker).getIdioma();
	 }
 }
	 
