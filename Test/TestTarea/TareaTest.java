package TestTarea;


import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import FeedBack.FeedBack;
import Tarea.Tarea;


import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;



public class TareaTest {

	Tarea tarea1;
	FeedBack feedback1;
	
	
	
	@Before
	public void setUp() throws Exception {
		
		feedback1 = mock(FeedBack.class);
		tarea1 = new Tarea("Apretar Click",feedback1);
	}
	
	
	@Test
	public void testCreador() {
		assertEquals(tarea1.getInstruccion(), "Apretar Click");
		assertNotNull(tarea1.getFecha());
		assertNotNull(tarea1.getFeedback());
		assertTrue(tarea1.estaDisponible());
		assertFalse(tarea1.esObligatoria());
	}
	
	@Test
	public void testMarcarComoObligatoria(){
		tarea1.marcarComoObligatoria();
		assertTrue(tarea1.esObligatoria());
	}
	
	@Test
	public void testTareaCompleta() {
		tarea1.estaCompleta();
		verify(feedback1).estaCompleta();
	}

	@Test
	public void testTareaDisponible(){
		assertTrue(tarea1.estaDisponible());
		
	}
	
	@Test
	public void testTareaCorrecta(){
		tarea1.estaCorrecta();
		verify(feedback1).estaCorrecta();
	}
}
