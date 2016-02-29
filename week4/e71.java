//package week4;
//
//import java.util.ArrayList;
//
//public class e71 {
//	public static void combine(ArrayList<Integer> first, ArrayList<Integer> second){
//		ArrayList<Integer> help = new ArrayList<>();
//		for(int i=0; i<first.size();i++)
//			for(int j:second){
//				System.out.println(first.contains(j) + "" + j);
//			}
//		System.out.println(help);
//	}
//	public static void main(String[] args) {
//		ArrayList<Integer> list1 = new ArrayList<Integer>();
//		ArrayList<Integer> list2 = new ArrayList<Integer>();
//
//		list1.add(4);
//		list1.add(3);
//		list1.add(7);
//
//		list2.add(5);
//		list2.add(10);
//		list2.add(7);
//
//		combine(list1, list2);
//
//		System.out.println(list1); // prints [4, 3, 5, 10, 7]
//
//		System.out.println(list2); // prints [5, 10, 7]
//	}
//}
