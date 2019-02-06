import java.util.Scanner;

class exception{
	public static void main(String[]args){
		int a;
		int b;
		int c;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the value of a");
		a=sc.nextInt();
        try{
        	System.out.print("\n Enter the value of a");
        	b=sc.nextInt();
        	c=a/b;
        }catch(ArithmeticException e){
        	System.out.print("exception"+ e.toString());
        	b=1;
        }
        catch(Exception e){
        	System.out.print("exception"+ e.toString());
        	b=1;
        }
	
		c=a/b;

		System.out.print("\na="+a +"b ="+b + "a/b="+c);
	}
}