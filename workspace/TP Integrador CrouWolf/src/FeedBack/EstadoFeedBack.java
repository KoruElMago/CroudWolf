package FeedBack;

public class EstadoFeedBack {

	
	public boolean equals(Object o ){
		return o.getClass().equals(this.getClass());
	}

	public boolean estaValidada() {
		return true;
	}
	
	public boolean esCorrecta(){
		return false;
	}
}
