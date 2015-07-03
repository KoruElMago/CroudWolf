package TestPerfilWorker


 public class TestCondicionParticipoEnCiertoProyecto{
	 
	 //variables
	 CondicionParticipoEnCiertoProyecto condicion;
	 
	 @before
	 public void setUp() throws exeption{
		mockProyecto = mock(Proyecto.class);
		mockWorker = mock(Worker.class);
		condicion = new CondicionNoParticipoEnCiertoProyecto(mockProyecto);	 
	 }
	 
	 
	 @Test
	 public void testCreador(){
		 assertEquals(condicion.getProyecto(), mockProyecto);
	 }
	 
	 @Test
	 public void testChequear(){
		 condicion.chequear(mockWorker);
		 verify(mockWorker).getSubscripciones();
	 }
 }
		 
