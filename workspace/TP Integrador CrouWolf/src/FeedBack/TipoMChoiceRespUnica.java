package FeedBack;

import java.util.ArrayList;

public class TipoMChoiceRespUnica extends TipoChoice {

	public TipoMChoiceRespUnica(){
		this.setRespuestasDadas(new ArrayList<RespuestasMChoice>());
	}
	
	@Override
	public void elegirRespuesta(RespuestasMChoice respuesta) {
		this.getRespuestasDadas().clear();
		this.getRespuestasDadas().add(respuesta);
	}

}
