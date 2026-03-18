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
		
	
		personaLafuente persona3 = new personaLafuente(); 
		persona3.setNombre("Brock");
		persona3.setApellido("Oak");
		persona3.setNumeroDocumentoIdentidad("118823912");
		persona3.setEdad(38);
		persona3.setCasado(false);
		 
		System.out.println("Datos persona 3: " );
		persona3.mostrarInformacion();
		
		persona3.setNombre("Misty");
		persona3.setApellido("Ketchup");
		persona3.setEdad(28);
		persona3.setNumeroDocumentoIdentidad("374882391");
		persona3.setCasado(true);
		
		System.err.println("Datos actualizados persona 3: ");
		persona3.mostrarInformacion();
	}

}
