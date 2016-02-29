package week4;

public class e77 {
	public static void main(String[] args) {
//		LyyraCard card = new LyyraCard(10);
//		System.out.println(card);
//
//		card.loadMoney(15);
//		System.out.println(card);
//
//		card.loadMoney(10);
//		System.out.println(card);
//
//		card.loadMoney(200);
//		System.out.println(card);
//
//		/*77.5*/
//		LyyraCard card = new LyyraCard(10);
//		System.out.println("Pekka: " + card);
//		card.loadMoney(-15);
//		System.out.println("Pekka: " + card);
		
		LyyraCard Pekka = new LyyraCard(20);
		LyyraCard Brian = new LyyraCard(30);
		
		Pekka.payGourmet();
		Brian.payEconomical();
		
		System.out.println("Pekka: "+Pekka);
		System.out.println("Brian: "+Brian);
		
		Pekka.loadMoney(20);
		Brian.payGourmet();
		
		System.out.println("Pekka: "+Pekka);
		System.out.println("Brian: "+Brian);
		
		Pekka.payEconomical();
		Pekka.payEconomical();
		
		Brian.loadMoney(50);
		
		System.out.println("Pekka: "+Pekka);
		System.out.println("Brian: "+Brian);
	}
}
