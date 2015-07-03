package TestTarea;


import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;

import FeedBack.FeedBack;
import Tarea.Tarea;
import static org.mockito.Mockito.*;

public class TareaTest {

	Tarea tarea1;
	FeedBack feedback1;

	
	
	
	
	@Before
	public void setUp() throws Exception {
		
		tarea1 = new Tarea("Apretar Click",feedback1);
		feedback1= mock(FeedBack.class);
		
	}
	
	
	@Test
	public void testCreador() {
		assertEquals(tarea1.getInstruccion(), "Apretar Click");
	}
	
	
	@Test
	public void test() {
		assertTrue(tarea1.estaDisponible());
		verify(feedback1).estaCorrecta();
		verify(feedback1).estaCompleta();
	}

}
