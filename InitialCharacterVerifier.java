import java.util.Scanner;

public class InitialCharacterVerifier{

    public static void main(String[] args) {
    	System.out.println("Initial Character Verifier");
    	Boolean yn = true;
    	Scanner scan = new Scanner(System.in);
    	String cadena = "";
    	while(yn){	    	 //Este ciclo nos hace poder tener un ciclo hasta N 
	    	System.out.println("\n Ingresa la cadena:");
    		cadena = scan.nextLine(); //Este metodo de scan es diferente para poder aceptar cadenas vacias
	    	System.out.println("La palabra inicial " + checkInitialCharacter(cadena));//Llamamos metodo
	    	System.out.println("¿Desea continuar? (Y/N) \n");
	    	yn = scan.nextLine().trim().equalsIgnoreCase("y");
    	}
    	scan.close();
    	System.exit(0);
    }
	public static String checkInitialCharacter(String cadena) {
		if(cadena == "" || cadena == null) { //Comprobamos primero si la cadena tiene algo
    		return "esta vacia";
    	}
    	if(cadena.substring(0,1).matches("[!@#$%&*()_+=|<>?{}\\\\[\\\\]~-]")) {//Verificamos caracteres especiales con una expresion regular
    		return "es un caracter especial.";
    	}
    	char primeros = cadena.charAt(0);
    	if(Character.isDigit(primeros)) {//Ocupamos el metodo de isDigit para comprobar si es digito
    		return "es un digito.";
    	}
    	if(cadena.substring(0,1).matches("[A-Z]")){//Con una expresion regular validamos por mayusculas
    		return "es una Mayuscula";
    	}else{//En caso de no ser mayus debe ser minus
    		return "es un Minuscula";
    	}
	}
}