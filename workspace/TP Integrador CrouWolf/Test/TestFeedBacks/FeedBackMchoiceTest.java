package TestFeedBacks;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import FeedBack.FeedBackMChoice;
import FeedBack.RespuestasMChoice;
import FeedBack.TipoChoice;

public class FeedBackMchoiceTest {
	FeedBackMChoice feedback1;
	TipoChoice tipoMchoice;
	List<RespuestasMChoice> respuestas;
	RespuestasMChoice respuesta;

	@Before
	public void setUp() throws Exception {
		tipoMchoice =  mock(TipoChoice.class);
		respuestas = new ArrayList<RespuestasMChoice>();
		respuesta = mock(RespuestasMChoice.class);
		feedback1 = new FeedBackMChoice("adelante estoy seguro de que perderas", respuestas , tipoMchoice);
	}

	@Test
	public void testCreador(){
		assertEquals(feedback1.estaCorrecta(),false);
		assertEquals(feedback1.estaValidada(),false);
		assertNotNull(feedback1.getPregunta());
		assertNotNull(feedback1.getRespuestas());
		assertNotNull(feedback1.getTipo());
	}
	@Test
	public void testElegirRespuesta() {
		
		feedback1.elegirRespuesta(respuesta);
		verify(tipoMchoice).elegirRespuesta(respuesta);
		
	}
	
	@Test
	public void testValidar(){
		
		feedback1.validarse();
		verify(tipoMchoice).validar(feedback1);
	}

}
