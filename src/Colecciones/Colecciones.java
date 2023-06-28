package Colecciones;
//import java.util.HashSet; //parent
//import java.util.Set; //child

public class Colecciones {
	public static void main(String[] args) {
		//Set<String> cartasJuego = new HashSet<>();
	
		String[] listaCompras =  new String[] {"leche", "pan", "frutas"};
		//for each para cada elemento de tipo string dentro del array listaCompras, llamado producto se imprime.
		for(String producto : listaCompras) {
			System.out.println(producto);
		}
		
	}

}
