package com.qualizeal.git.my_firstgit;
import com.qualizeal.git.my_firstgit.venkatgit.Oerations;
public class App 
{
    public static void main( String[] args ) {
    	
    	Oerations operations = new Oerations();
    	
        System.out.println( "Hello World!" );
        System.out.println("basic Program");
        
        int a = 10;
        int b = 15;
        int c = a + b;
        
        System.out.println(c);
        
        System.out.println("basic forloop code");
        
        int n = 10;
        for(int i = 0; i <= n; i++) {
        	System.out.print(i + " ");
        }
        System.out.println();
        
        String[] arr = {"Gopi","Afrose","Lohit","Ganesh","Avinash","Venkat"};
        for(String j : arr) {
        	System.out.print(j + " ");
        }
        System.out.println();
        // The code is been updated by lateral git
        
        // The Updated code is from VenkatGit by using Oerations class and creating an object.
        
        System.out.println("Addition" + operations.add());
        System.out.println("Subtraction" + operations.sub());
        System.out.println("Multiplication" + operations.multiply());
        System.out.println("Division" + operations.division());
        
        
    }
}
