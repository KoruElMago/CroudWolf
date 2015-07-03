package TestPerfilWorker


 public class TestPerfilDelworker{
	 
	 //variables
	 PerfilDelWorker perfil;
	 ArrayList<CondicionDelWorker> condiciones;
	 
	 @before
	 public void setUp() throws exeption{
		mockWorker = mock(Worker.class);
		mockCondicionPorIdioma = mock(CondicionPorIdioma.class);
		condiciones.add(mockCondicionPorIdioma;
		condicion = new PerfilDelWorker();	 
	 }
	 
	 
	 @Test
	 public void testCreador(){
		 assertEquals(condicion.getCondiciones(), condiciones);
	 }
	 
	 @Test
	 public void testChequearWorker(){
		 perfil.chequearWorker(mockWorker);
		 verify(mockCondicionPorIdioma).chequear(mockWorker);
	 }
 }
