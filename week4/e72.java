package week4;

public class e72 {
	public static void Barto(){
		Account bartosAccount = new Account("Barto's account",100.00);
		Account bartosSwissAccount = new Account("Barto's account in Switzerland",1000000.00);
		
		System.out.println("Initial state");
		System.out.println(bartosAccount);
		System.out.println(bartosSwissAccount);
		
		bartosAccount.withdrawal(20.20);
		System.out.println("Barto's account balance is now: "+bartosAccount.balance());
		bartosSwissAccount.deposit(200);
		System.out.println("Barto's Swiss account balance is now: "+bartosSwissAccount.balance());
		
		System.out.println("\nFinal state");
		System.out.println(bartosAccount);
		System.out.println(bartosSwissAccount);		
	}
	
	public static void Matt(){
		Account matt = new Account("Matt's account",1000);
		Account myAccount = new Account("My account",0);
		
		matt.withdrawal(100.5);
		myAccount.deposit(100);
		
		System.out.println(matt);
		System.out.println(myAccount);
	}
	
	public static void transfer(Account from, Account to, double howMuch){
		from.withdrawal(howMuch);
		to.deposit(howMuch);
	}
	
	public static void main(String[] args) {
//		Barto();
//		Matt();
		
		Account A = new Account("A",100);
		Account B = new Account("B",0);
		Account C = new Account("C",0);
		
		transfer(A, B, 50);
		transfer(B, C, 25);
		
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
	}
}
