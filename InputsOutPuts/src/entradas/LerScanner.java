package entradas;

import java.util.Scanner;

public class LerScanner {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in); //Create a Scanner object
		System.out.println("Enter the username: ");
				
		String userName = myObj.nextLine(); //Read user input
		System.out.println("Username is: " + userName); //Output user input
		
		System.out.println("Enter the user age: ");
		int userAge = myObj.nextInt();
		System.out.println("User age is: " + userAge);
		
		myObj.close();
	}

}
