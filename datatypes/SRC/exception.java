import java.util.Scanner;

class exception{
	public static void main(String[]args){
		int a;
		int b;
		int c;
		Scanner sc =new Scanner(System.in);
		System.out.print("\nEnter the value of a");
		a=sc.nextint();

		System.out.print("\nEnter the value of b");
		b=sc.nextint();
		c=a/b;

		System.out.print("\na="+a +"b ="+b + "a/b="+c);
	}
}