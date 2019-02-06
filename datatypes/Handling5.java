class Handling{
	
	int i;

	void throwExceptionHandling(){
       System.out.println("Inside class Handling");
		throw new ArithmeticException();

	}


	
}



class B extends Handling{
	int b;
	void throwException(){
		System.out.println("Inside class b");
		throw new ArithmeticException();
	}
	void Overridethrow(){
		System.out.print("Inside class B");
		super.throwException();
	}
}

class C extends B{
	int  c;
	void throwException(){
		System.out.println("Inside class C");
		throw new ArithmeticException();
	}
   void Overridethrow(){
   	System.out.println("Inside class C");
   	super.throwException();
   }
}


class HierarchyDriver{
	public static void main(String[] args){
		Handling a=new Handling();
        a.throwException();

        B b =new B();
        System.out.print("Throing exception in B");
        b.throwException();
        System.out.print("Overriding exception in B");
        b.Overridethrow();


        C c =new C();
        System.out.println("Throwing exception in C");
        c.throwException();
        System.out.print("Overriding exception in C");
        c.Overridethrow();


	}

	catch(ArithmeticException e){
		System.out.print("Exception");
	}

}



