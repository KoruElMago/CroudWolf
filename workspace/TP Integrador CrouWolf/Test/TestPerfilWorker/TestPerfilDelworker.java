<<<<<<< HEAD
package TestPerfilWorker;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import PerfilWorker.CondicionDelWorker;
import PerfilWorker.CondicionPorIdioma;
import PerfilWorker.PerfilDelWorker;
import Worker.Worker;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
=======
package TestPerfilWorker
>>>>>>> b11f049864ad2f3b9b69f7665ea0e7b5f2b04f86


 public class TestPerfilDelworker{
	 
	 //variables
	 PerfilDelWorker perfil;
<<<<<<< HEAD
	 List<CondicionDelWorker> condiciones;
	 Worker mockWorker;
     CondicionPorIdioma mockCondicionPorIdioma;
	 
	 @Before
	 public void setUp(){
		mockWorker = mock(Worker.class);
		mockCondicionPorIdioma = mock(CondicionPorIdioma.class);
		condiciones.add(mockCondicionPorIdioma);
		perfil = new PerfilDelWorker(condiciones);	 
=======
	 ArrayList<CondicionDelWorker> condiciones;
	 
	 @before
	 public void setUp() throws exeption{
		mockWorker = mock(Worker.class);
		mockCondicionPorIdioma = mock(CondicionPorIdioma.class);
		condiciones.add(mockCondicionPorIdioma;
		condicion = new PerfilDelWorker();	 
>>>>>>> b11f049864ad2f3b9b69f7665ea0e7b5f2b04f86
	 }
	 
	 
	 @Test
	 public void testCreador(){
<<<<<<< HEAD
		 assertEquals(perfil.getCondiciones(), condiciones);
=======
		 assertEquals(condicion.getCondiciones(), condiciones);
>>>>>>> b11f049864ad2f3b9b69f7665ea0e7b5f2b04f86
	 }
	 
	 @Test
	 public void testChequearWorker(){
		 perfil.chequearWorker(mockWorker);
		 verify(mockCondicionPorIdioma).chequear(mockWorker);
	 }
 }
