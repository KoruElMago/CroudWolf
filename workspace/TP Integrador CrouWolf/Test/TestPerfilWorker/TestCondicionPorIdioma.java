package TestPerfilWorker;

import org.junit.Before;
import org.junit.Test;

import PerfilWorker.CondicionPorIdioma;
import Worker.Worker;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;



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
	 }
	 
	 
	 @Test
	 public void testCreador(){
		 assertTrue(condicion.getIdiomas().contains("Español"));
	 }
	 
	 @Test
	 public void testChequear(){
		 condicion.chequear(mockWorker);
		 verify(mockWorker).getIdiomas();
	 }
 }
	 
