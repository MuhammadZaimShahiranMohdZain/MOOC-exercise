package week1;

import java.util.Scanner;

public class e22 {
	e22(){
		Scanner reader = new Scanner(System.in);
		String pass;
		String result;
		while(true){
			System.out.println("Type the password: ");
			pass=reader.nextLine();
			
			if(pass.equals("carrot")){
				result = "Right!\n";				
				System.out.println("The secret is: jryy qbar");
			}
			else
				result = "Wrong!\n";
			System.out.println(pass);
		}
	}
}
