package FeedBack;

import java.util.ArrayList;

public class TipoMChoiceMultiple extends TipoMChoice {


	public TipoMChoiceMultiple(){
		this.setRespuestasDadas(new ArrayList<RespuestasMChoice>());
				
	}
	@Override
	public void elegirRespuesta(RespuestasMChoice respuesta) {
		this.getRespuestasDadas().add(respuesta);
	}


	

}
