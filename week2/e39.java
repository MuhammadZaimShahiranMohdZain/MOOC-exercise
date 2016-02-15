package week2;

public class e39 {
	e39(){
//		printStars(5);
//		printStars(3);
//		printStars(9);
//		printSquare(4);
//		printRectangle(17, 3);
		printTriangle(4);
	}
	private static void printStars(int amount){
		int count = 0;
		while(count<amount){
			System.out.print("*");
			count++;
		}
		System.out.println();
	}
	
	private static void printSquare(int amount){
		int x=0;
		int y=0;
		
		while(x<amount){
			while(y<amount){
				System.out.print("*");
				y++;
			}
			System.out.println();
			x++;
			y=0;
		}
	}
	
	private static void printRectangle(int width, int height){
		int x=0;
		int y=0;
		
		while(x<height){
			while(y<width){
				System.out.print("*");
				y++;
			}
			System.out.println();
			x++;
			y=0;
		}
	}
	
	private static void printTriangle(int size){
		int x = 0;
		int y = 0;
		while(y<size){
			while(x<=y){
				System.out.print("*");
				x++;
			}
			System.out.println();
			y++;
			x=0;
		}
	}
}
