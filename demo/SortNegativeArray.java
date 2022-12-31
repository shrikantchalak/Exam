package demo;

import java.util.Arrays;

public class SortNegativeArray {

	public static void main(String[] args) {
		int[] arr = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
		Arrays.sort(arr);
		for (int e : arr)
			System.out.print(e + " ");
	}
}

//public class demo {
//    
//    public static void move(int[] arr)
//    {
//        Arrays.sort(arr);
//    }
// 
//    public static void main(String[] args)
//    {
//        int[] arr = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
//        move(arr);
//        for (int e : arr)
//            System.out.print(e + " ");
//    }
//}