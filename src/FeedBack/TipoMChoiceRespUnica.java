package FeedBack;

import java.util.ArrayList;

public class TipoMChoiceRespUnica extends TipoChoice {

	public TipoMChoiceRespUnica(){
		this.setRespuestasDadas(new ArrayList<RespuestaCompletable>());
	}
	
	@Override
	public void elegirRespuesta(RespuestaCompletable respuesta) {
		this.getRespuestasDadas().clear();
		this.getRespuestasDadas().add(respuesta);
	}

}
