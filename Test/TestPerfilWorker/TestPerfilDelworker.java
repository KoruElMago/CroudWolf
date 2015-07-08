package TestPerfilWorker;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import PerfilWorker.CondicionDelWorker;
import PerfilWorker.CondicionPorIdioma;
import PerfilWorker.PerfilDelWorker;
import Worker.Worker;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


 public class TestPerfilDelworker{
	 
	 //variables
	 PerfilDelWorker perfil;
	 List<CondicionDelWorker> condiciones;
	 Worker mockWorker;
     CondicionPorIdioma mockCondicionPorIdioma;
	 
	 @Before
	 public void setUp(){
		mockWorker = mock(Worker.class);
		mockCondicionPorIdioma = mock(CondicionPorIdioma.class);
		condiciones = new ArrayList<CondicionDelWorker>();
		condiciones.add(mockCondicionPorIdioma);
		perfil = new PerfilDelWorker(condiciones);	 
	 }
	 
	 
	 @Test
	 public void testCreador(){
		 assertEquals(perfil.getCondiciones(), condiciones);
	 }
	 
	 @Test
	 public void testChequearWorker(){
		 perfil.chequearWorker(mockWorker);
		 verify(mockCondicionPorIdioma).chequear(mockWorker);
	 }
	 @Test
	 public void testChequearWorker2(){
		 when(mockCondicionPorIdioma.chequear(mockWorker)).thenReturn(true);
		 perfil.chequearWorker(mockWorker);
		 verify(mockCondicionPorIdioma).chequear(mockWorker);
	 }
 }
