package Actividad3_Lafuente;



public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		personaLafuente persona1 = new personaLafuente("Sebastian", "Munoz", "021", 20, false);
		
		System.out.println("Persona1: \n" + persona1.getNombre());
		System.out.println( persona1.getApellido());
		System.out.println( persona1.getNumeroDocumentoIdentidad());
		System.out.println( persona1.getEdad());
		System.out.println( persona1.isCasado() + "\n");
		
		
		personaLafuente persona2 = new personaLafuente("Thiago", "Lafuente", "37719382", 17, true);
		
		System.out.println("Persona2: \n" + persona2.getNombre());
		System.out.println( persona2.getApellido());
		System.out.println( persona2.getNumeroDocumentoIdentidad());
		System.out.println( persona2.getEdad());
		System.out.println( persona2.isCasado() + "\n");
		
	
		personaLafuente persona3 = new personaLafuente("Luciano", "Ayala", "2341214", 15, false);
		
		System.out.println("Persona3: \n" + persona3.getNombre());
		System.out.println( persona3.getApellido());
		System.out.println( persona3.getNumeroDocumentoIdentidad());
		System.out.println( persona3.getEdad());
		System.out.println( persona3.isCasado() + "\n");
	}

}
