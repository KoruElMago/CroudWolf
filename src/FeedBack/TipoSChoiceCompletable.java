package FeedBack;

public class TipoSChoiceCompletable extends TipoChoice {

	
	@Override
	//Implementa el mensaje abstracto dejando solamenta la respuesta dada por parametro.
	public void elegirRespuesta(RespuestaCompletable respuesta) {
		
		this.getRespuestasDadas().clear();
		this.getRespuestasDadas().add(respuesta);
		
		}
}
