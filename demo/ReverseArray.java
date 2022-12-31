package demo;

public class ReverseArray {

	public static void main(String[] args) {
		int a[] = { 10, 20, 22, 30 };

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter");
//
//		for (int i = 0; i < a.length; i++) {
//
//			a[i] = sc.nextInt();
//
//		}

		for (int i = a.length - 1; i >= 0; i--) {

			System.out.println(a[i] + " ");
		}

	}

}
