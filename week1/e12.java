package week1;

import java.util.Scanner;

public class e12 {
	e12(){
		Scanner reader = new Scanner(System.in);
		String name1="";
		int age1=0;
		System.out.println("Type your name: ");
		name1 = reader.nextLine();
		System.out.println("Type your age: ");
		age1 = Integer.parseInt(reader.nextLine());

		String name2="";
		int age2=0;
		System.out.println("Type your name: ");
		name2 = reader.nextLine();
		System.out.println("Type your age: ");
		age2 = Integer.parseInt(reader.nextLine());
		
		System.out.println(name1 + " and " + name2 + " are " + (age1 + age2) + " years old in total");
	}
}
