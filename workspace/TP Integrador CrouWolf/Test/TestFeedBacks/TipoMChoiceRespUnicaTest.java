package TestFeedBacks;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import FeedBack.EstFeedBackCorrecto;
import FeedBack.FeedBack;
import FeedBack.RespuestasMChoice;
import FeedBack.TipoMChoice;
import FeedBack.TipoMChoiceRespUnica;

public class TipoMChoiceRespUnicaTest {

	TipoMChoice mchoice;
	FeedBack feedBack;
	RespuestasMChoice respuesta;
	RespuestasMChoice respuesta2;
	
	@Before
	public void setUp() throws Exception {
		mchoice = new TipoMChoiceRespUnica();
		feedBack = mock(FeedBack.class);
		respuesta = mock(RespuestasMChoice.class);
		respuesta2 = mock(RespuestasMChoice.class);
	}

	@Test
	public void testElegirRespuesta() {
		mchoice.elegirRespuesta(respuesta);
		mchoice.elegirRespuesta(respuesta2);
		assertFalse(mchoice.getRespuestasDadas().contains(respuesta));
		assertTrue(mchoice.getRespuestasDadas().contains(respuesta2));
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
		verify(feedBack).setEstado(new EstFeedBackCorrecto());
		
	}
}