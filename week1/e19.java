package week1;

import java.util.Scanner;

public class e19 {
	e19(){
		int age;
		Scanner reader = new Scanner(System.in);
		while(true){
			System.out.println("How old are you? ");
			age = Integer.parseInt(reader.nextLine());
			if(age>=0&&age<=120)
				System.out.println("OK");
			else
				System.out.println("Impossible!");
		}
	}
}
