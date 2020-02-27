
public class Caguano extends Carro{
	 private int alcanceTiro;
	 private String colorConfeti;

	 public Caguano() {}
	 public Caguano(int ocupantes, int fechaIngreso, int fila, int columna, int alcanceTiro, String colorConfeti) {
		 super(ocupantes, fechaIngreso, fila, columna);
		 this.alcanceTiro=alcanceTiro;
		 this.colorConfeti=colorConfeti;
	 }
	 public void setAlcanceTiro(int alcanceTiro) {
		 this.alcanceTiro=alcanceTiro;
	 }
	 public void setColorConfeti(String colorConfeti) {
		 this.colorConfeti=colorConfeti;
	 }
	 public int getAlcanceTiro() {
		 return(this.alcanceTiro);
	 }
	 public String getColorConfeti() {
		 return(this.colorConfeti);
	 }
	 public String toString() {
		 return("tipo de carro: Caguano\n"+toString()+"\nAlcance de Tiro: "+this.alcanceTiro+"\nColor de Confeti: "+this.colorConfeti);
	 } 
}
