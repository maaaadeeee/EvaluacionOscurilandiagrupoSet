package consecuencias.oscurilandia;

public class Huevo {
	private int fila;
	private int columna;
	private int puntaje;
	
	public Huevo() {}
	public Huevo(int fila, int columna, int puntaje) {
		this.fila=fila;
		this.columna=columna;
		this.puntaje=puntaje;
	}
	
	public void setFila(int fila) {
		this.fila=fila;
	}
	
	public void setColumna(int columna) {
		this.columna=columna;
	}
	
	public void setPuntaje(int puntaje) {
		this.puntaje=puntaje;
	}
	public int getFila() {
		return(this.fila);
	}
	
	public int getColumna() {
		return(this.columna);
	}
	
	public int getPuntaje() {
		return(this.puntaje);
	}
	
	public String toString() {
		return("Coordenadas: (" + this.fila+ ","+this.columna+") \n"+ "Puntaje: "+this.puntaje);
	}
}
