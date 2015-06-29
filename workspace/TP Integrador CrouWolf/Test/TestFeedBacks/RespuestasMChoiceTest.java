package TestFeedBacks;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import FeedBack.RespuestasMChoice;

public class RespuestasMChoiceTest {

	RespuestasMChoice respuestaTest;
	
	@Before
	public void setUp() throws Exception {
		respuestaTest = new RespuestasMChoice("Pablo Clavo un Clavito", true);
	}

	@Test
	public void test() {
		assertNotNull(respuestaTest.getRespuesta());
		assertNotNull(respuestaTest.esCorrecta());
	}

}
