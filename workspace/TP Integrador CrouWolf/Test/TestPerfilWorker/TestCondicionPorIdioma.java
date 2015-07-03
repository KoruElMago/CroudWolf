package TestPerfilWorker


 public class TestCondicionPorIdioma{
	 
	 //variables
	CondicionPorIdioma condicion;
	String idioma;
	 
	 @before
	 public void setUp() throws exeption{
		mockWorker = mock(Worker.class);
		idioma = "Español";
		condicion = new TestCondicionPorIdioma(mockProyecto);	 
	 }
	 
	 
	 @Test
	 public void testCreador(){
		 assertEquals(condicion.getIdioma(), "Español");
	 }
	 
	 @Test
	 public void testChequear(){
		 condicion.chequear(mockWorker);
		 verify(mockWorker).getIdioma();
	 }
 }
	 
