package consecuencias.oscurilandia;

import java.util.Scanner;

public class MainOscurilandia3 {

	private static Scanner entrada1;
	private static Scanner entrada2;
	private static Scanner entrada3;
	private static Scanner entrada4;
	private static Scanner entrada5;
	private static Scanner entradaString;

	public static void main(String[] args) {
		entrada1 = new Scanner(System.in);
		entrada2 = new Scanner(System.in);
		entrada3 = new Scanner(System.in);
		entrada4 = new Scanner(System.in);
		entrada5 = new Scanner(System.in);
		entradaString = new Scanner(System.in);
		Tablero tablero=new Tablero();
		int tipo=0;
		int ocupantes=0;
		int fechaIngreso=0;
		int datoNumerico=0;
		String datoString=" ";
		
		
		System.out.println("\t\t\tCOMANDO CENTRAL PKS\n");
		System.out.println("\n- Antes de iniciar la contienda, debe ingresar los datos de los carros que será dispuestos en el campo de batalla ");
		System.out.println("\n- Usted dispone de:3 Kromis, 5 Caguanos y 10 Trupallas.");
		
		
		for(int i=0; i<18;i++) {
			
			if(i<3) {
				tipo=3;
				System.out.print("\n- Ingrese los datos de la KROMI n°"+(i+1)+"\nAño de fabricación: ");
				while((datoNumerico<1980)||(datoNumerico>2020)) {
					datoNumerico=entrada1.nextInt();
					if((datoNumerico<1980)||(datoNumerico>2020)) {
						System.out.println("EL AÑO INGRESADO NO ES VÁLIDO, POR FAVOR INTÉNTELO NUEVAMENTE");
					}
				}
				System.out.print("Marca: ");
				datoString=entradaString.nextLine();
			}
			
			if((i>=3)&&(i<8)) {
				tipo=2;
				System.out.print("\n- Ingrese los datos del CAGUANO n°"+(i-2)+"\nAlcance de tiro (en mts): ");
				while((datoNumerico<1)||(datoNumerico>2000)) {
					datoNumerico=entrada2.nextInt();
					if((datoNumerico<1)||(datoNumerico>2000)) {
						System.out.println("EL RANGO INGRESADO NO ES VÁLIDO, POR FAVOR INTÉNTELO NUEVAMENTE");
					}
				}
				
				System.out.print("Color de confeti: ");
				datoString=entradaString.nextLine();
			}
			
			
			if((i>=8)&&(i<15)){
				tipo=1;
				System.out.print("\n- Ingrese los datos de la TRUPALLA n°"+(i-7)+"\nNivel de armadura (1 a 5): ");
				while((datoNumerico<1)||(datoNumerico>5)) {
					datoNumerico=entrada3.nextInt();
					if((datoNumerico<1)||(datoNumerico>5)) {
						System.out.println("EL RANGO INGRESADO NO ES VÁLIDO, POR FAVOR INTÉNTELO NUEVAMENTE");
					}
				}
				
				System.out.print("Nombre del operador: ");
				datoString=entradaString.nextLine();
				
			}
			
			
			System.out.print("Capacidad max: ");
			while((ocupantes<1)||(ocupantes>100)) {
				ocupantes=entrada4.nextInt();
				if((ocupantes<1)||(ocupantes>100)){
					System.out.println("EL NÚMERO INGRESADO NO ES VÁLIDO, POR FAVOR INTÉNTELO NUEVAMENTE");
				}
			}
			
			System.out.print("Año de Ingreso a PSK: ");
			while((fechaIngreso<1980)||(fechaIngreso>2020)) {
				fechaIngreso=entrada5.nextInt();
				if((fechaIngreso<1980)||(fechaIngreso>2020)) {
					System.out.println("EL AÑO INGRESADO NO ES VÁLIDO, POR FAVOR INTÉNTELO NUEVAMENTE");
				}
			}
			
			tablero.crearCarro(tipo, i, ocupantes, fechaIngreso, datoNumerico, datoString);
			datoNumerico=0;
			ocupantes=0;
			fechaIngreso=0;
			
		}
		
		System.out.print("\n\n\n\n\n\n\n\n\n\n");
		
		System.out.println("\t\tOSCURILANDIA");
		System.out.println("\n");
		tablero.mostrarMatriz();
		
		
		
		
	}

}
