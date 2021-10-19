package Aula1;

public class MainApplication2 {

	public static void main(String[] args)  {
		
		
	        String str = "  Hello World !!   ";
	 
	        System.out.println( str.strip() );          /*"Hello World !!" */    System.out.println("fim");
	 
	        System.out.print( str.stripLeading() );   /*"Hello World !!   " */    System.out.println("fim");
	    
	 
	        System.out.print( str.stripTrailing() );  /*"  Hello World !" */    System.out.println("fim");
	    }
	}
