package consecuencias.oscurilandia;

import java.util.*;

public class Tablero {
	private char[][] tablero= new char[15][15];							//Declaración de un matriz tipo char llamada @tablero
	private Carro[] lista=new Carro[18];								//Declaración de un arreglo de objetos Carro llamado @lista
	private ArrayList <Huevo> lanzamientos=new ArrayList<Huevo>();		//Declaración de un ArrayList de objetos Huevo llamado @lanzamientos
	
	//Constructor, solo inicializa los valores de la matriz @tablero
	public Tablero() {
		for(int i=0; i<15; i++) {
			for(int j=0; j<15; j++) {
				this.tablero[i][j]='o';
			}
		}
	}

	//Métodos Set de los atributos @tablero, @lanzamientos, @lista.
	public void setLanzamientos(ArrayList <Huevo> lanzamientos) {
		this.lanzamientos = lanzamientos;
	}
	
	public void mostrarCarros() {
		for(int i=0; i<18; i++) {
			System.out.println("\n"+this.lista[i].toString()+"\n");
		}
	}
	
	//Métodos Get de los atributos @tablero, @lanzamientos, @lista.
	
	public char[][] getTablero(){
		return(this.tablero);
	}
	
	public Carro[] getLista() {
		return(this.lista);
	}
	
	public ArrayList<Huevo> getLanzamientos(){
		return(this.lanzamientos);
	}
	
	//Método mostrarMatriz que imprime en pantalla la matriz @tablero
	public void mostrarMatriz() {
		//Ciclo for que recorre la matriz @arreglo
		for(int i=0; i<15; i++) {
			for(int j=0; j<15; j++) {
				System.out.print(this.tablero[i][j]+(j==14?" ":" - "));
			}
			System.out.print("\n");
		}
	}

	//Método crearCarro 
	public void crearCarro (int tipo, int numeroCarro, int ocupantes, int fechaIngreso, int datoNumerico, String datoString) {
		int aleatorio= (int)(Math.random()*15);
		int fila;
		int columna;
		boolean comprobar=false;
		
		while(comprobar==false) {
			fila=aleatorio;
			columna=aleatorio;
			if(this.tablero[fila][columna]=='o') {
				comprobar=true;
			}
			
			if(comprobar==true) {
				switch(tipo) {
					case 1:
						this.lista[numeroCarro]= new Trupalla(ocupantes, fechaIngreso, fila, columna, datoNumerico, datoString);
						this.tablero[fila][columna]='T';
						break;
					case 2:
						if(columna==14) {
							comprobar=false;
						}
						else {
							if(this.tablero[fila][columna+1]=='o') {
								this.tablero[fila][columna]='C';
								this.tablero[fila][columna+1]='C';
								this.lista[numeroCarro]= new Caguano(ocupantes, fechaIngreso, fila, columna, datoNumerico, datoString);
							}
							else {
								comprobar=false;
							}
						}
						break;
					case 3:
						if((fila==14)||(fila==13)) {
							comprobar=false;
						}
						else {
							if((this.tablero[fila+1][columna]=='o')&&(this.tablero[fila+2][columna]=='o')) {
								this.lista[numeroCarro]= new Kromi(ocupantes, fechaIngreso, fila, columna, datoNumerico, datoString);
								this.tablero[fila][columna]='K';
								this.tablero[fila+1][columna]='K';
								this.tablero[fila+2][columna]='K';
							}
							else {
								comprobar=false;
							}
						}
						break;	
				}
				

			}			
		}
	}
	
	
	public String lanzarHuevo(int fila, int columna) {
		String frase=" ";
		
		switch(this.tablero[fila][columna]) {
		case 'o':
			lanzamientos.add(new Huevo(fila, columna, 0));
			frase="El huevo ha caído en un espacio libre.\nNo obtienes puntos.";
			break;
		case 'T':
			lanzamientos.add(new Huevo(fila, columna, 1));
			frase="El huevo le ha dado a una TRUPALLA.\nObtienes 1 pto.";
			break;
		case 'C':
			
			for(int i=3; i<8; i++) {
				this.lista[i].getCeldaInicial();
			}
			
			
			
			
			
			
			if(((this.tablero[fila][columna-1]=='H')&&(this.tablero[fila][columna+1]!='C'))||
					((this.tablero[fila][columna+1]=='H')&&(this.tablero[fila][columna-1]!='C'))) {
				lanzamientos.add(new Huevo(fila, columna, 9));
				frase="Has inutilizado completamente un CAGUANO.\nObtienes 9 ptos";
			}
			else {
				lanzamientos.add(new Huevo(fila, columna, 2));
				frase="Le has dado a un CAGUANO.\nObtienes 2 ptos";
			}
			break;
		case 'K':
			if((this.tablero[fila+1][columna]=='H')&&(this.tablero[fila+2][columna]=='H')&&(this.tablero[fila-1][columna]!='K')&&(this.tablero[fila-2][columna]!='K')){
				
			}
			
			break;
		}
		return(frase);
	}
		
			

}
	
	

