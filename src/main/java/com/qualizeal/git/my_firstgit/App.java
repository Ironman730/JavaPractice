package com.qualizeal.git.my_firstgit;
public class App 
{
    public static void main( String[] args )
    {
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
        
        String[] arr = {"Gopi","Afrose","Lohit","Ganesh"};
        for(int j = 0; j<=4; j++) {
        	System.out.print(arr[j] + " ");
        }
    }
}
