package cl.EjemploHashMap;

//almacena elementos en pares " clave / valor " y accedes a ellos mediante un índice de otro tipo (por ejemplo, a String).

/*Un objeto se utiliza como clave (índice) para otro objeto (valor). Puede almacenar diferentes tipos: String claves y 
valores Integer, o el mismo tipo, como: claves String y valores String:*/

import java.util.HashMap;

/**
 * 
 * @author Alexis Santander
 *
 */

public class Main {

	public static void main(String[] args) {
		
		HashMap<String, String> paisesCiudades = new HashMap<String, String>();
		
		//agrego elementos con put
		
		paisesCiudades.put("Chile", "Linares");
		paisesCiudades.put("Peru", "Lima");
		paisesCiudades.put("Colombia", "Bogotá");
		paisesCiudades.put("Rusia", "Moscu");
		paisesCiudades.put("China", "Beiging");
		
		System.out.println(paisesCiudades);
		
		
		 // Agregar clave and valor (Pais, Ciudad)
		
		paisesCiudades.put("Argentina", "Mendoza");
		
		System.out.println(paisesCiudades);
		
		//Para acceder a un item 
		
		
		System.out.println(paisesCiudades.get("Rusia"));
		
		
		//Para eliminar un item
		
		paisesCiudades.remove("Chile");
		
		System.out.println(paisesCiudades);
		
		//Para ver el tamaño del hashMap
		
		System.out.println(paisesCiudades.size());
		
		//Recorrer el HashMap (Key)
		
		for(String i: paisesCiudades.keySet()) {
			System.out.println(i);
		}
		
		//Recorrer el HashMap (Value)
		
		for(String i: paisesCiudades.values()) {
			System.out.println(i);
		}
	}

}



