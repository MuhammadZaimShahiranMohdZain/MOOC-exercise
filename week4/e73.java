package week4;

public class e73 {
	public class Product {
		private String nameAtStart;
		private double priceAtStart;
		private int amountAtStart;

		protected Product(String nameAtStart, double priceAtStart, int amountAtStart) {
			super();
			this.nameAtStart = nameAtStart;
			this.priceAtStart = priceAtStart;
			this.amountAtStart = amountAtStart;
		}

		public void printProduct(){
			System.out.println(this.nameAtStart + ", " + "price " + this.priceAtStart + ", " + "amount " + this.amountAtStart);
		}
	}
}