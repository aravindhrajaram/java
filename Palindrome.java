
class Palindrome {

	public static void main(String[] arg) {
		int a = 153;
		int b = a;
		int rev1 = 0;
		int count = 0;
		int total = 0;
		while (a > 0) {
			int rev = a % 10;

			total = total  +( rev*rev*rev);
			a = a / 10;
			//count++;
		}
		if(b==total) {
		System.out.println("this is palindrome " + total);
		}else {
			System.out.println("this is not palindrome " );
		}
		if (total == b) {
			System.out.println("this is ams no: " + total);
		} else {
			System.out.println("this not ams no");
		}
		System.out.println("The Armstrong number is " +total);

		while (total > 0) {
			int c = total % 10;
			rev1 = rev1 + c;

			total = total / 10;
		}
		
		System.out.print("the sum of ams no is :" + rev1);

	}
}
