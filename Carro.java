
 public class Carro {
	 	private int ocupantes;
	 	private int fechaIngreso;
	 	private int fila;
	 	private int columna;
	 	
	 	
	 	public Carro () {}
	 	public Carro (int ocupantes, int fechaIngreso, int fila, int columna) {
	 		this.ocupantes=ocupantes;
	 		this.fechaIngreso=fechaIngreso;
	 		this.fila=fila;
	 		this.columna=columna;
	 	}
	 	
	 	public void setOcupantes(int ocupantes) {
	 		this.ocupantes=ocupantes;
	 	}
	 		
	 	public void setFechaIngreso(int fechaIngreso) {
	 		this.fechaIngreso=fechaIngreso;
	 	}
	 	public void setFila(int fila) {
	 		this.fila=fila;
	 	}
	 	public void setColumna(int columna) {
	 		this.columna=columna;
	 	}
	 	
	 	public int getOcupantes() {
	 		return(this.ocupantes);
	 	}
	 	public int getFechaIngreso() {
	 		return(this.fechaIngreso);
	 	}
	 	public int getfila() {
	 		return(this.fila);
	 	}
	 	public int getColumna() {
	 		return(this.columna);
	 	}
	 	public String toString() {
	 		return("Cantidad de ocupantes: "+this.ocupantes+"\nFecha de ingreso "+this.fechaIngreso);
	 	}
}
 
 
 
