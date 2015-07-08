package FeedBack;

import java.util.ArrayList;

public class TipoMChoiceMultiple extends TipoChoice {


	public TipoMChoiceMultiple(){
		this.setRespuestasDadas(new ArrayList<RespuestaCompletable>());
				
	}
	@Override
	public void elegirRespuesta(RespuestaCompletable respuesta) {
		this.getRespuestasDadas().add(respuesta);
	}


	

}
