import java.util.Scanner;
public class ADDITION_USING_STATIC {
	static int x;
	static int y;
	static int z;

	public static  void addition() {
		
		z = x + y;
		System.out.println("The sum is:" + z);

		}

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		x=sc.nextInt();
		System.out.println("Enter the second number:");
		y=sc.nextInt();
		addition();
		}

}
