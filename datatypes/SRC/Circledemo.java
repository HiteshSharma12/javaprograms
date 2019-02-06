
class Circle {
	double radius;

	double findArea(){
		return radius*radius*3.14159;
	}

	Circle()
	{
		radius=6;
	}


void displayArea(){
	System.out.print("Area="+ findArea());
   }
}
class Circledemo{
	public static void main(String[]args)
	{
		Circle c=new Circle();
		//c.radius=5;
		c.displayArea();
	}
}