package TestFeedBacks;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import FeedBack.FeedBack;
import FeedBack.RespuestaCompletable;
import FeedBack.TipoSChoiceCompletable;

public class TipoSChoiceCompletableTest {

	TipoSChoiceCompletable mchoice;
	FeedBack feedBack;
	RespuestaCompletable respuesta;
	RespuestaCompletable respuesta2;
	
	@Before
	public void setUp() throws Exception {
		mchoice = new TipoSChoiceCompletable();
		feedBack = mock(FeedBack.class);
		respuesta = mock(RespuestaCompletable.class);
		respuesta2 = mock(RespuestaCompletable.class);
	}

	@Test
	public void testElegirRespuesta() {
		mchoice.elegirRespuesta(respuesta);
		assertTrue(mchoice.getRespuestasDadas().contains(respuesta));
	}
	
	@Test
	public void testValidarCorrectamente(){
		mchoice.elegirRespuesta(respuesta);
		mchoice.elegirRespuesta(respuesta2);
		when(respuesta.esCorrecta()).thenReturn(false);
		when(respuesta2.esCorrecta()).thenReturn(true);
		mchoice.validar(feedBack);
		verify(respuesta,times(0)).esCorrecta();
		verify(respuesta2).esCorrecta();
		verify(feedBack).setEstaCorrecta(true);
		
	}

}
