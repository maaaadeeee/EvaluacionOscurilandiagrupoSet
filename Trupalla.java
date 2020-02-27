
public class Trupalla extends Carro {
	private int nivelArmadura;
	private String nombrePersona;
		
	public Trupalla() {}
	public Trupalla(int ocupantes, int fechaIngreso, int fila, int columna, int nivelArmadura, String nombrePersona) {
		super(ocupantes, fechaIngreso, fila, columna);
		this.nivelArmadura=nivelArmadura;
		this.nombrePersona=nombrePersona;
	}
	public void setNivelArmadura(int nivelArmadura) {
		this.nivelArmadura=nivelArmadura;
	}
	 public void setNombrePersona(String nombrePersona) {
		 this.nombrePersona=nombrePersona;
	 }
	 public int getNivelArmadura() {
		 return(this.nivelArmadura);
	 }
	 public String getNombrePersona() {
		 return(this.nombrePersona);
	 }
	 public String toString() {
		 return("Tipo de Auto: Trupalla"+toString()+"\nNivel de Armadura: "+this.nivelArmadura+"\nNombre de Persona: "+this.nombrePersona);
	 }
}
