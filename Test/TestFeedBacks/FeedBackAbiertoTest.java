package TestFeedBacks;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import  FeedBack.*;

public class FeedBackAbiertoTest {

	FeedBackAbierto feedback1;
	
	
	@Before
	public void setUp() throws Exception {
		feedback1= new FeedBackAbierto("Pablito clavo el clavito?");
		
	}

	@Test
	public void testFeedbackAbierto() {
		assertEquals(feedback1.getPregunta(), "Pablito clavo el clavito?");
		assertNull(feedback1.getRespuesta());
	}
	
	@Test
	public void testResponder(){
		feedback1.responder("si lo clavo");
		assertEquals("si lo clavo", feedback1.getRespuesta());
		assertFalse(feedback1.estaValidada());
		
	}
	
	@Test
	public void tesrValidacionAutomatica(){
		feedback1.responder("si lo clavo");
		feedback1.validarse();
		assertFalse(feedback1.estaValidada());
		
		
	}
	
	@Test
	public void testValidacionManual(){
		feedback1.responder("nah");
		feedback1.validacionManual(true);
		assertTrue(feedback1.estaValidada());
	}

}
