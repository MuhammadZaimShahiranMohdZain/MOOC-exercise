package week1;

import java.util.Scanner;

public class e20 {
	e20(){
		Scanner reader = new Scanner(System.in);
		String username="";
		String password="";
			System.out.println("Type your username: ");
			username = reader.nextLine();
			System.out.println("Type your password: ");
			password = reader.nextLine();

			if(username.equals("alex")||username.equals("emily")){
				if((username.equals("alex")&&password.equals("mightyducks")) || (username.equals("emily")&&password.equals("cat")))
					System.out.println("You are now logged into the system!");
				else
					System.out.println("Your password was invalid");
			}
			else
				System.out.println("Your username was not recognized");
	}
}
