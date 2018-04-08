import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Console;
import java.util.*;

public class password {
	
	public static void main(String[] args) {
	
	// Console console = System.console();
		
	Scanner user_inp = new Scanner(System.in);
	
	String all = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890 ";
	
	//doesn't work with other characters
	
	char[] alphabet = all.toCharArray();
	
	String result = "";
		
	boolean success = false;
	
	// char[] password = console.readPassword("Password: ");
	
	System.out.println("A very simple brute-force password cracker. \n Enter an alphanumeric password with four characters.\n\n");
	
	System.out.print("Enter your password: ");
	
	String password = user_inp.nextLine();
	
	// String password1 = password.toString();
	
	if(password.length()!=4) {
		
		System.out.println("Password too short or too long. Exiting.");
		
	}
	
	else {
	
	outerloop:
	for(int i=0; i<alphabet.length; i++) {
		
		
		for(int j=0; j<alphabet.length; j++) {
			
			result = ""+ alphabet[i] + alphabet[j];
			
			for(int k=0; k<alphabet.length; k++) {
				
				result = "" + alphabet[i] + alphabet[j] + alphabet[k];
				
				for(int l=0; l<alphabet.length; l++) {
					
					result = "" + alphabet[i] + alphabet[j] + alphabet[k] + alphabet[l];
					
						
						
						
						if(result.equals(password)) {
							
							System.out.println("Found it! Your password is: " + result);
							success = true;
							break outerloop;
							
						}
						
						else {
							System.out.println(result);
						}
						
						
					
					
				}
				
			}
			
			
			
		}
		
	}
	
	
	}
		
		if(!success){
		System.out.println("Invalid input. You entered a non-alphanumeric character. ");	
		}

}

}
