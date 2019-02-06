
package exercise.java;

public class Package{

	public void display(){


		System.out.print("I am in package");
	
	}

}





import exercise.java.*;


public class PackageCalling{
	public static void main(String[] args){
		package d=new Package();
		d.display();
	}
}