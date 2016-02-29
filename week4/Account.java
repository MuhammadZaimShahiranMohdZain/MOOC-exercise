package week4;

	public class Account {
		private double balance;
		private String comment;
		
		public Account() {
			// TODO Auto-generated constructor stub
		}
		Account(String comment, double balance){
			this.balance = balance;
			this.comment = comment;
		}
		public void withdrawal(double i) {
			// TODO Auto-generated method stub
			balance -= i;
		}
		public void deposit(double i) {
			// TODO Auto-generated method stub
			balance += i;
		}
		public double balance() {
			// TODO Auto-generated method stub
			return balance;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			this.balance *= 100;
			if(this.balance%100==0){
				this.balance /= 100;
				return "Balance of "+this.comment+": " + (int)this.balance;			
			}
			else{
				this.balance /= 100;
				return "Balance of "+this.comment+": " + this.balance;						
			}
		}
	}
