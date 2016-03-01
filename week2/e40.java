package week2;

public class e40 {
	e40(){
//		printTriangle(4);
		xmasTree(4);
	}

	private static void printTriangle(int size){
		int white = size;
		int star = 0;
		int y = 0;
		while(y<size){
			white--;
			star++;
			printWhitespaces(white);
			printStars(star);
			System.out.println();
			y++;
		}
	}

	private static void xmasTree(int height){
		int white = height;
		int star = 0;
		int y = 0;
		while(y<height){
			white--;
			star++;
			printWhitespaces(white);
			printStars(star);
			star--;
			printStars(star);
			star++;
			printWhitespaces(white);
			System.out.println();
			y++;
		}
		
		int bark = 0;
		while(bark<2){
			printWhitespaces(star-2);
			printStars(3);
			System.out.println();
			bark++;
		}
		
	}
	
	private static void printWhitespaces(int amount){
		int count = 0;
		while(count<amount){
			System.out.print(" ");
			count++;
		}
	}

	private static void printStars(int amount){
		int count = 0;
		while(count<amount){
			System.out.print("*");
			count++;
		}
	}
}
