/*
* author: Sang Nguyen
* email: shn2020@email.vccs.edu
* 	
*/

import java.util.Scanner;
public class LoginInf {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

		// prompt user to create new account	
		System.out.print(" Create your new account " +
				"\nEnter your username: ");
		String username = input.next();
		System.out.print("Enter your password: ");
		String password = input.next();
		
		// prompt user to enter his or her username and password
		System.out.print(" Authenticate your account "
				+"\nRe-enter your username: ");
		String enterusername = input.next();
		System.out.print("Re-enter your password: ");
		String enterpassword = input.next();
		
		// check username and password
		// If username and password match output welcome user
		// else warn the user that username and password are wrong.
	 
		if (username == enterusername && password == enterpassword) { 
			System.out.println("Welcome " + username );
		}
		
		else {
			System.out.print("Wrong Username or Password!!!");
  		}
		input.close();		
}
}