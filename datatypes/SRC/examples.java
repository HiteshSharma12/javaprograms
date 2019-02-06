import java.util.*;



static void abc() throws ArithmeticException,ArrayIndexOutOfBoundsException;
int a;
int b;
int c;
int[]d=(2);
Scanner sc= new Scanner(System.in);
System.out.print("enter a:");
a=sc.nextInt();
System.out.print("enter b:");
b=sc.nextInt();
c=a/b;
System.out.print("\n a="+a+"b ="+b +"c="+c);
d[7]=6;
}
public static void main(String[]args){
	try{
		abc();

	}
	catch(ArithmeticException e){
		System.out.print("\n ArithmeticException");
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.print("\n ArrayIndexOutOfBoundsException");
	}
}