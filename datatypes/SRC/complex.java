
class complex{
	int real;
	int imaginary;
       //non -parameterised contsructor
	complex1(){ }

     //parameterised constructor
	complex1(int real , int imaginary){
		this.real=real;
		this.imaginary=imaginary;


	}
    
    complex1 add(complex c){
    	complex1 cadd=new complex();
    	cadd.real=real +c.real;
    	cadd.imaginary=c.imaginary;
    	return cadd;
    }
}   

class complex{
	public static void main(String[] args){
		complex1 c1=new complex1(1,2);
		complex1 c2=new complex1(3,4);
		complex1 c3=new complex1();
		c3=c1.add(c2);
		System.out.print("c1 ="+c1.real +" "+c1.imaginary);
		System.out.print("c2 ="+c2.real +" "+c2.imaginary);
		System.out.print("Sum ="+c3.real +" "+ c3.imaginary);
	}
}