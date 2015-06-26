
public class Proyecto {
	
	private ArrayList<Tarea> tareas;
	private ArrayList<String> temasDeInteres;
	private String nombre;
	private String descripcion;
	private PerfilDelWorker perfilWorker;
	
	
	
	public Proyecto new(String nombre, String descripcion){
		this.setNombre(nombre);
		this.setDescripcion(descripcion);
		this.avisarProyecto(p)	
	}

	
	
	
	public agregarTarea(Tarea t){
		this.getTareas.add(t);
	}
	
	public agregarTarea(List<Tarea> t){
		this.getTareas.add(t)
	}
	
	public void agregarTemaDeInteres(String t){
		this.temasDeInteres.add(t);
	}
	
	public void solicitarMasTareas(Worker w){
		w.asignarTareas(this.proximoPaqueteTareas());
	}
	
	public void solicitarMasTareas(Worker w){
		//
		w.agregarTarea(this.darTareaDisponible());
	}

	public Tarea tareaDisponible() {
		return this.tareasDisponibles().first();
	}

	private List<Tarea> tareasDisponibles2() {
		rs = ArrayList<Tarea>;
		for (Tarea t : this.getTareas){
			if(t.esTareaDisponible()){
				rs.addd(t);
			}
		}
		return rs;
	}
	
	public list<Tarea> tareasCompletas(){
		return tareasCompletas2();
	}
	
	private List<Tarea> tareasCompletas2(){
		rs = ArrayList<Tarea>;
		for (Tarea t : this.getTareas){
			if(t.esTareaCompleta()){
				rs.addd(t);
			}
		}
	}

	public list<Tarea> tareasIncompletas(){
		return tareasIncompletas2();
	}
	
	private List<Tarea> tareasIncompletas2(){
		rs = ArrayList<Tarea>;
		for (Tarea t : this.getTareas){
			if(t.esTareaIncompleta()){
				rs.addd(t);
			}
		}
	}

	//getters y setters

	private void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	private void setDescripcion(String descripcion){
		this.descripcion = descripcion;
	}
	
	private ArrayList<Tarea> getTareas(){
		return this.Tareas;
	}
	
	private void setPerfilDelWorker(PerfilDeWorker pdw){
		this.perfilWorker = pdw;
	}

}
