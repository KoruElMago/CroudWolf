package TestFeedBacks;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import FeedBack.EstadoFeedBack;
import FeedBack.FeedBackMChoice;
import FeedBack.RespuestasMChoice;
import FeedBack.TipoMChoice;

public class FeedBackMchoiceTest {
	FeedBackMChoice feedback1;
	TipoMChoice tipoMchoice;
	List<RespuestasMChoice> respuestas;
	EstadoFeedBack estado;
	RespuestasMChoice respuesta;

	@Before
	public void setUp() throws Exception {
		tipoMchoice =  mock(TipoMChoice.class);
		respuestas = new ArrayList<RespuestasMChoice>();
		estado = mock(EstadoFeedBack.class);
		respuesta = mock(RespuestasMChoice.class);
		feedback1 = new FeedBackMChoice("adelante estoy seguro de que perderas", respuestas , tipoMchoice, estado);
	}

	@Test
	public void testCreador(){
		assertNotNull(feedback1.getEstado());
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
