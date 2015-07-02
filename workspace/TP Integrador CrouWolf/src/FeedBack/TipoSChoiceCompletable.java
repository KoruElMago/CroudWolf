package FeedBack;

public class TipoSChoiceCompletable extends TipoChoice {

	
	@Override
	public void elegirRespuesta(RespuestasMChoice respuesta) {
		this.getRespuestasDadas().clear();
		this.getRespuestasDadas().add(respuesta);
	}
		
}
