package TestPerfilWorker


 public class TestCondicionConTasaDeCorrecion{
	 
	 //variables
	 CondicionConTasaDeCorrecion condicion;
	 ArrayList<Tarea> tareas;
	 
	 @before
	 public void setUp() throws exeption{
		 mockWorker = mock(Worker.class);
		 mockTarea1 = mock(Tarea.class);
		 mockTarea2 = mock(Tarea.class);
		 tareas.add(mockTarea1); tareas.add(mockTarea2);
		 condicion = new CondicionConTasaDeCorrecion(75);
		 
		 
	 }
	 
	 
	 @Test
	 public void testCreador(){
		 assertEquals(condicion.getTasaDeCorrecion(), 75);
	 }
	 
	 @Test
	 public void testChequear(){
		 condicion.chequear(mockWorker);
		 verify(mockWorker).getTareas();
	 }
	 
	 @Test
	 public void testFijarseTasaDeCorrecion(){
		when(mockTarea1.estaCorrecta()).thenReturn(true);
		when(mockTarea2.estaCorrecta()).thenReturn(true);
		assertTrue(condicion.fijarseTasaDeCorrecion(tareas));
	 }
 }
		 
