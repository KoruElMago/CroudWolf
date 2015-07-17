package FeedBack;

import java.util.ArrayList;

public class TipoMChoiceMultiple extends TipoChoice {

	//Constructor
	public TipoMChoiceMultiple(){
		this.setRespuestasDadas(new ArrayList<RespuestaCompletable>());
				
	}
	@Override
	//Implementa el mensaje abstracto añadiendo la respuesta a las respuesta dada.
	public void elegirRespuesta(RespuestaCompletable respuesta) {
		this.getRespuestasDadas().add(respuesta);
	}


	

}
