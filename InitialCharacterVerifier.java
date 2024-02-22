import java.util.Scanner;

public class InitialCharacterVerifier{

    public static void main(String[] args) {
    	System.out.println("Initial Character Verifier");
    	Boolean yn = true;
    	Scanner scan = new Scanner(System.in);
    	String cadena = "";
    	while(yn){	    	
	    	System.out.println("\n Ingresa la cadena:");
    		cadena = scan.nextLine();
	    	System.out.println("La palabra inicial " + Principal(cadena));
	    	System.out.println("¿Desea continuar? (Y/N) \n");
	    	yn = scan.nextLine().trim().equalsIgnoreCase("y");
    	}
    	scan.close();
    	System.exit(0);
    }
	public static String Principal(String cadena) {
		if(cadena == "" || cadena == null) {
    		return "esta vacia";
    	}
    	if(cadena.substring(0,1).matches("[!@#$%&*()_+=|<>?{}\\\\[\\\\]~-]")) {
    		return "es un caracter especial.";
    	}
    	char primeros = cadena.charAt(0);
    	if(Character.isDigit(primeros)) {
    		return "es un digito.";
    	}
    	if(cadena.substring(0,1).matches("[A-Z]")){
    		return "es una Mayuscula";
    	}else{
    		return "es un Minuscula";
    	}
	}
}