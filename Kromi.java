
public class Kromi extends Carro{
	 private int fechaFabricacion;
	 private String marca;
	 
	 public Kromi()  {}
	 public Kromi(int ocupantes, int fechaIngreso, int fila, int columna, int fechaFabricacion, String marca) {
		 super(ocupantes, fechaIngreso, fila, columna);
		 this.fechaFabricacion=fechaFabricacion;
		 this.marca=marca;		 
	 }
	 
	 public void setFechaFabricacion(int fechaFabricacion) {
		 this.fechaFabricacion=fechaFabricacion;
	 }
	 public void setMarca(String marca) {
		 this.marca=marca;
	 }
	 
	 public int getFechaFabricacion() {
		 return(this.fechaFabricacion);
	 }
	 public String getMarca() {
		 return(this.marca);
	 }
	 public String toString() {
		 return("Tipo de carro: Kromi\n"+toString()+"Año de Fabricacion: "+this.fechaFabricacion+"\nMarca: "+this.marca);
	 }
}

