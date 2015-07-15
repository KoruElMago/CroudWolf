package TestPago;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import Pago.TareasRealizadasCorrectamente;
import Tarea.Tarea;

public class TareasRealizadasCorrectamenteTest {

	TareasRealizadasCorrectamente condicionTest;
	Tarea mockTarea;
	
	@Before
	public void setUp(){
		condicionTest = new TareasRealizadasCorrectamente((float) 0.3);
		mockTarea = mock(Tarea.class);
	}
	
	@Test
	public void testChequearCondicion() {
		when(mockTarea.estaCorrecta()).thenReturn(true);
		assertTrue(condicionTest.chequearCondicion(mockTarea));
	}

}
