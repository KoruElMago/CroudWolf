package FeedBack;

import java.util.ArrayList;

public class TipoMChoiceRespUnica extends TipoChoice {

	//Constructor.
	public TipoMChoiceRespUnica(){
		this.setRespuestasDadas(new ArrayList<RespuestaCompletable>());
	}
	
	@Override
	//Implementa el mensaje abstracto dejando solo la respuesta dada por parametro.
	public void elegirRespuesta(RespuestaCompletable respuesta) {
		this.getRespuestasDadas().clear();
		this.getRespuestasDadas().add(respuesta);
	}

}
